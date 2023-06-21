import person.Person;

public class Main {
    public static void main(String args[]) {
        Person p = new Person();

        p.name = "Darla";
        p.age = 40;
        System.out.println(p.name + " " + p.age);
        modifyPerson(p);
        System.out.println(p.name + " " + p.age);
    }

    public static void modifyPerson(Person person) {
        person.name = "Marie";
        person.age = 13;
    }
}
