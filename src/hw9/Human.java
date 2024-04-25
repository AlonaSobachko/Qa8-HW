package hw9;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    /*private Pet pet;
    private Human mother;
    private Human father;*/
    private Family family;

    /* public void greetPet() {
         if (pet != null) {
             System.out.println("Привіт, " + pet.getNickname() + "!");
         }
     }*/
    public void greetPet() {
        if (family.getPet() != null) {
            System.out.println("Привіт, " + family.getPet().getNickname() + "!");
        }
    }

    /* public void describePet() {
         if (pet != null) {
             String species = pet.getSpecies();
             int age = pet.getAge();
             String trickLevel = (pet.getTrickLevel() > 50) ? "дуже хитрий" : "майже не хитрий";
             System.out.println("У мене є " + species + ", йому " + age + " років, він " + trickLevel);
         }
     }*/
    public void describePet() {
        Pet pet = family.getPet();
        String trickLevelDescription = pet.getTrickLevel() > 50 ? "дуже хитрий" : "майже не хитрий";
        System.out.printf("У мене є %s, йому %d років, він %s.%n",
                pet.getSpecies(), pet.getAge(), trickLevelDescription);
    }

    public void feedPet() {
        if (family.getPet() != null) {
            System.out.println("Я їм!");
        }
    }

    public Human() {

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

   /* public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
    }*/

    /*@Override
    public String toString() {
        String petInfo = (pet != null) ? ", pet = " + pet.toString() : "";
        String motherName = (mother != null) ? mother.getName() + " " + mother.getSurname() : "unknown";
        String fatherName = (father != null) ? father.getName() + " " + father.getSurname() : "unknown";
        return "Human{name = '" + name + "', surname = '" + surname + "', year = " + year + ", iq = " +
                iq + ", mother = " + motherName + ", father = " + fatherName + petInfo + "}";
    }*/
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", family=" + family +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, family);
    }

    /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(mother, human.mother) &&
                Objects.equals(father, human.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, mother, father);
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    /*public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }*/

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
