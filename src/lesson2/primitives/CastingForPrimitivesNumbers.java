package lesson2.primitives;

public class CastingForPrimitivesNumbers {
    public static void main(String[] args) {
        byte x = 45;
        int y = x;
        System.out.println(x);
        System.out.println(y);

        System.out.println("=================");
        int a = 17;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("==================");
        int c = 256;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d);
    }
}
