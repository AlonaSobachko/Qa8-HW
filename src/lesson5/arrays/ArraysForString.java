package lesson5.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysForString {
    public static void main(String[] args) {
        String[] arrayString = new String[4];
        System.out.println(Arrays.toString(arrayString));

        //Вручну
        arrayString[0] = "Text";
        arrayString[3] = "text";
        System.out.println(Arrays.toString(arrayString));

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Insert text");
        //arrayString[2] = sc.nextLine();
        //System.out.println(Arrays.toString(arrayString));

        //Явна ініціалізація
        System.out.println("===========");
        String[] arrayString2 = {"Text, bdfg, scanner, text"};
        System.out.println(Arrays.toString(arrayString));

        Scanner[] scanners = new Scanner[4];
        scanners[0] = new Scanner(System.in);
        System.out.println(Arrays.toString(scanners));

        System.out.println("=============");
        Object[] objects =new Object[3];
        objects[0] = 13;
        objects[1] = "String";
        objects[2] = new Scanner(System.in);
        System.out.println(Arrays.toString(objects));
    }
}
