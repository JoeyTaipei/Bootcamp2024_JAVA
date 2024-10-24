package HW5.HW5_3;

public class MyRectangleMain {
    public static void main(String[] args) {
        MyRectangle rec1 = new MyRectangle();
        rec1.setWidth(10);
        rec1.setDepth(20);
        System.out.println("rec1 area: " + rec1.getArea());

        MyRectangle rec2 = new MyRectangle(10,20);
        System.out.println("rec2 area: " + rec2.getArea());
    }
}
