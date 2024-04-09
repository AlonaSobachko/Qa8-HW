package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Hw4Task1 {
    public static void main(String[] args) throws IOException {
        //Написати програму, яка зчитуватиме введені користувачем слова з клавіатури слова,
        // і склеювати їх в одну пропозицію доти, доки користувач не введе з клавітури слово STOP.
        // Всі слова, введені до цього, повинні відобразитися в консолі однією пропозицією.
        System.out.println("Введіть слово. Стоп слово STOP");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        String word;
        while (true) {
            word = reader.readLine();
            if (word.equalsIgnoreCase("STOP"))
                break;
            else {
                words.add(word + " ");
                System.out.println("Введіть слово. Стоп слово STOP");
            }
        }
        for (int i = 0; i < words.size(); i++){
            System.out.print(words.get(i));
        }
    }
}
