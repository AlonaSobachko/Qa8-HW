package lesson2.primitives;

public class Lesson2Task3 {
    // boolean a = 3 <= (2 + 30) % 7;
    // boolean b = !true || false && true;
    // boolean c = a != (17 < 3) || b == false;

    public static void main(String[] args) {
        boolean a = 3 <= (2 + 30) % 7;
        boolean b = !true || false && true;
        boolean c = a != (17 < 3) || b == false;
        System.out.println(a + " " + b + " " + c);

        System.out.println("===================");
        int number = 5;
        System.out.println("Число " + number + " парне??? ");
        System.out.println(number % 2 == 0);
    }
}
