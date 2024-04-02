package hw2;

public class Hw2Task3 {
    public static void main(String[] args) {
        //При застосуванні до масиву рядків поля length можна дізнатися скільки елементів знаходиться у масиві.
        //Тобто якщо у вас є масив рядків типу: String[] arrayOfString; то при виклику поля lenth:
        //int size = arrayOfString.length;
        //можна отримати скільки символів знаходиться в даному масиві.
        //Спробувати, використовуючи метод split та інформацію з приводу поля length, вивести на екран кілька разів
        //символ 'a' зустрічається у рядку:
        // "Completely random text in English. In it, we just need to determine how man times the character 'a'
        // occurs there. And we can use the split method and the length method."
        //Розв'язати це завдання з обліків верхнього та нижнього регістру символу 'a'.

        String string = "Completely random text in English. In it, we just need to determine how man times" +
                "the character 'a' occurs there. And we can use the split method and the length method.";
        String[] arrayOffString = string.split("a");
        //System.out.println(arrayofstring.length);
        System.out.println("Кількість вхиодження символу 'a' з обліку нижнього регістру " + (arrayOffString.length - 1));
        String[] arrayofstring1 = string.split("A");
        //System.out.println(arrayofstring1.length);
        System.out.println("Кількість входження символу 'А' з оліку верхнього регістру " + (arrayofstring1.length-1));
        System.out.println("Загальна кількість входження символу 'а' незалежно від регістру " + (arrayOffString.length - 1
        + arrayofstring1.length - 1));
    }
}