package staticmodifier;

import staticmodifier.Counter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Before: " + Counter.count);
        Counter.increment();

        System.out.println("After: " + Counter.count);
    }
}
