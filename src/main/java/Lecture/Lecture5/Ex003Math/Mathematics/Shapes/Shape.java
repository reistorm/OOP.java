package Lecture.Lecture5.Ex003Math.Mathematics.Shapes;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    protected double area; // площадь фигуры
    protected String name; // имя фигуры

    public double getArea() {
        return area;
    }

    protected void setArea(double value) { // поиск площади
        area = value;
    }

    public void setNane(String value) {
        name = value;
    }

    public String getNane() {
        return name;
    }

    public List<Shape> shapes = new ArrayList<Shape>(); // фигура может содержать перечень фигур

    private void Print(StringBuilder sb, String indent) { // печать
        sb.append(String.format("%s %s %s\n", indent, name, getArea()));

        for (Shape shape : shapes)
            shape.Print(sb, indent + "  ");  // Print будет рекурсивно обходить фигуры и выбирать то, что нужно
    }

    @Override
    public String toString() { // перегрузка метода toString
        StringBuilder sb = new StringBuilder();
        Print(sb, ""); // вызывает рекурсивно Print из печати выше
        return sb.toString();
    }
}
