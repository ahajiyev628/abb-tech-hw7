import java.util.ArrayList;
import java.util.Objects;

public class Family {
    private Human father = new Human();
    private Human mother = new Human();
    private ArrayList<Human> children = new ArrayList<>();

    public Family(Human father, Human mother, ArrayList<Human> children) {
        this.father = father;
        this.mother = mother;
        this.children = children;
    }

    public Family() {

    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public ArrayList<Human> addChild(Human child) {
        children.add(child);
        System.out.println("Child was added");
        System.out.println(child.toString());
        return children;
    }

    public ArrayList<Human> deleteChild(Human child) {
        ArrayList<Human> deletedChildren = new ArrayList<>();
        for (Human deletedChild : children) {
            if (!deletedChild.equals(child)) {
                deletedChildren.add(deletedChild);
            }
        }
        children = deletedChildren;
        return children;
    }

    public ArrayList<Human> deleteChild(int position) {
        if (position > 0) {
            ArrayList<Human> deletedChildren = new ArrayList<>();
            for (int i = 0; i < children.size(); i++) {
                if (position != i) {
                    deletedChildren.add(children.get(i));
                }
            }
            children = deletedChildren;
        } else {
            throw new IndexOutOfBoundsException("No child in the family");
        }
        return children;
    }

    public int countFamily() {
        return children.size() + 2;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(father, family.father) && Objects.equals(mother, family.mother) && Objects.equals(children, family.children);
    }
    @Override
    public int hashCode() {
        return Objects.hash(father, mother, children);
    }
    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method in Family class was called");
    }
}