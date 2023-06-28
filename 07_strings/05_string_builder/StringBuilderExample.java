public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Greetings");
        StringBuilder sb2 = new StringBuilder("Greetings");
        
        System.out.println(sb1.equals(sb2));  // false
        
        // append() method returns new value as well as mutates
        System.out.println(sb1.append(sb2));  // GreetingsGreetings
        System.out.println(sb1);              // GreetingsGreetings
        
        // reverse() method does the same
        System.out.println(sb2.reverse());  // sgniteerG
        System.out.println(sb2);            // sgniteerG
        
        // extra note: sb1 is unchanged
        // sb1.append(sb2) did not append a ref to sb2 but its contents
        // otherwise this would be GreetingssgniteerG
        System.out.println(sb1);  // GreetingsGreetings
    }
}
