package lesson3.formatter;

import java.util.Date;

public class DataFormatter {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //%t %T
        //H - часи, М - хвилини, S - секунди, L - мілісекунди N - наносекунди
        //p - pm, am
        System.out.printf("Show time at the next format: %tH", date);
        System.out.printf("\nShow time at the next format: %tM", date);
        System.out.printf("\nShow time at the next format: %tS", date);
        System.out.printf("\nShow time at the next format: %1$tH:%1$tM:%1$tS", date);

        //A - день тижня, d - дві цифри дати, B - місяць, m - місяць у вигляді цифри
        //Y - рік, y - дві цифри року
        System.out.printf("\nShow time at the next format: %1$tA %1$td %1$tB", date);

        System.out.println("\n============");
        String todayDate = String.format("%td", date);
        System.out.println(todayDate);
        int todayDateInt = Integer.parseInt(todayDate);
        int tomorrowDate = todayDateInt + 1;
        System.out.printf("Завтра буде " + tomorrowDate + " %tB", date);
    }

}
