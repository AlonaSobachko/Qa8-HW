package lesson7.oop;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

public class Lesson7Tasks {
    // 1) Написать метод, принимающий в качестве параметров два числа,
    // который будет выводить на консоль сумму этих двух чисел.
    // принимает - не возвращает
    public void methodForFirstTask(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Sum of " + number1 + " and " + number2 + " equals " + sum + ".");
    }

    //2) Написать второй метод, который будет возвращать сумму двух чисел,
    // которые он будет принимать в параметре метода.
    // принимает - возвращает
    public int methodSecondTask(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    //3)Написать метод, который будет выводить массив чисел в консоль
    //принимает массив чисел, ничего не возвращает
    public void printArrayOnIntToConsole(int[] array) {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]).append(", ");
        }
        stringBuilder.append("]");
        String result = String.valueOf(stringBuilder);
        System.out.println(result.replace(", ]", "]"));
    }

    //4) Написать метод, который будеть выводить в консоль какое точное время и дата сейчас
    //на вашем устройстве. В формате такого типа: 12 June 2022 year, 14:55
    public void dateProviderV1(Date currentDate) {
        System.out.printf("%1$td %1$tB %1$tY year, %1$tH:%1$tM\n", currentDate);
    }

    public void dateProviderV2() {
        System.out.printf("%1$td %1$tB %1$tY year, %1$tH:%1$tM\n", new Date());
    }

    //Написать метод, который будет это делать!!!
    //Необходимо вывести на экран перевернутый прямоугольный
    //треугольник прямым углом сверху в левой части.
    //Для вывода использовать условные операторы, циклы.
    //Команду System.out.println(); System.out.print(); и можно использовать только с одним символом *.
    //Пользователь вводит с клавиатуры число, которое будет считаться основанием треугольника,
    //а программа выводит сам треугольник.
    //Пример с числом 7:
    //         *******
    //         ******
    //         *****
    //         ****
    //         ***
    //         **
    //         *
    //
    //         *******
    //         *    *
    //         *   *
    //         *  *
    //         * *
    //         **
    //         *
    // Необходимо написать программу для вывода вначале заполненного, а потом и пустого треугольника.
    public void printTriangleV1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int counter = scanner.nextInt();
        for (int i = counter; i > 0; i--) {
            System.out.println();
            for (int j = i; j > 0; j--) {
                System.out.print('*');
            }
        }
    }

    public void printTriangleV2(int x) {
        for (int i = x; i > 0; i--) {
            System.out.println();
            for (int j = i; j > 0; j--) {
                if (i == x || j == 1 || i == j) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public void arraySort(int[] array){
        for(int i = 0; i < array.length; i++){
            int min;
            for (int a = i + 1; a < array.length; a++){
                if(array[i] > array[a]){
                    min = array[a];
                    array[a] = array[i];
                    array[i] = min;
                }
            }
        }
    }
}
