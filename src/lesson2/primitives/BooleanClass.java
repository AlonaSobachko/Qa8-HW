package lesson2.primitives;

public class BooleanClass {
    public static void main(String[] args) {
        boolean myBoo = false;
        boolean myBoo2 = true;
        System.out.println(myBoo);
        System.out.println(myBoo2);
        System.out.println("==============");
        //==
        int x = 3;
        int y = 5;
        int z = 5;
        boolean resultOfEquals = x == y;
        System.out.println(resultOfEquals);
        System.out.println(y == z);
        System.out.println("==============");

        // !=
        System.out.println(x != z);
        System.out.println("==============");

        // > < >= <=
        System.out.println(10 < 13);
        System.out.println(13 < 10);
        System.out.println(3 <= 3);

        System.out.println("===============");
        //System.out.println(true != true);
        // System.out.println(true == false);
        //System.out.println(false == false);
        //System.out.println(false != true);
        //System.out.println(!false);
        //System.out.println(!true);

        // || if
        System.out.println(true || false || true);
        System.out.println(44 > 3 || 4 == 7 || 12 != 6);
        System.out.println("==================");

        // end &&
        System.out.println(22 < 8 && 43 % 5 == 7);
    }
}
