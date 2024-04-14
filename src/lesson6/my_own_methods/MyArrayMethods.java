package lesson6.my_own_methods;

import java.util.Arrays;

public class MyArrayMethods {
    public static void arraySort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min;
            for (int a = i + 1; a < array.length; a++) {
                if (array[i] > array[a]) {
                    min = array[a];
                    array[a] = array[i];
                    array[i] = min;
                }
            }
        }
    }

    public static int returnMinFromArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int returnMaximumFromArray(int[] array){
        int maximum = array[0];
        for(int i = 0; i < array.length; i++){
            if(maximum < array[i]){
                maximum = array[i];
            }
        }
        return maximum;
    }

    public static int[] reverseSort(int[] array) {
        int[] xReverse = new int[array.length];
        int counter = 0;
        for (int i = array.length - 1; i > -1; i--) {
            xReverse[counter] = array[i];
            counter++;
        }
        return xReverse;
    }

    public static String[] addElementToArray(String[] array, String element){
        String[] names3 = Arrays.copyOf(array, array.length + 1);
        names3[names3.length-1] = element;
        return names3;
    }
}
