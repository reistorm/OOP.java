package Lecture.Lecture5.Ex003Math.Mathematics.CalculateArea;

import Lecture.Lecture5.Ex003Math.Mathematics.Shapes.Shape;
// интерфейс принимает фигуру
public interface Calculate {
    double visit(Shape shape);
}
