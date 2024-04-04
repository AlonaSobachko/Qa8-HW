package hw3;

import java.util.Scanner;

public class Hw3Task6 {
    //Використовуючи оператор switch написати програму, яка виводить на консоль посилання для завантаження
    // програми. З вибору програм взяти: IntelliJ IDEA, Git, Java. З вибору ОС взяти: Linux, MacOS, Windows.
    // Програма повинна запитати користувача, яка програма йому цікава, також запитати яку ОС він використовує,
    //а після вивести в консоль необхідне посилання. Якщо програма з такою назвою не виводить повідомлення
    // в консоль, про те, що такої програми не існує. Якщо зазначеної користувачем ОС немає, виводиться
    // повідомлення в консоль, що такої ОС немає.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Яка програма Вас цікавить??");
        String program = scanner.nextLine();
        switch (program){
            case ("IntelliJ IDEA"):
                System.out.println("Яку ОС Ви використовуєте??");
                String operatingSystem = scanner.nextLine();
                switch (operatingSystem){
                    case ("Windows"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                        break;
                    case ("MacOS"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=mac");
                        break;
                    case ("Linux"):
                        System.out.println("https://www.jetbrains.com/idea/download/?section=linux");
                        break;
                    default:
                        System.out.println("Not found OS!!!");
                        break;
                }
                break;
            case ("Git"):
                System.out.println("Яку ОС Ви використовуєте??");
                String operatingSystem1 = scanner.nextLine();
                switch (operatingSystem1){
                    case ("Windows"):
                        System.out.println("https://git-scm.com/download/win");
                        break;
                    case ("MacOS"):
                        System.out.println("https://git-scm.com/download/mac");
                        break;
                    case ("Linux"):
                        System.out.println("https://git-scm.com/download/linux");
                        break;
                    default:
                        System.out.println("Not found OS!!!");
                        break;
                }
                break;
            case ("Java"):
                System.out.println("Яку ОС Ви використовуєте??");
                String operatingSystem2 = scanner.nextLine();
                switch (operatingSystem2){
                    case ("Windows"):
                        System.out.println("https://javadl.oracle.com/webapps/download/AutoDL?BundleId=249551_4d245f941845490c91360409ecffb3b4");
                        break;
                    case ("MacOS"):
                        System.out.println("https://javadl.oracle.com/webapps/download/AutoDL?BundleId=249545_4d245f941845490c91360409ecffb3b4");
                        break;
                    case ("Linux"):
                        System.out.println("https://javadl.oracle.com/webapps/download/AutoDL?BundleId=249540_4d245f941845490c91360409ecffb3b4");
                        break;
                    default:
                        System.out.println("Not found OS!!!");
                        break;
                }
                break;
            default:
                System.out.println("Not found program!!!");
                break;
        }
        scanner.close();
        }
    }
