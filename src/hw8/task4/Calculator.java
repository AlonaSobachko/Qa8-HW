package hw8.task4;

import java.util.Scanner;

public class Calculator {
    //Створити клас калькулятор.
    //У ньому створити методи^
    // • summ,
    // • minus,
    // • multiply,
    // • division.
    //(Додавання, віднімання, множення та поділ відповідно.)
    //Кожен метод приймає як параметри два значення типу double. І виводить у консоль результат дії.
    //Також у класі є метод старт. Який виводить повідомлення в консоль, що калькулятор запущено.
    // І пропонує ввести дію у вашій консолі.
    //Калькулятор повинен приймати лише такі типи дій:
    //2+4; - приклад синтаксису додавання;
    //5-6; - приклад синтаксису віднімання;
    //25*3; - Приклад синтаксису множення;
    //34/3; - Приклад синтаксису поділу;
    //Після введення на консоль виводиться відповідь цієї дії. І потім знову виводиться повідомлення
    // про пропозицію ввести дію. Програма закривається після введення Stop. Перед закриттям на консоль має виводитись повідомлення:
    //"Калькулятор закрито".
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void sum(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void minus(double a, double b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public void multiply(double a, double b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public void division(double a, double b) {
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Ділення на нуль неможливе.");
        }
    }

    public void start() {
        System.out.println("Калькулятор запущено.");
        System.out.println("Доступні операції: +, -, *, /");
        System.out.println("Для завершення введіть 'Stop'.");
        while (true) {
            System.out.print("Введіть дію (вводити дані потрібно через пробіл): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Калькулятор закрито.");
                break;
            }
            String[] parts = input.split(" ");
            if (parts.length != 3) {
                System.out.println("Неправильний формат виразу. Спробуйте ще раз.");
                continue;
            }
            double num1, num2;
            try {
                num1 = Double.parseDouble(parts[0]);
                num2 = Double.parseDouble(parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("Неправильний формат чисел. Спробуйте ще раз.");
                continue;
            }
            switch (parts[1]) {
                case "+":
                    sum(num1, num2);
                    break;
                case "-":
                    minus(num1, num2);
                    break;
                case "*":
                    multiply(num1, num2);
                    break;
                case "/":
                    division(num1, num2);
                    break;
                default:
                    System.out.println("Неправильна операція. Спробуйте ще раз.");
            }
        }
        scanner.close();
    }

    public void close() {
        scanner.close();
    }
}
