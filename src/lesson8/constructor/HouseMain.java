package lesson8.constructor;

public class HouseMain {
    public static void main(String[] args) {
        House house1 = new House();
        house1.getAllInfoAboutHouse();
        System.out.println("=======================");
        house1.setAddress("Best street in the world!!!!");
        house1.setCapacity(100500);
        house1.setCountOfFloors(1);
        house1.setNew(true);
        house1.getAllInfoAboutHouse();
        System.out.println("===============");
        House house2 = new House("Best address", 200, 4, false);
        house2.getAllInfoAboutHouse();
        System.out.println("==================");
        House house3 = new House(43, false);
        house3.getAllInfoAboutHouse();
    }
}
