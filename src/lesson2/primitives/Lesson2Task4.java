package lesson2.primitives;

public class Lesson2Task4 {
     /*
        Обьявить три числовые переменные first, second, third
        Присвоить переменной first значение 5.
        Присвоить переменной second значение first Умноженное на 5.
        Присвоить переменной third значение second минус first.
        Перезаписать значение переменной first равным first умноженное на third.
        Вывеcти на экран значение first, second, third.
        */
     public static void main(String[] args) {
         int first, second, third;
         first = 5;
         second = first * 5;
         third = second - first;
         first *= third;
         System.out.println(first);
         System.out.println(second);
         System.out.println(third);
     }
}
