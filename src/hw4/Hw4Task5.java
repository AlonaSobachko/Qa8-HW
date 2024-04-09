package hw4;

import java.util.Random;
import java.util.Scanner;

public class Hw4Task5 {
    //Є одновимірний масив із 10 елементів, заповнений випадковими числами.
    // Користувач вводить із клавіатури число. Програма показує чи є таке
    // число у створеному раніше масиві.
    public static void main(String[] args) {
        int[] arrayOfNumber = new int[10];
        Random rendom = new Random();
        for (int i = 0; i < arrayOfNumber.length; i++){
            arrayOfNumber[i] = rendom.nextInt(-10, 10);
        }
        System.out.println("Введіть число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean foundNumber = false;
        for (int num : arrayOfNumber){
            if (num == number){
                foundNumber = true;
                break;
            }
        }
        if (foundNumber){
            System.out.println("Число " + number + " є у масиві.");
        }
        else {
            System.out.println("Число " + number + " не знайдено у масиві.");
        }
    }
}
