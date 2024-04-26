package lesson8.equals_hash;

public class PersonMainLesson8 {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 25, "123456");
        Person person2 = new Person("Oleg", 35, "21312");
        Person person3 = new Person("Oleg", 35, "13414132");
        Person person4 = new Person("Sam", 32, "21312");
        System.out.println(person1);
        System.out.println(person2);
        boolean comparePerson1 = person1.equals(person2);
        boolean comparePerson2 = person2.equals(person3);
        System.out.println(comparePerson1);
        System.out.println(comparePerson2);
        System.out.println("===============");
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person4.hashCode());
        System.out.println("================");
        System.out.println(person2.equals(person4));
    }
}
