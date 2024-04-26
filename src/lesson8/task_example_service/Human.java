package lesson8.task_example_service;

public class Human {
    private String name;
    private Auto auto;

    public Human(String name, Auto auto) {
        this.name = name;
        this.auto = auto;
    }

    public String getName() {
        return name;
    }

    public Auto getAuto() {
        return auto;
    }
}
