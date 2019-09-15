import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    //Compator so sanh  kieu du lieu doi tuong ke thua ben tren(Circle) khong can phai kieu CircleComparator

    @Override
    public int compare(Circle c1, Circle c2) {// so sanh hai doi tuong cung kieu
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;//so sanh hai doi tuong
        else return 0;
    }
}