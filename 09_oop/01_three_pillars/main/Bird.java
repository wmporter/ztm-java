package main;

public class Bird extends Animal {
    public Bird() {
        setSound("chirp");
    }    

    public void makeSound() {
        System.out.println("Bird sound: " + getSound());
    }
}
