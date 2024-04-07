package lesson5.for_each;

import java.util.Arrays;
import java.util.Random;

public class ForEachExample {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt(-20, 21);
        }
        for (int number: array){
            System.out.print(number + " ");
        }
        System.out.println("\n==============");
        int[] array2 = new int[10];
        System.out.println(Arrays.toString(array2));
        for (int number: array2) {
            number = new Random().nextInt(-20, 21);
        }
        System.out.println(Arrays.toString(array2));
    }
}
