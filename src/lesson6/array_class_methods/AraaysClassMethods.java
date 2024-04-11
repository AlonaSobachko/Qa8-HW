package lesson6.array_class_methods;

import lesson6.my_own_methods.MyArrayMethods;

import java.util.Arrays;

public class AraaysClassMethods {
    public static void main(String[] args) {
        // sort() сортування масиву за зростанням
        int[] x = {55, 23, 4, -5, 23, -66, -4, 333, 12};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

        x = MyArrayMethods.reverseSort(x);
        System.out.println(Arrays.toString(x));

        String[] names = {"One", "Two", "Max", "Ivan"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // fill заповнює масив значенням
        System.out.println("===================");
        String[] strings = new String[10];
        Arrays.fill(strings, "x");
        System.out.println(Arrays.toString(strings));

        // equals
        System.out.println("======================");
        int[] array1 = {55, 23, 4, -5, 23, -66, -4, 333, 12};
        int[] array2 = {55, 23, 4, -5, 23, -66, -4, 333, 12};
        System.out.println(array1.equals(array2));
        System.out.println(Arrays.equals(array1, array2));

        // deep вивід в консоль багатомірних масивів
        System.out.println("=================");
        int[][] numbers1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] numbers2 = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(Arrays.deepEquals(numbers1, numbers2));

        // copyOf копіює один масив з іншого
        System.out.println("===================");
        String[] names2 = {"One", "Two", "Max", "Ivan"};
        String[] name = Arrays.copyOf(names2, names2.length);
        System.out.println(Arrays.toString(name));
        String[] names3 = Arrays.copyOf(names2, names2.length + 1);
        names3[names3.length-1] = "Alona";
        System.out.println(Arrays.toString(names3));
        names2 = names3;
        System.out.println(Arrays.toString(names2));

        // personal method for adding string to array
        System.out.println("===================");
        String[] names4 = {"One", "Two", "Max", "Ivan"};
        names4 = MyArrayMethods.addElementToArray(names4, "Sergey");
        System.out.println(Arrays.toString(names4));

        //System.arraycopy() - специальный метод для копирования массивов
        //первый параметр - это массив из которого нужно копировать данные,
        //второй параметр - индекс элемента массива с которого мы начинаем копирование
        //третий параметр - массив в который мы будем вставлять элементы
        //четвертый параметр -индекс элемента массива с которого мы начинаем вставлять скопированные данные
        //пятый параметр - количество копируемых элементов
        System.out.println("=======================");
        int[] arrayParent = {55, 23, 4, -5, 23, -66, -4, 333, 12};
        int[] arrayChild = new int[arrayParent.length];
        System.arraycopy(arrayParent, 2, arrayChild, 1, 6);
        System.out.println(Arrays.toString(arrayChild));

        // compare
        int[] compare1 = {55, 23, 4, -5, 23, -66, -4, 333, 12};
        int[] compare2 = {55, 23, 4, -5, 23, -66, -4, 333, 12};
        int[] compare3 = {55, 23, 4, -5, -66, -4, 333, 12};
        System.out.println(Arrays.compare(compare1, compare2));
        System.out.println(Arrays.compare(compare1, compare3));
    }
}
