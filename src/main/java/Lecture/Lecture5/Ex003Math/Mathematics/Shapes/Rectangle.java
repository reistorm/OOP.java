package Lecture.Lecture5.Ex003Math.Mathematics.Shapes;

public class Rectangle extends Lecture.Lecture5.Ex003Math.Mathematics.Shapes.Shape {

    private double width;
    private double height;

    public static Rectangle create(double width, double height, String name) {
        // ???...
        var instance = new Rectangle();
        instance.name = name;

        instance.width = width;
        instance.height = height;
        return instance;
    }

    private Rectangle() { //скрытый конструктор
    }

    @Override
    public double getArea() { // вычисление площади
        return this.width * this.height;
    }

    @Override
    public String toString() {
        // ???...
        return String.format("Name: %s  width: %d  height: %d", name, width, height);
    }
}
