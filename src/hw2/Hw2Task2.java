package hw2;

public class Hw2Task2 {
    public static void main(String[] args) {
        //Створити рядок string = "Testing, is my favourite job".
        //Вивести на екран окремо кожне слово та довжину цього слова у вигляді:
        //Слово1 = (значення слова), Довжина цього слова = (значення довжини слів).
        //Слово2 = (значення слова), Довжина цього слова = (значення довжини слів).
        //і т.д.
        //Вивести на консоль true, якщо перше слово довше інших, в іншому випадку вивести false.

        String string = "Testing, is my favourite job";
        String[] strings = string.split(" ");
        System.out.println("Слово 1 = " + strings[0].replace(",", " ")
                .concat("Довжина цього слова = ") + strings[0].length());
        System.out.println("Слово 2 = " + strings[1].concat(" Довжина цього слова = ")
                + strings[1].length());
        System.out.println("Слово 3 = " + strings[2] + " Довжина цього слова = " + strings[2].length());
        System.out.println("Слово 4 = " + strings[3] + " Довжина цього слова = " + strings[3].length());
        System.out.println("Слово 5 = " + strings[4] + " Довжина цього слова = " + strings[4].length());
        System.out.println(strings[0].length() > strings[1].length() && strings[0].length() >
                strings[2].length() && strings[0].length() > strings[3].length() && strings[0].length() >
                strings[4].length());
    }
}
