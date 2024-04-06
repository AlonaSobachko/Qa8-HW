package lesson5.tasks;

import java.util.Scanner;

public class Lesson5Task3 {
    // Написать программу, которая будет просить ввести пользователя с клавиатуры число до тех пор
    //    пока он не введет число 13. Также программа будет выводить в консоль число, введеное пользователем,
    //    если оно четное
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = sc.nextInt();
        while (a != 13) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            System.out.println("Введіть число");
            a = sc.nextInt();
        }
        sc.close();
    }
}
