package lesson7.oop;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Barsik";
        cat.age = 3;
        cat.species = "CAT !!!!!";
        System.out.println(cat.name);

        Animal dog = new Animal();
        System.out.println(dog.name);
        System.out.println("Insert dog name:");
        //dog.name = new Scanner(System.in).nextLine();
        dog.name = "Rex";
        System.out.println(dog.name);

        System.out.println("=================");
        /*System.out.println(cat);
        System.out.println(dog);
        dog = cat;
        System.out.println(cat);
        System.out.println(dog);*/

        System.out.println("====================");
        cat.getInfoAboutYourAnimalToConsole();
        System.out.println("====================");
        dog.getInfoAboutYourAnimalToConsole();
        System.out.println("===================");
        int ageOfBarsik = cat.returnAgeOfTheAnimal();
        System.out.println("Age of a cat = " + ageOfBarsik);

        System.out.println("================");
        cat.someActionFromParameters("Climb on the tree", 3);

        System.out.println("===========");
        int restOfCatLife = cat.hoveLongMyAnimalCanLive(15);
        System.out.println("Me cat " + cat.name + " will live at least " + restOfCatLife + " year more!!!");
    }
}
