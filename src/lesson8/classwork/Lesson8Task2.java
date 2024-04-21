package lesson8.classwork;

import javax.xml.crypto.Data;
import java.util.Date;

public class Lesson8Task2 {
    /*        2) Написать метод, который в параметры принимает ваш год рождения.
Данный метод возвращает int который равен вашему возрасту.
Используем класс Date как на прошлом занятии.
        (P.s пока не затрагиваем момент месяца рождения,
останавливаемся только на разнице лет.)*/
    public static void main(String[] args) {
        System.out.println("My age is: " + new Lesson8Task2().returnMyCurrentAge(2001));
    }
    public int returnMyCurrentAge(int yearOfBirth){
        /*Date date = new Date();
        String yearNow = String.format("%tY", date);
        int currentYear = Integer.parseInt(yearNow);
        int myCurrentYear = currentYear - yearOfBirth;*/
        return Integer.parseInt(String.format("%tY", new Date())) - yearOfBirth;
    }

}
