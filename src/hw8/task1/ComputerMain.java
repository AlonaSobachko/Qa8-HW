package hw8.task1;

import hw8.task1.Computer;

public class ComputerMain {
    public static void main(String[] args) {
        Computer Lenovo = new Computer("Lenovo IdeaPad Gaming 3", 28999, 4, 8);
        System.out.println(Lenovo);
        Computer Lenovo1 = new Computer("Lenovo IdeaPad Gaming 3", 30000, 4, 8);
        System.out.println(Lenovo.equals(Lenovo1));
    }
}
