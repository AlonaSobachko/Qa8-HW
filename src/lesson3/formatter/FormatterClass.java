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
        System.out.printf("This is %2s for formatting %s", var, var2);


    }
}
