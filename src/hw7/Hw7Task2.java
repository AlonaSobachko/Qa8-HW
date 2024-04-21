package hw7;

public class Hw7Task2 {
//2) Написати перевантажений метод, який може:
//• Не приймати жодних значень, тоді він виводитиме на консоль повідомлення типу: "Я порожній".
//• Приймати як параметри String, тоді він виводитиме на консоль це повідомлення.
//• Приймати як параметри масив рядків, тоді він виводитиме на консоль усі його значення через пробіл.
//• Приймати як параметр масив чисел, тоді він виводитиме на консоль суму елементів масиву.
//• Приймати як параметри число і рядок, тоді він буде виводити на консоль повідомлення типу:
// "Ваше повідомлення - "%%%%%%%%", ваше число - $", де "%%%%%%%%%" і $ ваші введені рядок та число

    public static void main(String[] args) {
        Hw7Task2 printMessage = new Hw7Task2();
        printMessage.pritnSmth();
        printMessage.printSmth("Моє повідомлення!!!");
        printMessage.printSmth(new String[]{"один", "два", "десять"});
        printMessage.pritnSmth(new int[]{1, 5, 10, 22, 4});
        printMessage.printSms("мій текст", 15);
    }

    public void pritnSmth() {
        System.out.println("Я порожній!!!");
    }

    public void printSmth(String text) {
        System.out.println(text);
    }

    public void printSmth(String[] arrayString) {
        for (String str : arrayString){
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public void pritnSmth(int[] numbers) {
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        System.out.println("Сума елементів масиву: " + sum);
    }

    public void printSms( String str, int num) {
        System.out.println("Ваше повідомлення - " + str + ", ваше число - " + num);
    }
}
