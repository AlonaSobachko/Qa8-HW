package hw3;

import java.util.Scanner;

public class Hw3Task2 {
    //Користувач вводить з клавіатури три цілі значення.
    // На екран виводиться інформація, чи можна з цих сторін побудувати трикутник.
    // (Необхідно згадати правило побудови трикутника з трьох сторін).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть три цілі числа, які будуть відповідати сторонам трикутника");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            System.out.println("Із заданих сторін можна побудувати трикутник");
        } else System.out.println("Із заданих сторін не можна побудувати трикутник");
        scanner.close();
    }
}
