package hw10.task1;

public class Item {
    private String name;
    private boolean isAlcoholic;
    private int price;
    public Item(String name, boolean isAlcoholic, int price){
        this.name = name;
        this.isAlcoholic = isAlcoholic;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public boolean isAlcoholic(){
        return isAlcoholic;
    }
    public int getPrice(){
        return price;
    }
}
