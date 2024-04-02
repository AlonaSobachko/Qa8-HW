package hw3;

import java.util.Scanner;

public class Hw3Task1 {
    //Ви маєте рядок “Я тестую чудово. Що ще потрібно?”, яку потрібно ввести з клавіатури у консоль.
    // Необхідно за допомогою тільки методу next() класу Scanner (не використовуємо метод nextLine())
    // присвоїти змінним типу String наступні значення: string1 = Я string2 = тестую string3 = чудово
    // string4 = Що ще потрібно? Крім string1, string2, string3, string4 нових змінних створювати не можна.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст ");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next();
        System.out.println("String 1 - " + string1);
        System.out.println("String 2 - " + string2);
        System.out.println("String 3 - " + string3);
        System.out.println("String 4 - " + string4);

    }
}
