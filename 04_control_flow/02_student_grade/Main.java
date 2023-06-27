public class Main {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Aced the course!");
                break;
            case 'B':
                System.out.println("Excellent work");
                break;
            case 'C':
                System.out.println("You are passing");
                break;
            case 'D':
                System.out.println("You need to do better work");
                break;
            case 'F':
                System.out.println("FAIL");
                break;
            default:
                System.out.println("Invalid grade"); 
        }
    }
}
