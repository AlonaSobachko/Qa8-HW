package hw8.task3;

public class Converter {
    private String name;

    public Converter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Конвертація в int
    public int convertToInt(Object value) {
        if (value instanceof Byte || value instanceof Short || value instanceof Integer
                || value instanceof Long || value instanceof Character || value instanceof Float ||
                value instanceof Double) {
            return Integer.parseInt(value.toString());
        } else if (value instanceof String) {
            try {
                return Integer.parseInt((String) value);
            } catch (NumberFormatException e) {
                return 0;
            }
        } else {
            System.out.println("Введено тип boolean");
            return 0;
        }
    }

    // Конвертація в double
    public double convertToDouble(Object value) {
        if (value instanceof Byte || value instanceof Short || value instanceof Integer
                || value instanceof Long || value instanceof Character || value instanceof Float ||
                value instanceof Double) {
            return Double.parseDouble(value.toString());
        } else if (value instanceof String) {
            try {
                return Double.parseDouble((String) value);
            } catch (NumberFormatException e) {
                return 0.0;
            }
        } else {
            System.out.println("Введено тип boolean");
            return 0.0;
        }
    }

    //Конвертація в String
    public String convertToString(Object value) {
        return String.valueOf(value);
    }
}
