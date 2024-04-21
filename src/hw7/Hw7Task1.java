package hw7;

public class Hw7Task1 {
    //Написати метод, який приймає як параметр масив цілих чисел.
    // І виводить на екран усі парні числа списком, а також непарні числа списком.
    public static void main(String[] args) {
        Hw7Task1 printNumb = new Hw7Task1();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printNumb.printNumber(numbers);
    }

    public void printNumber(int[] array) {
        System.out.println("Парні числа: ");
        for (int numb : array) {
            if (numb % 2 == 0) {
                System.out.print(numb + " ");
            }
        }
        System.out.println("\nНепарні числа: ");
        for (int numb : array) {
            if (numb % 2 != 0){
                System.out.print(numb + " ");
            }
        }
    }
}