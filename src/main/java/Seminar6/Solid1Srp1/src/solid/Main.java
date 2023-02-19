package Seminar6.Solid1Srp1.src.solid;

import Seminar6.Solid1Srp1.src.solid.srp.Point;
import Seminar6.Solid1Srp1.src.solid.srp.Square;
import Seminar6.Solid1Srp1.src.solid.srp.SquareView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        SquareView squareZoom = new SquareView(5);
        squareZoom.draw(0.5f);
    }
}
