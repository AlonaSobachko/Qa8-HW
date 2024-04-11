package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5FinalTask {
    //ользователь вводит строку с клавиатуры. Все цифры из данной строки
    //должны быть помещены в массив. Массив необходимо отсортировать по возрастанию
    //и вывести на экран.
    //afbasfb89abfafb74kjbkljashg904j8;kj;h498
    public static void main(String[] args) {
        /*char numeric = '6';
        char nonNumeric = 'e';
        System.out.println(Character.isDigit(numeric));
        System.out.println(Character.isDigit(nonNumeric));
        //  \\d - розбиває за числами
        String withNumbers = "wfefe3lklkj4lkjlk4";
        String withoutNumbers = "lklklklklkj";
        System.out.println(withNumbers.split("\\d").length);
        System.out.println(withoutNumbers.split("\\d").length);*/
        System.out.println("Введіть рядок:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String result = "";
        if (text.split("\\d").length == 1) {
            System.out.println("В даному рядку немає числових значень");
        } else {
            //afbasfb89abfafb74kjbkljashg904j8;kj;h498
            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i))) {
                    result = result + text.charAt(i);
                    while (i + 1 != text.length() && Character.isDigit(text.charAt(i + 1))) {
                        i = i + 1;
                        result = result + text.charAt(i);
                    }
                    result = result + " ";
                }
            }
        }
        result = result.trim();
        System.out.println(result);
        String[] resultArrayString = result.split("\\s");
        int[] arrayInt = new int[resultArrayString.length];
        for (int i = 0; i < resultArrayString.length; i++) {
            arrayInt[i] = Integer.parseInt(resultArrayString[i]);
        }

        System.out.println(Arrays.toString(arrayInt));
        for (int i = 0; i < arrayInt.length; i++) {
            int min;
            for (int a = i + 1; a < arrayInt.length; a++) {
                if (arrayInt[i] > arrayInt[a]) {
                    min = arrayInt[a];
                    arrayInt[a] = arrayInt[i];
                    arrayInt[i] = min;
                }
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}
