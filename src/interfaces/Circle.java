package interfaces;

public class Circle implements Shape {
    double r = 5;
    public double area() {
        return Math.PI * r * r;
    }
}
