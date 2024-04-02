package lesson4.while_cycle;

import java.util.Scanner;

public class DoWhileClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number: ");
        int number = scanner.nextInt();
        int number2 = number;

        while (number > 0){
            System.out.println(number);
            number--;
        }

        System.out.println("============");
        do{
            System.out.println(number2);
            number2--;
        }while (number2 > 0);
        // do while виконує дію а потім перевіряє умову, хоча б 1 раз умова виконається
    }
}
