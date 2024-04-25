package hw9;

public class Main {
    public static void main(String[] args) {
        Human mother1 = new Human("Анна", "Шевчук", 1980);
        Human father1 = new Human("Дмитро", "Шевчук", 1975);
        Human child1 = new Human("Емілі", "Шевчук", 2005, father1, mother1);
        Pet pet1 = new Pet("собака", "Баді", 3, 70, new String[]{"принеси", "голос"});
        Family family1 = new Family(mother1, father1);
        family1.addChild(child1);
        child1.setPet(pet1);
        Human mother2 = new Human("Марія", "Дзюба", 1982);
        Human father2 = new Human("Михайло", "Дзюба", 1978);
        Human child2 = new Human("Софія", "Дз.ба", 2007, father2, mother2);
        Pet pet2 = new Pet("кіт", "Пушок", 5, 60, new String[]{"дрімати вдень", "муркотіти"});
        Family family2 = new Family(mother2, father2);
        family2.addChild(child2);
        child2.setPet(pet2);
        System.out.println("Сім'я 1:");
        System.out.println(mother1);
        System.out.println(father1);
        System.out.println(child1);
        System.out.println("Сім'я 2:");
        System.out.println(mother2);
        System.out.println(father2);
        System.out.println(child2);
        System.out.println("\nВиклик методів у дитини та її тваринки:");
        System.out.println("Сім'я 1:");
        child1.greetPet();
        child1.describePet();
        child1.getPet().eat();
        child1.getPet().respond();
        child1.getPet().foul();
        System.out.println("\nСім'я 2:");
        child2.greetPet();
        child2.describePet();
        child2.getPet().eat();
        child2.getPet().respond();
        child2.getPet().foul();
    }
}