package lesson8.task_example_service;

public class Contract {
    private int id;
    private Human human;

    public Contract(int id, Human human) {
        this.id = id;
        this.human = human;
    }

    public int getId() {
        return id;
    }

    public Human getHuman() {
        return human;
    }
}
