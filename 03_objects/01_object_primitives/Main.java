import person.Person;

public class Main {
    public static void main(String args[]) {
        Person p = new Person();
        p.name = "Gary";
        p.age = 29;

        System.out.println("name " + p.name + " age " + p.age);
    }
}
