package hw3;

import java.util.Scanner;

public class Hw3Task3 {
    //За допомогою тернарного оператора необхідно отримати різницю двох чисел, введених з клавіатури,
    // і завжди віднімати від більшого менше. Вивести цю різницю в консоль.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть два числа");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int result1 = number1 - number2;
        int result2 = number2 - number1;
        int difference;
        difference = number1 > number2 ? result1 : number2 > number1 ? result2 : result1;
        System.out.println(difference);
        sc.close();
    }
}
