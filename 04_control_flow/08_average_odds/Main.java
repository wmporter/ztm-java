public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 11, 24, 19, 106, 33};

        double sumOdd = 0;
        int countOdd = 0;

        for (int number: numbers) {
            if (number % 2 == 1) {
                sumOdd += number;
                countOdd ++;
            }
        }

        System.out.println("Average: " + sumOdd / countOdd);
    }
}
