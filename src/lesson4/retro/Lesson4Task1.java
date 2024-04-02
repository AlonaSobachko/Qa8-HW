package lesson4.retro;

public class Lesson4Task1 {
    /*"Повседневная практика показывает, что разбавленное изрядной долей эмпатии, рациональное мышление выявляет
    срочную потребность глубокомысленных рассуждений. Раздел 16."
    Необходимо вывести в консоль следующие значения:
    a) Общую длину всего предложения.
    б) Количество слов в данном предложении
    в) 3 и 7 слово в данном предложении. (без запятых).
    г) Вывести в консоль сообщение:
    "5 слово имеет значение {ЗНАЧЕНИЕ_5_СЛОВА}, 10 слово имеет значение {ЗНАЧЕНИЕ_10_СЛОВА}.
    Пятое слово длиннее десятого и это {true либо false}"
    д)Значение последнего слова из предложения умноженное на два*/
    public static void main(String[] args) {
        String text = "Повседневная практика показывает, что разбавленное изрядной долей эмпатии, рациональное " +
                "мышление выявляет срочную потребность глубокомысленных рассуждений. Раздел 16.";
        System.out.println("Общая длина всего предложения " + text.length());
        String[] worlds = text.split("\\s");
        System.out.println("Количество слов в данном предложении " + worlds.length);
        System.out.println(worlds[2].replace(",", "") + " " + worlds[6].
                replace(",", ""));
        System.out.println("5 слово имеет значение " + worlds[+4] + ", 10 слово имеет значение " + worlds[9] + "\n" + "Пятое слово длиннее десятого и это " +
                (worlds[4].length() > worlds[9].length()));
        //String lastworld = worlds[worlds.length - 1];
        //System.out.println(lastworld);
        //int lastword1 = Integer.parseInt(lastworld.replace(".", ""));
        //System.out.println(lastword1);
        System.out.println("Значение последнего слова из предложения умноженное на два " + Integer.parseInt
                (worlds[worlds.length - 1].replace(".", "")) * 2);

    }
}

