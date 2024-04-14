package hw6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hw6Task1 {
    //Користувач визначає розмірність двовимірного масиву з клавіатури.
    //Масив заповнюється випадковими числами від 0 до 1000.
    //Необхідно створити одновимірний масив, що складається з максимальних значень
    //кожного окремого масиву, що входить у двовимірний.
    //Новий отриманий масив вивести на екран.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число:");
        int number1 = sc.nextInt();
        System.out.println("Введіть число:");
        int number2 = sc.nextInt();
        int[][] twoDimensionalArray = new int[number1][number2];
        Random random = new Random();
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                twoDimensionalArray[i][j] = random.nextInt(0, 1000);
            }
        }
        int[] singleArray = new int[twoDimensionalArray.length];
        for (int l = 0; l < twoDimensionalArray.length; l++) {
            singleArray[l] = returnMaximumFromArray(twoDimensionalArray[l]);
        }
        System.out.println(Arrays.toString(singleArray));
        sc.close();
    }


    public static int returnMaximumFromArray(int[] array) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}
