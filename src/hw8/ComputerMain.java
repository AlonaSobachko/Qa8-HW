package hw8;

public class ComputerMain {
    public static void main(String[] args) {
        Computer Lenovo = new Computer("Lenovo IdeaPad Gaming 3", 28999, 4, 8);
        System.out.println(Lenovo.toString());
        Computer Lenovo1 = new Computer("Lenovo IdeaPad Gaming 3", 28999, 4, 8);
        System.out.println(Lenovo.equals(Lenovo1));
    }
}
