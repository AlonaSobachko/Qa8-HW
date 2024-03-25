package lesson2.primitives;

public class Lesson2Task2 {
    // x = 5;
    // y = 4 + x++;
    // y+= --y - x;
    //  z = y++;
    public static void main(String[] args) {
        int x = 5;
        int y = 4 + x++;
        y+= --y - x;
        int z = y++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
