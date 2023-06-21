public class Main {
    public static void main(String args[]) {
        int number = 11;

        System.out.println(number); 
        modifyNumber(number);
        System.out.println(number);
    }

    public static void modifyNumber(int num) {
        num = num * 2;
    }
}
