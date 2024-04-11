package lesson6.my_own_methods;

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
}
