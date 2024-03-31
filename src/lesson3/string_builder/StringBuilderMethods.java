package lesson3.string_builder;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("AQA8");
        System.out.println(text);

        //append (concat) автоматично змінює строку
        text.append(" ").append("my best group!!!");
        System.out.println(text);

        //reverse - перевертає строку у зворотньому порядку
        System.out.println(text.reverse());
        System.out.println(text.reverse());

        //insert
        System.out.println(text.insert(0, "Group "));
        int index = text.indexOf("8");
        System.out.println(text.insert(index + 1, " is"));

        //delete (replace)
        System.out.println(text.delete(text.length()-2, text.length()));

        //this is STRING!!! not StringBuilder
        String replaceString = "Text for replace {ABC}";
        System.out.println(replaceString.replace("{ABC}", " "));
        System.out.println("==============");
        StringBuffer stringBuffer = new StringBuffer("stringBuffer");
        System.out.println(stringBuffer);
    }
}
