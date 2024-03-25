package lesson2.primitives;

public class PostfixAndPrefixIncrAndDecr {
    public static void main(String[] args) {
        // постфіксний інкремент
        int a = 5;
        System.out.println(a++); //a = a + 1; a = 6
        System.out.println(a);
        System.out.println("========================");
        // префіксний інкремент
        int b = 5;
        System.out.println(++b);
        System.out.println(b);
        System.out.println("========================");
        // постфіксний декремент
        int c = 5;
        System.out.println(c--); // c = c - 1; c = 4
        System.out.println(c);
        System.out.println("========================");
        // префіксний декремент
        int d = 5;
        System.out.println(--d);
        System.out.println(d);
    }
}
