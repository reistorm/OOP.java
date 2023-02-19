package Seminar6.Solid4Lsp1.src.solid;

import solid.lsp.Rectangle;
import solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(5);
        rectangle.setSideA(4);
        rectangle.setSideB(5);
        System.out.printf("В прямоугольнике сторона A = %d, сторона B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        solid.ViewShape view = new solid.ViewShape(rectangle);
        view.showArea();
    }
}
