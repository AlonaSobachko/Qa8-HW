package hw8.task3;

public class ConverterCheck {
    public static void main(String[] args) {
        Converter converter = new Converter("Converter Check");
        System.out.println(converter.convertToInt((byte) 15));
        System.out.println(converter.convertToInt((short) 20));
        System.out.println(converter.convertToInt(30));
        System.out.println(converter.convertToInt(40L));
        System.out.println(converter.convertToInt(true));
        System.out.println("==============================");
        System.out.println(converter.convertToDouble((byte) 15));
        System.out.println(converter.convertToDouble((short) 20));
        System.out.println(converter.convertToDouble(true));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(converter.convertToString(true));
        System.out.println(converter.convertToString((byte) 15));
    }
}
