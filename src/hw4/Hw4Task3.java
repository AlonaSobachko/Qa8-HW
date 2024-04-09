package hw4;

import java.util.Scanner;

public class Hw4Task3 {
    public static void main(String[] args) {
        System.out.println("Введіть максимальну вагу, яку може зберігати склад");
        Scanner scanner = new Scanner(System.in);
        int maxCapacity = scanner.nextInt();
        int currentCapacity = maxCapacity;
        while (currentCapacity > 0){
            System.out.println("На складі залишилося місця для " + currentCapacity + " кг. металу");
            System.out.println("Введіть вагу, яку бажаєте додати на склад:");
            int weight = scanner.nextInt();
            if (weight <= 5){
                System.out.println("Замала вага!!! Мінімальна вага 5 кг.");
                continue;
            }
            if (weight > currentCapacity){
                System.out.println("Ліміт перевищено!!!");
                continue;
            }
            currentCapacity -= weight;
            System.out.println("На склад прийнято " + weight + " кг. металу!!");
        }
        System.out.println("Місце на складі зацінчилося!!!!");
        scanner.close();
    }
}
