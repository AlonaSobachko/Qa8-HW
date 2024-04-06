package lesson5.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysRandomClassExample {
    public static void main(String[] args) {
        // Варіант 1.
        Random randomObject = new Random();
        int randomInteger = randomObject.nextInt(-20, 21);
        System.out.println(randomInteger);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomObject.nextInt(-20, 21);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("=================");
        // Варіант 2
        int randomInt2 = (int) ((Math.random() * 41) -20); // -4 -3 -2 -1 0 1 2 3 4
        System.out.println(randomInt2);

        // Отримання випадкового елемента масиву
        String[] worlds = {"One", "Two", "Three", "Four", "Five", "Six"};
        int randomIndex = randomObject.nextInt(worlds.length);
        String randomWorld = worlds[randomIndex];
        System.out.println(randomWorld);
        System.out.println(worlds[randomObject.nextInt(worlds.length)]);
    }
}
