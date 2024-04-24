package hw10.task2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class ArrayIndexOutOfBoundsException extends Exception {
    public ArrayIndexOutOfBoundsException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        try {
            int index = getInputIndex();
            double result = processArray(index);
            System.out.println("Результат: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Введено некоректні дані");
        }
    }

    private static int getInputIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть індекс:");
        return scanner.nextInt();
    }

    private static double processArray(int index) throws ArrayIndexOutOfBoundsException {
        int[] array = generateRandomArray();
        if (index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Вихід за межі масиву.");
        }
        int value = array[index];
        return (double) value / array[0];
    }

    private static int[] generateRandomArray() {
        Random random = new Random();
        int size = random.nextInt(30) + 1;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(31);
        }
        return array;
    }
}