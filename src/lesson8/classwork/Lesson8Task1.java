package lesson8.classwork;

import java.util.Scanner;

public class Lesson8Task1 {
    //Написать метод, который будет спрашивать у пользователя ввести
// с клавиатуры предложение а после выводит в консоль из скольки слов состоит данное предложение.
// А также этот метод должен возвращать количество этих слов.*/
    public static void main(String[] args) {
        Lesson8Task1 ob = new Lesson8Task1();
        int x = ob.printAndReturnNumberOfWords();
        System.out.println(x);
    }
    public int printAndReturnNumberOfWords(){
        System.out.println("Enter your text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int countOfWords = text.split("\\s").length;
        System.out.println("Count of words from your text is: " + countOfWords);
        return countOfWords;
    }
}

