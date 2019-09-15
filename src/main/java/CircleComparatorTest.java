import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];// tao mang gom 3 doi tuong kieu circle
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);
        System.out.println("Pre-sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();// tao doi tuong CircleCompator de so sanh
        Arrays.sort(circles, circleComparator);// so sanh cac doi tuong kieu Circle trong mang bang comparator dinh nghia cach so snah cho no        System.out.println("After-sorted: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
