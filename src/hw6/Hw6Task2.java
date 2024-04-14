package hw6;

import java.util.Random;
import java.util.Scanner;

public class Hw6Task2 {
    //Написати програму “стрільба по цілі”.
    //Технічні вимоги:
    //• Даний квадрат 5х5, де програма випадковим чином ставить ціль.
    //• Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
    //• Сам процес гри обробляється у нескінченному циклі.
    //• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число,
    //і введена лінія знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився
    //пропонує ввести число ще раз.
    //• Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
    //• Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки,
    //куди гравець вже стріляв, слід зазначити як *.
    //• Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу
    //You have won!, а також ігрове поле.
    //• Уражену ціль відзначити як x.
    //• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
    public static void main(String[] args) {
        char[][] gameBoard = new char[5][5];
        initializeGameBoard(gameBoard);
        System.out.println("All Set. Get ready to rumble!");
        Random random = new Random();
        int randomRow = random.nextInt(5);
        int randomColum = random.nextInt(5);
        while (true){
            printGameBoard(gameBoard);
            Scanner sc = new Scanner(System.in);
            int row, colum;
            do{
                System.out.print("Введіть номер рядка (1 - 5):");
                row = sc.nextInt() - 1;
                System.out.print("Введіть номер колонки (1 - 5):");
                colum = sc.nextInt() - 1;
            } while (!isValidInput(row, colum));
            if (row == randomRow && colum == randomColum){
                gameBoard[row][colum] = 'x';
                printGameBoard(gameBoard);
                System.out.println("You have won!!!!");
                break;
            }
            else {
                gameBoard[row][colum] = '*';
            }
            sc.close();
        }
    }

    public static void initializeGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                gameBoard[i][j] = '-';
            }
        }
    }
    public static void printGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < gameBoard.length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            ;
            System.out.println();
        }
    }
    public static boolean isValidInput(int row, int column) {
        return row >= 0 && row < 5 && column >= 0 && column < 5;
    }
}
