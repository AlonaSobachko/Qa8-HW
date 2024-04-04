package hw3;

import java.util.Scanner;

public class Hw3Task5 {
    //Написати програму, використовуючи тернарний оператор, де користувач вводить з клавіатури два числа
    // і символ – + або % або / або *. На екран виводиться результат дії над двома введеними числами.
    // Якщо користувач ввів щось окрім даних символів, необхідно вивести 0.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веведіть два числа та бажану дію, яку необхідно виканати");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        String operation = scanner.nextLine();

    }
}
