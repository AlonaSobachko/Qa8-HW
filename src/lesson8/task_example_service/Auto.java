package lesson8.task_example_service;

public class Auto {
    private String name;
    private int price;
    private int distanceBeforeService;

    public Auto(String name, int price, int distanceBeforeService) {
        this.name = name;
        this.price = price;
        this.distanceBeforeService = distanceBeforeService;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", distanceBeforeService=" + distanceBeforeService +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDistanceBeforeService() {
        return distanceBeforeService;
    }
}
