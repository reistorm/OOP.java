package Seminar6.Solid3Ocp1.src.solid.ocp;

public class Circle implements Shape{
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
