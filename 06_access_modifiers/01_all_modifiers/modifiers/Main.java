package modifiers;

import modifiers.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.address);
        // System.out.println(p.ssn);  // Cannot access private
    }
}
