package lesson3.formatter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateExample2 {
    public static void main(String[] args) {
        //Getting today`s day
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //Getting tomorrow`s day
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);

        //Get Month of tomorrow
        Month month = tomorrow.getMonth();
        System.out.println(month);

        //DayOfWeek for tomorrow
        DayOfWeek DayOfWeekTomorrow = tomorrow.getDayOfWeek();
        System.out.println(DayOfWeekTomorrow);

        //number of day for tomorrow
        int dateOfMonth = tomorrow.getDayOfMonth();
        System.out.println(dateOfMonth);
        System.out.println(dateOfMonth + " " + month + " " + DayOfWeekTomorrow);

        String forLocalRevert = String.valueOf(today);
        System.out.println(forLocalRevert);
        String[] text = forLocalRevert.split("-");
        String result = text[2] + "-" + text[1] + "-" + text[0];
        System.out.println(result);
    }

}
