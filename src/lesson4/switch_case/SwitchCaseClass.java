package lesson4.switch_case;

import java.util.Scanner;

public class SwitchCaseClass {
    public static void main(String[] args) {
        System.out.println("Tell your card!!!!");
        Scanner scanner = new Scanner(System.in);
        // HEART SIX  ♦, ♠, ♣, ♥
        String card = scanner.nextLine();
        String cardType = card.split("\\s")[0];
        String cardValue = card.split("\\s")[1];
        switch (cardType.toUpperCase()){
            case "DIAMOND" -> System.out.println("♦ " + cardValue);
            case "SPADE" -> System.out.println("♠ " + cardValue);
            case "CLUBE" -> System.out.println("♣ " + cardValue);
            case "HEART" -> {
                System.out.println("♥ " + cardValue);
                System.out.println("!!!!!!!!!!!!");
            }
        }
    }
}
