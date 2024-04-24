package hw10.task1;

public class Shop {
    /* private String name;
     public Shop(String name){
         this.name = name;
     }
     public void returnCost(Seller seller, Buyer buyer, Item item){
         System.out.println("Шановний " + buyer.getName() + ", продавець " + seller.getName() + " нашого магазину \""
                 + name + "\", продасть вам цей товар \"" + item.getName() + "\", у них є алкогольна продукція, а ваш вік " +
         + buyer.getAge() + ". Вартість вашої покупки дорівнє " + calculatePrice(seller, buyer, item) +
                 ". Ви можете отримати знижку.");
     }
     private int calculatePrice(Seller seller, Buyer buyer, Item item){
         int price = item.getPrice();
         if (item.isAlcoholic() && seller.isHonest()){
             System.out.println("Продавець чесний, тому не може продати алкогольні товари неповнолітнім.");
         }
         else {
             System.out.println("Продавець не чесний, тому може продати алкогольні товари неповнолітнім.");
         }
         if (buyer.isHasDiscountCard()){
             System.out.println("Ваша ціна з урахуванням знижки: ");
             return (int) (item.getPrice() * 0.9);
         }
         return price;
     }*/
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public void returnCost(Seller seller, Buyer buyer, Item item) {
        System.out.println("Шановний " + buyer.getName() + ", продавець " + seller.getName() + " нашого магазину \"" + name + "\", продасть вам цей товар \"" +
                item.getName() + "\", у них є алкогольна продукція, а ваш вік " + buyer.getAge() + ". Вартість вашої покупки дорівнює " +
                calculatePrice(seller, buyer, item) + ". Ви можете отримати знижку, якщо у вас є дисконтна карта.");
    }

    private int calculatePrice(Seller seller, Buyer buyer, Item item) {
        int price = item.getPrice();
        if (item.isAlcoholic() && seller.isHonest()) {
            System.out.println("Продавець є чесним та не може продати алкогольні товари.");
        } else {
            System.out.println("Продавець не чесний!!!!!");
        }
        if (buyer.hasDiscountCard()) {
            double discountedPrice = (price - 0.1);
            System.out.println("Вартість із знижкою " + discountedPrice);
        } else {
            System.out.println("Ви не маєте дисконтної карти!!!");
        }
        return price;
    }
}
