package hw1;

public class CheekingThePerformingOfTasks {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        // mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
        // volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
        // opel = mercedes%volvo;
        // Необхідно обчислити значення mersedes, volvo і opel.
        int mercedes = (1 + (3 * (2 - 4)) % 3 + (11 - 7) * 2) + (3 - 5) * 3;
        int volvo = volvo = mercedes * 3 - 9 % mercedes + 16 - (-mercedes);
        int opel = opel = mercedes % volvo;
        System.out.println("mercedes " + mercedes);
        System.out.println("volvo " + volvo);
        System.out.println("opel " + opel);

        System.out.println("Задача 2");
        //int x = 3;
        //   int y = ++x*2;
        //   x+=-y*3 + ++x + --y;
        //   y+=(-x++)%3;
        //   int z = x + y;
        //   Необхідно обчислити значення x, y і z.
        int x = 3;
        int y = ++x * 2;
        x += -y * 3 + ++x + --y;
        y += (-x++) % 3;
        int z = x + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("Задача 3");
        //boolean a = (85/5 + (19-25%3))==(-3)*(-2+14/(-2))&&(2%7-1)*3<=2;
        //   boolean b = !a||a&&!a;
        //   boolean c = false&&!true||!((23%3+14)%3==7);
        //   Необхідно обчислити значення a, b і c.
        boolean a = (85 / 5 + (19 - 25 % 3)) == (-3) * (-2 + 14 / (-2)) && (2 % 7 - 1) * 3 <= 2;
        boolean b = !a || a && !a;
        boolean c = false && !true || !(((23 % 3 + 14) % 3) == 7);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
