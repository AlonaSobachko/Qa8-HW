package lesson6.tasks;

import java.util.Scanner;

public class Lesson6Task1 {
    /* Пользователь вводит с клавиатуры число, а на консоль выводится квадрат из звездочек
    со стороной равной этому числу.
    Пример: Пользователь ввел 5, вывод в консоль:
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert some number: ");
        int number = sc.nextInt();
        char symbol = '*';
        for (int i = 0; i < number; i++){
            for (int l = 0; l < number; l++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
