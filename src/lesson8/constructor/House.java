package lesson8.constructor;

public class House {
    private String address;
    private int capacity;

    private int countOfFloors;

    private boolean isNew;

    public House(String address, int capacity, int countOfFloors, boolean isNew){
        this.address = address;
        this.capacity = capacity;
        this.countOfFloors = countOfFloors;
        this.isNew = isNew;
    }

    public House(String address, int capacity, boolean isNew, int countOfFloors){
        this(capacity, isNew);
        this.address = address;
        this.countOfFloors = countOfFloors;
    }

    public House(){

    }

    public House(int capacity, boolean isNew){
        this.capacity = capacity;
        this.isNew = isNew;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(int countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void getAllInfoAboutHouse(){
        System.out.println("Your address: " + address);
        System.out.println("Your capacity " + capacity);
        System.out.println("Count of floors " + countOfFloors);
        if (isNew) {
            System.out.println("House is new!!!");
        } else {
            System.out.println("House is NOT new!!!");
        }
    }
}
