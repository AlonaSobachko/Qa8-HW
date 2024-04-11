package hw1;

public class Task1AnotherSolution {
    //Створити дві змінні типу int:
    //   int a = 7;
    //   int b = 9;
    //   Поміняти між собою значення змінних a і b.
    //   Створювати нові змінні не можна.
    //   Можна застосовувати лише арифметичні дії до змінних a та b.
    //   Вивести в консоль значення змінних a та b після їх перевизначення.
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}