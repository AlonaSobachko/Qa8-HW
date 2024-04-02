package lesson4.if_else;

import java.util.Scanner;

public class IfElseClass {
    public static void main(String[] args) {
        /*
        if(умова) {
        якщо умова == True
        }
        else {
        якщо умова == False
        }
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some number");
        int number = scanner.nextInt();
        if (number > 0) {
            if (number == 300)
                System.out.println("Your are lucky!!! You won!!! You`ve enter 300");
           else System.out.println("Your print number " + number + " is positive");
        } else if (number < 0) {
            System.out.println("Your print number " + number + " is negative");
        } else
            System.out.println("Your insert is zero");
        scanner.close();
    }
}
