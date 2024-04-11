package lesson6.arrays_methods_personal;

import java.util.Arrays;
import java.util.Random;
public class ArraySortClass {
    public static void main(String[] args) {
        //За зростанням
        Random random = new Random();
        int[] arrayRandom = new int[10];
        for (int i = 0; i < arrayRandom.length; i++){
            arrayRandom[i] = random.nextInt(-30, 30);
        }
        System.out.println(Arrays.toString(arrayRandom));
        for (int i = 0; i < arrayRandom.length; i++){
            int min;
            for (int a = i + 1; a < arrayRandom.length; a++){
                if (arrayRandom[i] > arrayRandom[a]){
                    min = arrayRandom[a];
                    arrayRandom[a] = arrayRandom[i];
                    arrayRandom[i] = min;
                }
            }
        }
        System.out.println(Arrays.toString(arrayRandom));
    }
}
