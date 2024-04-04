package hw3;

import java.util.Scanner;

public class Hw3Task5 {
    //Написати програму, використовуючи тернарний оператор, де користувач вводить з клавіатури два числа
    // і символ – + або % або / або *. На екран виводиться результат дії над двома введеними числами.
    // Якщо користувач ввів щось окрім даних символів, необхідно вивести 0.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int number1 = scanner.nextInt();
        System.out.println("Введіть друге числоЄ");
        int number2 = scanner.nextInt();
        System.out.println("Введіть арифметичну дію");
        char operator = scanner.next().charAt(0);
        int answer;
        boolean correct = true;
        switch (operator) {
            case '+':
               answer = number1 + number2;
                break;
            case '-':
                answer = number1 - number2;
                break;
            case '/':
                answer = number1 / number2;
                break;
            case '*':
                answer = number1 * number2;
                break;
            case '%':
                answer = number1 % number2;
                break;
            default:
                answer = 0;
                correct = false;
        }
        System.out.println(correct ? answer : 0);
        scanner.close();
    }
}
