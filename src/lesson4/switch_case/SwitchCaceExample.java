package lesson4.switch_case;

import java.util.Scanner;

public class SwitchCaceExample {
    public static void main(String[] args) {
        //Developer, QA, Designer, Analytic
        System.out.println("Type your profession???");
        Scanner scanner = new Scanner(System.in);
        String profession = scanner.nextLine();
        switch (profession.toLowerCase()) {
            case ("qa"):
            case ("aqa"):
                if (profession.equalsIgnoreCase("aqa")) {
                    profession = profession + " atomation master!!!";
                }
                System.out.println("Hello " + profession);
                break;
            case ("developer"):
                System.out.println("Hello Developer!!!");
                System.out.println("Do you work with backend??");
                String result = scanner.nextLine();
                switch (result) {
                    case ("yes"):
                        System.out.println("Hello back!!");
                        break;
                    case ("no"):
                        System.out.println("Hello front!!!");
                        break;
                }
                break;
            case ("designer"):
                System.out.println("Hell Designer!!!");
                break;
            case ("analytic"):
                System.out.println("Hello Analytic");
                break;
            default:
                System.out.println("There is no such profession!!!");
                scanner.close();
        }
    }
}
