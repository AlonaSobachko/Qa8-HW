package lesson5;

import java.util.Scanner;

public class Lesson5Task2 {
    //)Программа просит ввести с клавиатуры число.
    //При помощи тернарного оператора вывести в консоль сообщение типа String,
    //является ли введенное число
    //больше нуля, меньше нуля, или оно равно нулю.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        int number = scanner.nextInt();
        String result = number > 0 ? "Більше нуля" : number < 0 ? "Менше нуля" : "Рівне нулю";
        System.out.println(result);
        scanner.close();
    }
}
