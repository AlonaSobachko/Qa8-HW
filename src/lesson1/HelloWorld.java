package lesson1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("Задача 1");
        System.out.println("Привіт!");
        System.out.println();
        System.out.println("Моє ім'я занадто значиме, щоб я говорив його вголос.");
        System.out.println("А ти хто?");

        System.out.println("Задача 2");
        System.out.println("кон" + "соль");
        System.out.println("бал" + "кон");
        System.out.println("бал" + "бес");

        System.out.println("Задача 1.1");
        int a = 5;
        int b = 20;
        int z = a + b;
        System.out.println(a + b);
        System.out.println("z = " + z);

        System.out.println("Задача 2.1");
        double x = 99.0;
        double y = 0.9;
        boolean isTrue = false;
        String plus = "+";
        System.out.println(x + plus + y + "= 100 - це " + isTrue);

        System.out.println("Задача 2.1");
        // s = a * b
        double m = 20.1;
        double n = 33.6;
        double square = m * n;
        System.out.println("Square = " + square);

        System.out.println("Задача 2.2");
        long populat = 7600000000L;
        long cash = 450000000000L;
        long r = cash/populat;
        System.out.println("Dollars " + r);
    }
}
