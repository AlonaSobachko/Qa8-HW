package lesson5.arrays;

import java.util.Arrays;

public class ManyArraysClass {
    public static void main(String[] args) {
        // Двумірний масив
        int[][] numbers = new int[3][2]; // {  {0, 0}  {0, 0}  {0, 0} }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("{");
            for (int a = 0; a < numbers[i].length; a++) {
                System.out.print(numbers[i][a] + " ");
            }
            System.out.print("\b} ");
        }
        System.out.println("");
        numbers[1][1] = 16;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("{");
            for (int a = 0; a < numbers[i].length; a++) {
                System.out.print(numbers[i][a] + " ");
            }
            System.out.print("\b} ");

        }
        System.out.println("");

        int[][] array2 = {{12, 3}, {4, 34}, {324, 0}};
        for (int i = 0; i < array2.length; i++) {
            System.out.print("{");
            for (int a = 0; a < array2[i].length; a++) {
                System.out.print(array2[i][a] + " ");
            }
            System.out.print("\b} ");
        }
        System.out.println("");

        // toString
        System.out.println("===========");
        for (int i = 0; i < array2.length; i++){
            System.out.print(Arrays.toString(array2[i]));
        }

        //Тривимірний масив
        int[][][] ints = {{{12, 43, 45}, {23, 34, 34}, {23, 34, 34}}, {{23, 34, 34}, {23, 34, 34}, {23, 34, 34}}, {{23, 34, 34}, {23, 34, 34}, {23, 34, 34}}};
    }
}
