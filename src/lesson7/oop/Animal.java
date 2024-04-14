package lesson7.oop;

public class Animal {
    // поля
    public String name;
    public int age;
    public String species;

    // метод якикй нічого не повертає і нічого не приймає в параметри
    public void getInfoAboutYourAnimalToConsole() {
        System.out.println("Name of your animal is " + name + ".");
        System.out.println("Species of your animal is " + species + ".");
        System.out.println("Age of your animal is " + age + ".");
    }

    // метод який повертає значення і нічого не приймає в параметри
    public int returnAgeOfTheAnimal() {
        int ageOfPet = age;
        return ageOfPet;
    }

    // метод який нічого не повертає і приймає аргумегти в параметри методу
    public void someActionFromParameters(String action, int countOfAction) {
        System.out.println("Your pet can " + action + " " + countOfAction + " count of times.");
    }

    // метод який повертає значення і приймає аргументи в параметри методу
    public int hoveLongMyAnimalCanLive(int averageLive){
        return averageLive - age;
    }
}
