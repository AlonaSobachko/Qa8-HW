package lesson6.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lesson6Task2 {
    /*Заполнить массив на 10 элементов случайными числами
    от -50 до +50. Вывестив консоль сам массив.
    Вывести в консоль сумму всех его элементов.
    */
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumber = new int[10];
        int sum = 0;
        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = random.nextInt(-50, 50);
            sum = sum + randomNumber[i];
        }
        System.out.println(Arrays.toString(randomNumber));
        System.out.println(sum);
    }
}
