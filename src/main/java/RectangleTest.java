public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.8, 5.7);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.8, 5.7, "orange", false);
        System.out.println(rectangle);
    }
}
