package hw8;

import java.util.Objects;

public class Computer {
    //Створити клас Computer з конструктором, що приймає параметри Марка тип String, ціна тип int,
    //оперативна пам'ять тип int, та відеокарта тип int
    //Перевизначити метод toString для виведення об'єкта класу на слід. вигляді:
    //"Створено PC.
    //Ім'я = марка.
    //Ціна = ціна.
    //Відеокарта = обсяг відеокарти.
    //ОЗУ = Об'єм оперативної пам'яті."
    //Усі поля класу Computer мають бути приватними.
    //Також створіть публічні методи для отримання інформації про поля класу Computer.
    // А також методи зміни його полів.
    //Перевизначте метод equals та метод hashCode для вашого класу.
    //Зробіть так, щоб комп'ютери вважалися однаковими у випадку, якщо у них:
    // • рівні значення полів марка, оперативна пам'ять та відеокарта.
    // • рівні значення полів марка, оперативна пам'ять та відеокарта.
    //В окремому класі створіть об'єкт класу комп'ютер і виведіть у консоль інформацію про ваш об'єкт.

    private String brand;
    private int price;
    private int ram;
    private int videoCard;

    public Computer(String brand, int price, int ram, int videoCard) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Створено PC.\n" +
                "Ім'я - " + brand + ".\n" +
                "Ціна - " + price + ".\n" +
                "Відеокарта - " + ram + ".\n" +
                "ОЗП - " + videoCard + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && videoCard == computer.videoCard && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + ram;
        result = 31 * result + videoCard;
        return result;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }
}
