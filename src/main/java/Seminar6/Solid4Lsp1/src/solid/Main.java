package Seminar6.Solid4Lsp1.src.solid;

import Seminar6.Solid4Lsp1.src.solid.lsp.Rectangle;
import Seminar6.Solid4Lsp1.src.solid.lsp.Shape;
import Seminar6.Solid4Lsp1.src.solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.setSide(4);
        System.out.printf("В прямоугольнике сторона A = %d, сторона B = %d\n", square.getSide(), square.getSide());
        ViewShape view = new ViewShape(square);
        view.showArea();
    }
}
