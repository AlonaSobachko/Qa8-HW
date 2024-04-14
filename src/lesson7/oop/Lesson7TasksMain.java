package lesson7.oop;

import java.util.Date;

public class Lesson7TasksMain {
    public static void main(String[] args) {
        Lesson7Tasks variable = new Lesson7Tasks();
        int x = 4;
        int y = 87;
        variable.methodSecondTask(x, y);
        variable.methodForFirstTask(4, 87);
        System.out.println("==================");
        System.out.println("Sum of 4 and 87 equals " + variable.methodSecondTask(4, 87) + ".");
        int[] arrayInt = {23, 43, 5, 5, 23, 343};
        int[] arrayInt2 = {4444, 4, 5, 5};
        variable.printArrayOnIntToConsole(arrayInt);
        variable.printArrayOnIntToConsole(arrayInt2);
        variable.printArrayOnIntToConsole(new int[]{3, 66, 55, 222, 545});
        System.out.println("=====================");
        Date myDate = new Date();
        variable.dateProviderV1(myDate);
        variable.dateProviderV1(new Date());
        System.out.println("=================");
        variable.dateProviderV2();
        System.out.println("=======================");
        variable.printTriangleV1();
        variable.printTriangleV2(7);
    }
}
