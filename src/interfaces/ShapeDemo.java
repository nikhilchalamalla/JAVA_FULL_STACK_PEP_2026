package interfaces;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
