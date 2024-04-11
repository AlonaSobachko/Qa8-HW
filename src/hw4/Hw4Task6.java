package hw4;

import java.util.Arrays;
import java.util.Random;

public class Hw4Task6 {
    //Заповнити масив на 45 елементів довільними числами від -50 до +50.
    // найти мінімальний елемент та вивести його на консоль. Знайти максимальний
    // елемент та вивести його на консоль
    public static void main(String[] args) {
        int[] array = new int[45];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(-50, 50);
            int min = array[0];
            int max = array[0];
            for (int num : array){
                if (num < min){
                    min = num;
                }
                if (num > max){
                    max = num;
                }
            }
            System.out.println("Мінімальний елемент масиву: " + min);
            System.out.println("Максимальни елемент масиву: " + max);
        }
    }
}
