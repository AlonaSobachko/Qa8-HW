package lesson3.formatter;

public class FormatterClass {
    public static void main(String[] args) {
        // System.out.printf("строка для форматуванняб фрагмент для заміни"); -
        // форматований вивід строки
        String formatMe = "This is text for formatting";
        System.out.println();

        // String %s - значок форматор для строки
        String var = "\"TEXT\"";
        String var2 = "\"AQA8\"";
        System.out.printf("This is text for formatting %s", var);
        System.out.println();
        System.out.printf("This is %s for formatting %s", var, var2);
        System.out.println();
        System.out.printf("");
        System.out.println();
        System.out.printf("This is %2$s for formatting %s", var, var2);
        System.out.println();
        String resultFormat = String.format("This is %2$s for formatting %1$s", var, var2);
        System.out.println(resultFormat);

        System.out.println("==========");
        // char %c
        // %d - byte, short, int, long
        // %f - float, double
        System.out.printf("This is %s for formatting %c and then %d and then %f", "\"TEXT\"", 'c', 12345, 44.03);

        // boolean - %b
        System.out.println("==============");
        System.out.printf("Boolean formatted %b", 10 > 6);
        System.out.println();
        System.out.printf("Boolean formatted %b", 10 < 6);
        System.out.println();
        System.out.printf("Boolean formatted %b", 23.0);
        System.out.println();
        System.out.printf("Boolean formatted %b", null);
        System.out.println();

    }
}
