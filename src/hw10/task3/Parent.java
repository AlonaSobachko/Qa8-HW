package hw10.task3;

import hw10.task3.Exceptions.NotEnoughMoneyException;

import java.util.HashMap;
import java.util.Map;

public class Parent {
    private String name;
    private double money;
    private final double APPLE_PRICE = 20;
    private final double POTATO_PRICE = 10;
    private final double MILK_PRICE = 30;
    private final double BEER_PRICE = 50;
    private final double TOBACCO_PRICE = 40;
    private final Map<Product.ProductType, Double> prices;

    public Parent(String name, double money) {
        this.name = name;
        this.money = money;
        prices = new HashMap<>();
        prices.put(Product.ProductType.APPLE, APPLE_PRICE);
        prices.put(Product.ProductType.POTATO, POTATO_PRICE);
        prices.put(Product.ProductType.MILK, MILK_PRICE);
        prices.put(Product.ProductType.BEER, BEER_PRICE);
        prices.put(Product.ProductType.TOBACCO, TOBACCO_PRICE);
    }

    public void buy(Product.ProductType productType, int quantity) throws NotEnoughMoneyException,
            Exceptions.ProhibitedItemException, Exceptions.QuantityNotDivisibleByThreeException, Exceptions.InvalidProductTypeException,
            Exceptions.InvalidPurchaseException {
        if (!prices.containsKey(productType)) {
            throw new Exceptions.InvalidProductTypeException("Недійсний тип продукту");
        }
        double price = prices.get(productType) * quantity;
        if (price > money) {
            throw new NotEnoughMoneyException("Недостатньо грошей для купівлі " + productType);
        }
        if (productType == Product.ProductType.BEER || productType == Product.ProductType.TOBACCO) {
            throw new Exceptions.ProhibitedItemException("Покупка " + productType + " заборонена");
        }
        if (quantity % 3 != 0) {
            throw new Exceptions.QuantityNotDivisibleByThreeException("Кількість товару повинна бути кратною трьом");
        }
        money -= price;
        System.out.println("Шановний " + name + ", вартість ваших покупок " + price + ". Ви придбали " + productType + " у кількості " + quantity);
    }
}

