package Seminar6.Solid4Lsp1.src.solid;

import Seminar6.Solid4Lsp1.src.solid.lsp.Rectangle;
import Seminar6.Solid4Lsp1.src.solid.lsp.Shape;

public class ViewShape {
    private Shape shape;

    public ViewShape(Shape shape) {
        this.shape = shape;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(shape.getArea());
    }
}



