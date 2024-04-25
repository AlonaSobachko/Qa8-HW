package hw9;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        if (mother == null || father == null) {
            throw new IllegalArgumentException("Необхідно вказати обох, і батька, і матір.");
        }
        this.mother = mother;
        this.father = father;
        this.mother.setFamily(this);
        this.father.setFamily(this);
        this.children = new Human[0];
    }

    public void addChild(Human child) {
        Human[] updatedChildren = new Human[children.length + 1];
        System.arraycopy(children, 0, updatedChildren, 0, children.length);
        updatedChildren[children.length] = child;
        child.setFamily(this);
        children = updatedChildren;
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }
        Human[] updatedChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                updatedChildren[j++] = children[i];
            }
        }
        children = updatedChildren;
        return true;
    }

    public int countFamily() {
        int numberOfParents = 2;
        int numberOfChildren = children.length;
        return numberOfParents + numberOfChildren;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Family:\n");
        stringBuilder.append("Mother: ").append(mother.getName()).append(" ").append(mother.getSurname())
                .append("\n");
        stringBuilder.append("Father: ").append(father.getName()).append(" ").append(father.getSurname())
                .append("\n");
        stringBuilder.append("Children:\n");
        for (Human child : children) {
            stringBuilder.append(child.getName()).append(" ").append(child.getSurname()).append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father);
        result = 31 * result + Arrays.hashCode(children);
        return result;
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
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
