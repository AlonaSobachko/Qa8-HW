package lesson5;

import java.util.Scanner;

public class Lesson5Task4 {
    //Пример у вас соц сеть в которую можно загружать фотографии.
    //У пользователя с консоли спрашивают сколько фотографий
    // он хотел бы загрузить в свой альбом,
    // но есть ограничение по размеру альбома в 100 фотографий
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPhoto = 0;
        while (countOfPhoto <= 100) {
            System.out.println("Введіть кількість фото для завантаження");
            int tempCount = scanner.nextInt();
            countOfPhoto = countOfPhoto + tempCount;
        }
    }
}
