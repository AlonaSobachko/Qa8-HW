package hw8.task2;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree1 = new Tree("Дуб", 300);
        Tree tree2 = new Tree(400,15, "Зелений");
        Tree tree3 = new Tree();
        Tree tree4 = new Tree("Сосна");
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
        System.out.println(tree4);
    }
}
