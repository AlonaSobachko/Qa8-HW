package lesson8.to_string;

public class Auto {
    /*4)Создать класс Auto. В данном классе создать поле String name, int price, boolean isNew
создать геттеры и сеттеры для данных полей, а также конструктор класса,
принимающий в параметры все поля данного класса.*/
    public static void main(String[] args) {
        Auto auto = new Auto("Audi", 20000, true);
        String autoInfo = auto.toString();
        System.out.println(auto);
    }

    private String name;
    private int price;
    private boolean isNew;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Auto(String name, int price, boolean isNew) {
        this.name = name;
        this.price = price;
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        if (isNew){
            return "Auto with name " + name + " costs " + price + ". Car is new!!!";
        } else {
            return "Auto with name " + name + " costs " + price + ". Car is not new!!!!";
        }
    }
    /*    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }*/
}

