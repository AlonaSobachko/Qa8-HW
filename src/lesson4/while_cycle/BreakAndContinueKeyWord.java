package lesson4.while_cycle;

public class BreakAndContinueKeyWord {
    public static void main(String[] args) {
        int i = 1;
        while (true){
            if (i == 33){
                break;
            }
            if (!(i % 2 == 0)){
                i++;
                continue;
            }
            System.out.println("Number " + i);
            i++;
        }
    }
}
