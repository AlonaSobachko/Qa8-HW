package hw4;
import java.util.Scanner;

public class Hw4Task2 {
    //Написати програму в якій користувач вводить з клавіатури число, а програма визначає,
    // є поліндромом чи ні. І виводить цю інформацію на екран.
    public static void main(String[] args) {
        System.out.println("Введіть число");
        Scanner str = new Scanner(System.in);
        int number = str.nextInt();
        if (isPalindrome(number)){
            System.out.println("Це паліндром");
        }
        else {
            System.out.println("Це не паліндром");
        }
        str.close();
    }
    public static boolean isPalindrome (int number) {
        int reversedNumber = 0;
        int origonNumber = number;
        while (number != 0){
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        return origonNumber == reversedNumber;
    }
}