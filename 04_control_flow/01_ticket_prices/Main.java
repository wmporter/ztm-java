public class Main {
    public static void main(String args[]) {
        int age = 4;

        System.out.print("Ticket price is ");
        if (age < 5) {
            System.out.println("$0");
        } else if (age >= 5 && age < 12) {
            System.out.println("$5");
        } else if (age >= 12 && age < 18) {
            System.out.println("$10");
        } else {
            System.out.println("$15");
        }
    }
}
