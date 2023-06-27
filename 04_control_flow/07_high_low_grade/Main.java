public class Main {
    public static void main(String[] args) {
        int[] grades = {89, 75, 93, 91, 85};

        int highest = grades[0];
        int lowest = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}
