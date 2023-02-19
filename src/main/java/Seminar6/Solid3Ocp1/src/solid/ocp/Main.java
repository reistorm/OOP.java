package Seminar6.Solid3Ocp1.src.solid.ocp;

// создаем разные фигуры, потом считаем сумму их площадей
import java.util.ArrayList;
import java.util.List;
import Seminar6.Solid3Ocp1.src.solid.ocp.Circle;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add((Shape) new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(5));
        double sumArea = 0;
        for (Shape shape : shapes) {
                sumArea += shape.getArea();
        }

        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}
