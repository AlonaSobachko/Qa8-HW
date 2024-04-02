package lesson4.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //Для отриманя строки nextLine - забирає строку до пробілу
        Scanner scannerForLesson4 = new Scanner(System.in);
        System.out.println("Insert some text: ");
        String textFromScanner = scannerForLesson4.nextLine();
        System.out.println(textFromScanner);
        String[] worldsFromScannerFromScanner = textFromScanner.split("\\s");
        String lastWorld = worldsFromScannerFromScanner[worldsFromScannerFromScanner.length-1];
        System.out.println("Final world from textFromScanner is \"" + lastWorld + "\"");

        //Для отримвння числа
        System.out.println("Inter some number:");
        int myIntFromScanner = scannerForLesson4.nextInt();
        System.out.println("Number from keyboard is \"" + myIntFromScanner + "\"");

        //Для отримвння числа з плаваючою тоскою
        System.out.println("Inter some double:");
        double myDoubleFromScanner = scannerForLesson4.nextDouble();
        System.out.println("Double from keyboard is \"" + myDoubleFromScanner + "\"");
    }
}