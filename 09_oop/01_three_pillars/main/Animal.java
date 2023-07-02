package main;

public class Animal {
    private String sound;

    public Animal() {
        sound = "rawr";
    } 

    public String getSound() {
        return sound;
    }

    public void setSound(String s) {
        sound = s;
    }

    public void makeSound() {
        System.out.println(sound);
    }
}
