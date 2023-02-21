package Seminar6.Solid4Lsp1.src.solid.lsp;

public class Square extends Shape {
    private int side;
    public void setSide(int side) {
        this.side = side;
    }
    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }


    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
