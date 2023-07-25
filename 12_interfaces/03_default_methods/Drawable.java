public interface Drawable {
    void draw();
    default void erase() {
        System.out.println("Erases the drawing");
    }
}
