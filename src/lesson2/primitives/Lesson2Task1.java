package lesson2.primitives;

public class Lesson2Task1 {
    //1) x = (2 - 5*(9%4 - 7))%3;
    // y = x + 3 * 2 - 46 % 2;
    // z = x%y*2;
    public static void main(String[] args) {
        int x = (2 - 5 * (9 % 4 - 7)) % 3;
        int y = x + 3 * 2 - 46 % 2;
        int z = x % y * 2;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
