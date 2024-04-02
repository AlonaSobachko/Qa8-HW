package lesson4.ternary;

import java.util.Scanner;

public class TernaryOperatorClass {
    public static void main(String[] args) {
        //операто з присвоєнням, можна прирівняти значення певній перемінній
        //умова ? вираз1 : вираз2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your age: ");
        int age = scanner.nextInt();
        String massageToPrint = age > 18 ? "You are adult" : "Go to school";
        System.out.println(massageToPrint);

        // Чи входить введене число в інтервал від 5 до 100
        System.out.println("Insert your age: ");
        int number = scanner.nextInt();
        String result;
        String positiveResult = "Введене число входить в інтервал";
        String negativeResult = "Введене число не входить в нтервал";
        result = number < 5 ? negativeResult : number > 100 ? negativeResult : positiveResult;
        String result2 = number < 5 || number > 100 ? negativeResult : positiveResult;
        System.out.println(result);
        System.out.println(result2);
        scanner.close();
    }
}
