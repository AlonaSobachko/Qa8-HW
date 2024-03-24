package lesson1;

public class OperationsWithNumbersTypes {
    public static void main(String[] args) {
        // + - * /
        int x = 15;
        int y = 3;
        System.out.println(x/y);
        int z = x + y + 14;
        System.out.println(z);
        System.out.println(z/y);
        System.out.println("Double division");
        double doubleX = 32;
        double doubleY = 3;
        System.out.println(doubleX/doubleY);

        System.out.println("%%%%%%%%%%%%%%");
        // %
        // 32%3 = 32/3 = 10 цілих 2/3
        System.out.println(32%3);
        // 4%10 =4/10
        System.out.println(4%10);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(13%5);
        System.out.println(-13%5);
        System.out.println(13%-5);
        System.out.println(-13%-5);

    }
}
