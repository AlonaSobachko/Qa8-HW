package lesson3;

public class Lesson3Task1 {
    // Создать 5 люьих переменных типа String (world1, world2, world3, world4, world5)
    // Создать также переменные типа String result1 result2.
    // Поместить в result1 все слова world1 - world5 используя метод concat.
    // Поместить в result2 все слова world1 - world5 используя оператор +.
    // Вывести result1 и result2 в консоль.
    public static void main(String[] args) {
        String world1 = "Java group lesson 3";
        String world2 = "practice";
        String world3 = "task 1";
        String world4 = "Alona";
        String world5 = "Sobachko";
        String result1;
        String result2;
        result1 = world1.concat(" ").concat(world2).concat(" ").concat(world3)
                .concat(" ").concat(world4).concat(" ").concat(world5);
        result2 = world1 + " " + world2 + " " + world3 + " " + world4 + " " + world5;
        System.out.println(result1);
        System.out.println(result2);
    }
}
