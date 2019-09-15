public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(3.5, "red", false);
        System.out.println(square);
        square = new Square(3.6);

        System.out.println(square);
        square.setSide(2.6);
        System.out.println(square);
    }

}
