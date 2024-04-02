package hw3;

import java.util.Scanner;

public class Hw3Task4 {
    //(Використовувати оператори if-else-if)
    // Користувач вводить з клавіатури числа: Якщо число дорівнює 1, виведення на консоль “Понеділок”;
    // Якщо число дорівнює 2, виведення на консоль “Вівторок”;
    // Якщо число дорівнює 3, виведення на консоль “Середа”; Якщо число дорівнює 4, виведення на консоль “Четвер”;
    // Якщо число дорівнює 5, виведення на консоль “П'ятниця”; Якщо число дорівнює 6, виведення на консоль “Субота”;
    // Якщо число дорівнює 7, то виведення на консоль "Неділя";
    // В іншому випадку виводимо текст: "Краще б сьогодні була п'ятниця".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть натуральне число: ");
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println("Понеділок");
        }
        else if (number == 2) {
            System.out.println("Вівторок");
        } else if (number == 3) {
            System.out.println("Середа");
        } else if (number == 4) {
            System.out.println("Четвер");
        } else if (number == 5) {
            System.out.println("П'ятниця");
        } else if (number == 6) {
            System.out.println("Субота");
        } else if (number == 7) {
            System.out.println("Неділя");
        }
        else System.out.println("Краще б сьогодні була п'ятниця");
        scanner.close();
    }
}
