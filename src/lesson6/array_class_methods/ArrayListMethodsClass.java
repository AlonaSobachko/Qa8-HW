package lesson6.array_class_methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsClass {
    public static void main(String[] args) {
        int[] array = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);

        //add
        arrayList.add(30);
        arrayList.add(31);
        arrayList.add(32);
        System.out.println(arrayList);
        arrayList.add(2, 100500);
        System.out.println(arrayList);

        // toArray[] + пряма ініціалізаці
        ArrayList<String> arrayListString = new ArrayList<>(Arrays.asList("One", "Two", "Max", "Ivan"));
        System.out.println(arrayListString);
        Object[] arrayFromList = arrayListString.toArray();
        System.out.println(Arrays.toString(arrayFromList));

        // size() equals length
        System.out.println("Розмір мого arrayList = " + arrayListString.size());
        System.out.println("=======================");

        //get() отрм елемента за індексом
        System.out.println("Другий елемент мого arrayList = " + arrayListString.get(1));

        //Вивід в консоль довжину кожного слова arrayList + indexOf()
        for (int i = 0; i < arrayListString.size(); i++) {
            System.out.println("Довжина слова під номером " + (i + 1) + " дорівнює " +
                    arrayListString.get(i).length() + " символи");
        }
        System.out.println("====================");
        for (String word : arrayListString) {
            System.out.println("Довжина слова під номером " + (arrayListString.indexOf(word)) + " дорівнює " +
                    word.length() + " символи");
        }

        // remove() видаляє певний елемент
        System.out.println("=======================");
        ArrayList<String> arrayListString2 = new ArrayList<>();
        arrayListString2.add("One");
        arrayListString2.add("Two");
        arrayListString2.add("Three");
        System.out.println(arrayListString2);
        //arrayListString2.remove("Two");
        arrayListString2.remove(1);
        System.out.println(arrayListString2);

        //set() дозволяє перезаписати певне значення для колекції ArrayList
        System.out.println("====================");
        arrayListString2.set(1, "Two");
        System.out.println(arrayListString2);

        System.out.println("===============");
        ArrayList<String> arrayListString3 = new ArrayList<>();
        arrayListString3.add("One");
        arrayListString3.add("Two");
        arrayListString3.add("Three");
        arrayListString3.add("Two");
        System.out.println(arrayListString3);
        arrayListString3.remove("Two");
        System.out.println(arrayListString3);

        //contains() перевіряє чи знаходиться в колікції даний елемент
        System.out.println("==============");
        System.out.println(arrayListString3.contains("Text"));
        System.out.println(arrayListString3.contains("Two"));

        //trimToSize() обрізає виділену пам'ять до реальної к-ть елементів в колекції
        System.out.println("=====================");
        ArrayList<Integer> numbers = new ArrayList<>(30);
        System.out.println(numbers.size());
        for (int i = 0; i < 10; i++){
            numbers.add(i * 10);
        }
        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.trimToSize();
     }
}
