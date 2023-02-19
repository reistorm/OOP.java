package Seminar6.Solid3Ocp1.src.solid.ocp;

public class Square  implements Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }
}
