package hw10.task1;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("АТБ");
        Seller seller = new Seller("Оля", true);
        Buyer buyer = new Buyer("Віталій", 19, true);
        Item item = new Item("Віскі", true, 450);
        shop.returnCost(seller, buyer, item);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Shop shop1 = new Shop("Supermarket");
        Buyer buyer1 = new Buyer("Олег", 15, false);
        Seller seller1 = new Seller("Валентина", false);
        Item item1 = new Item("Вино", true, 250);
        shop1.returnCost(seller1, buyer1, item1);
    }
}
