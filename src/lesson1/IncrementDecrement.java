package lesson1;

public class IncrementDecrement {
    public static void main(String[] args) {
        // ++
        // a++ equals a = a + 1
        int a = 13;
        a++;
        System.out.println(a);
        int c = 13;
        c = c*3;
        System.out.println("c = " + c);

        // a-- equals a = a - 1
        c--;
        System.out.println(c);

        // a+=7 a = a + 7
        int b = 2;
        b+=4;
        System.out.println(b);
        b*=2;
        System.out.println(b);
        b-=2;
        System.out.println(b);
        b/=5;
        System.out.println(b);

    }
}
