package lesson3.string;

public class StringClass2 {
    public static void main(String[] args) {
        // replace() заміняє частини строки
        String text = "My text for replace example";
        System.out.println(text.replace("text", "AQA8"));
        System.out.println(text);
        System.out.println(text = text.replace("text", "@@@@@!!!!@@@@@"));
        System.out.println(text);

        System.out.println("======================");
        //equals == прирівнює строки
        int a = 8;
        int c = 12;
        System.out.println(8 == 12);
        String one = "one";
        String two = "two";
        boolean result = one.equals(two);
        System.out.println(result);
        //Door door1 = new Door();
        // Door door2 = new Door();
        // boolean doorReselt = door1 == door2;

        // startsWith(), endsWith() перевіряє початок або кінець строки на відпов заданим даним
        System.out.println("============");
        String greetings = "My dear friend, nice to see you!!!";
        System.out.println(greetings.startsWith("My dear friend"));
        System.out.println(greetings.endsWith("!!!"));

        //toLowerCase(), toUpperCase() вирівнює регістр
        System.out.println("===============");
        String forCaseEx = "I aM Ans as weNJJ kddsiHIIIDWWD";
        System.out.println(forCaseEx);
        System.out.println(forCaseEx.toLowerCase());
        System.out.println(forCaseEx.toUpperCase());

        // QA, Qa, qa
        //equalsIgnoreCase() прирівнює строки ігноруючи індекси
        System.out.println("====================");
        String lowerCase = "qa";
        String upperCase = "QA";
        String camelCase = "Qa";
        System.out.println(lowerCase.equals(upperCase));
        System.out.println(lowerCase.equalsIgnoreCase(upperCase));
        System.out.println("EQUaLs");
        System.out.println(lowerCase.equals(camelCase));
        System.out.println(lowerCase.equalsIgnoreCase(camelCase));

        //trim() прибирає початкові та кінцеві пробіли в строкі
        System.out.println("===============");
        String trimtext = "          Some text with space     ";
        System.out.println(trimtext);
        System.out.println(trimtext.trim());

        //split() - метод розбиття, розбиває строку на окремі стртчки, які ми визначимо, на масив
        System.out.println("===========");
        String forSplit1 = "word1 word2 word3 word4";
        forSplit1.split(" ");
        String[] wordPlace = forSplit1.split(" ");
        System.out.println(wordPlace[0]);
        System.out.println(wordPlace[1]);
        System.out.println(wordPlace[2]);
        System.out.println(wordPlace[3]);
        String word1 = wordPlace[0];
        System.out.println(wordPlace);
        System.out.println("Total amount of elements in array: " + wordPlace.length);
        System.out.println("Total amount of characters in text " + word1.length());
        System.out.println("Total amount of characters in text " + wordPlace[0].length());
        System.out.println("==============");
        String forSplit2 = "My text is one and this is text one bla ble bla";
        String [] forSplit2Array = forSplit2.split("one");
        System.out.println(forSplit2Array[0].trim());
        System.out.println(forSplit2Array[1].trim());
        System.out.println(forSplit2Array[2].trim());
        System.out.println("=================");
        System.out.println(forSplit2.split("one")[0].trim());
    }
}
