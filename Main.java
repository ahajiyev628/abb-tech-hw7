import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Human mother = new Human();
        Human father = new Human();
        Human child = new Human();
        Family family = new Family();

        mother.setName("Tito");
        mother.setSurname("Karleone");
        mother.setYear(1960);
        mother.setIq(60);
        mother.setFather(new Human("Allahverdi", "Hajiyev"));
        mother.setMother(new Human("Allahverdi", "Hajiyev"));
        mother.setSchedule(new String[][]{{String.valueOf(DayOfWeek.Sunday)}, {Human.tasks[0]}});


        father.setName("Vito");
        father.setSurname("Karleone");
        father.setYear(1970);
        father.setIq(70);
        father.setFather(new Human("Allahverdi", "Hajiyev"));
        father.setMother(new Human("Allahverdi", "Hajiyev"));
        father.setSchedule(new String[][]{{String.valueOf(DayOfWeek.Thursday)}, {Human.tasks[4]}});

        child.setName("Michael");
        child.setSurname("Karleone");
        child.setYear(1990);
        child.setIq(50);
        child.setFather(new Human(father.getName(), father.getSurname()));
        child.setMother(new Human(mother.getName(), mother.getSurname()));
        child.setSchedule(new String[][]{{String.valueOf(DayOfWeek.Saturday)}, {Human.tasks[6]}});

        ArrayList<Human> childs = family.addChild(child);
        for(Human ch : childs) System.out.println(ch.toString());

        DomesticCat dc = new DomesticCat(AnimalSpecies.DomesticCat, "wimel", 10, 50, new String[]{"eat", "play"});
        System.out.println(dc.describePet());

        RoboCat rc = new RoboCat(AnimalSpecies.ROBOCAT, "wimel", 10, 50, new String[]{"eat", "play"});
        System.out.println(rc.describePet());

        Fish f = new Fish(AnimalSpecies.FISH, "wimel", 10, 50, new String[]{"eat", "play"});
        System.out.println(f.describePet());

        Dog dg = new Dog(AnimalSpecies.DOG, "wimel", 10, 50, new String[]{"eat", "play"});
        System.out.println(dg.describePet());

        System.out.print("Count of members in the family: " + family.countFamily());

    }
}


