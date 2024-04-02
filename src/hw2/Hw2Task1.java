package hw2;

public class Hw2Task1 {
    public static void main(String[] args) {
        //Створити змінну string1 = "This line that i want to cut, cause it is too long".
        //Створити рядок string2 у якому має бути розміщено значення рядка string1,
        //Обрізане до "This line that i want to cut, cause".
        //Створити рядок string3 на основі string2 який міститиме значення
        //"This line that don't want to cut, cause it is perfect".
        //Вивести на консоль кожне повідомлення та його довжину.

        String string1 = "This line that I want to cut, cause it is too long";
        String string2 = string1.substring(0, 35);
        String string3 = string2.replace("I", "don`t").concat(" it is perfect");
        System.out.println(string1);
        System.out.println("Довжина string1 дорівнює " + string1.length());
        System.out.println(string2);
        System.out.println("Довжина string2 дорівнює " + string2.length());
        System.out.println(string3);
        System.out.println("Довжина string3 дорівнює " + string3.length());

    }
}
