package lesson8.equals_hash;

import java.util.Objects;

public class Person {
    public String name;
    public int age;
    public String passportId;

    public Person(String name, int age, String passportId) {
        this.name = name;
        this.age = age;
        this.passportId = passportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(passportId, person.passportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportId);
    }
}
