package hw4;

import java.util.Scanner;

public class Hw4Task4 {
    //Перший складатиметься з наступних імен: “Петя”, “Маша”, “Олена”, “Федя”, “Саша”, “Антон”, “Гліб”.
    // Другий міститиме такі значення типу int: 10, 12, 14, 16, 18, 20. Третій міститиме такі значення:
    // “школу”, “магазин”, “церква”, “тренажерний зал”, “кіно”, “поліклініку” . Користувач вводить три
    // числа з клавіатури, які відповідатимуть індексам кожного з елементів масивів.
    // Приклад1. після введення 3,2,1: На екрані має вивестися наступне повідомлення: “Федя буде
    // йти до магазину о 14:00” Приклад2. після введення 1,2,3: На екрані має вивестися наступне
    // повідомлення: "Маша йтиме в тренажерний зал о 14:00"
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазину", "цепкву", "тренажерний зал", "кіно", "поліклініку"};
        Scanner str = new Scanner(System.in);
        System.out.println("Введіть 3 числа, які будуть слугувати індексами для " +
                "імені (від 0 до 6), часу та місця (від 0 до 5). Числа потрібно вводити через пробіл.");
        int indexName = str.nextInt();
        int indexTime = str.nextInt();
        int indexPlace = str.nextInt();
        String name = names[indexName];
        int time = times[indexTime];
        String place = places[indexPlace];
        System.out.println(name + " буде йти до " + place + " о " + time + ":00.");
        str.close();
    }
}
