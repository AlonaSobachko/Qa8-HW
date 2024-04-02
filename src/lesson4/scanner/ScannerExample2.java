package lesson4.scanner;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner scannerForLesson4 = new Scanner(System.in);
        //Метод next забирає слово до пробілу
        //"My String for input from keyboard"
        System.out.println("Insert same text:");
        String text = scannerForLesson4.next();
        System.out.println(text);
        System.out.println(scannerForLesson4.next());
        System.out.println(scannerForLesson4.next());
        //System.out.println(scannerForLesson4.nextLine());
        System.out.println(scannerForLesson4.nextLine().trim());
        scannerForLesson4.close();
    }

}
