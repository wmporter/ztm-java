package enums;

import enums.Weekday;

public class BasicEnumsExample {
    public static void main(String[] args) {
        for (Weekday w :  Weekday.values()) {
            System.out.println(w);
        }
    }
}
