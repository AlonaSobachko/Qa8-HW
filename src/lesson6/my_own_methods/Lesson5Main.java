package lesson6.my_own_methods;

import java.util.Arrays;
import java.util.Random;

public class Lesson5Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayRandom = new int[10];
        for(int i = 0; i < arrayRandom.length; i++){
            arrayRandom[i] = random.nextInt(-30, 30);
        }
        System.out.println(Arrays.toString(arrayRandom));
        System.out.println("Min from array " + MyArrayMethods.returnMinFromArray(arrayRandom));

        MyArrayMethods.arraySort(arrayRandom);
        System.out.println(Arrays.toString(arrayRandom));
    }
}
