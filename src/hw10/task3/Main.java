package hw10.task3;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Денис", 200);
        try {
            parent.buy(Product.ProductType.APPLE, 3);
            parent.buy(Product.ProductType.MILK, 6);
            //parent.buy(Product.ProductType.BEER, 1);
            //parent.buy(Product.ProductType.TOBACCO, 1);
            // parent.buy(Product.ProductType.APPLE, 4);
        } catch (Exceptions.NotEnoughMoneyException | Exceptions.ProhibitedItemException |
                 Exceptions.QuantityNotDivisibleByThreeException | Exceptions.InvalidProductTypeException |
                 Exceptions.InvalidPurchaseException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
