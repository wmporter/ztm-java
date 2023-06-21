import myobjects.Person;
import myobjects.Car;

public class Main {
    public static void main(String args[]) {
        Person p = new Person();
        Car c = new Car();

        p.name = "Harold";
        c.model = "Fiat";
        c.owner = p;

        System.out.println(c.model);
        System.out.println(c.owner.name);
    }
}
