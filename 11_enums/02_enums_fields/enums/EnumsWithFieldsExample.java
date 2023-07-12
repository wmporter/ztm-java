package enums;

public class EnumsWithFieldsExample {
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.println("Name: " + p.getName() + " d: " + p.getDistanceFromSun());
        }
    }
}
