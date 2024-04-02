package lesson4.while_cycle;

public class WhileClassExample {
    public static void main(String[] args) {
        int iterator = 1;
        System.out.println("I am line number " + iterator++);
        System.out.println("I am line number " + iterator++);
        System.out.println("I am line number " + iterator++);
        System.out.println("I am line number " + iterator++);
        System.out.println("I am line number " + iterator++);
        System.out.println("I am line number " + iterator++);
        System.out.println("I am line number " + iterator++);
        System.out.println("I am line number " + iterator++);
        System.out.println("I am line number " + iterator++);
        System.out.println("I am line number " + iterator++);
        System.out.println("I am line number " + iterator);

        System.out.println("=========================");
        int i = 1;
        while (i < 11){
            System.out.println("I am line number " + i );
            i++;
        }

        System.out.println("===============");
        int i2 = 1;
        while (i2 < 11){
            if (i2 % 2 == 0){
                System.out.println("I am line number " + i2);
            }
            i2++;
        }
    }
}
