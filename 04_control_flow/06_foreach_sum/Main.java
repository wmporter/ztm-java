public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, -12, 99, 0, 43};

        int sum = 0;
        for(int number: numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
