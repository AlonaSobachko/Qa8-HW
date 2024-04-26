package lesson8.task_example_service;

public class City {
    private String name;
    private int distance;

    public City(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
