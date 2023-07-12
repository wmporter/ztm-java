package enums;

public class GameStatusesExample {
    public static void main(String[] args) {
        for (GameStatus g : GameStatus.values()) {
            System.out.println(g);
        }
        
        GameStatus status = GameStatus.PAUSED;
    }
}
