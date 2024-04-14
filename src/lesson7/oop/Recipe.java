package lesson7.oop;

public class Recipe {
    public static void main(String[] args) {
        Recipe saltedWater = new Recipe();
        saltedWater.getInfo();
        saltedWater.nameOfDish = "Water and Salt";
        saltedWater.ingredients = new String[]{"salt", "water"};
        saltedWater.timeToCook = 0.3;
        System.out.println("===================");
        saltedWater.getInfo();
    }

    ///* 5)Создать класс Recipe (рецепт). В нем создать следующие поля:
    // a) Поле nameOfDish типа String
    // б) Поле ingredients типа String[]
    // в) Поле timeToCook типа double
    // В этом классе создайте метод getInfo(), который будет выводить всю информацию о данном рецепте.
    // Создать объект класса Recipe. Задать все поля для данного объекта. Вызвать у объекта
    // метод getInfo().*/
    public String nameOfDish;
    public String[] ingredients;
    public double timeToCook;

    public void getInfo() {
        System.out.println("Name of a dish \"" + nameOfDish + "\"");
        System.out.println("Ingredients: ");
        int counter = 1;
        if (ingredients == null) {
            System.out.println("No ingredients");
        } else {
            for (String ingredients : ingredients) {
                System.out.println(counter + ") " + ingredients + ".");
                counter++;
            }
        }
        System.out.println("Time to cook is " + timeToCook);
    }
}
