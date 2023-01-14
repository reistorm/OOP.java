package Lecture.Lecture1;

public class Point2D {
    private int x, y; // поля

    public Point2D(int valueX, int valueY) { // Point2D не метод, тк нет возвращаемого типа
        x = valueX;
        y = valueY;
    }
    public int getX() { // чтобы обойти private int x,y
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int value) {
        this.x = value;
    }
    public void setY(int value) {
        this.y = value;
    }
//    public Point2D() {
//        x = 0;
//        y = 0;
//    }
//    public Point2D(int value) {
//        x = value;
//        y = value;
//    }

    public Point2D(int value) {
        this(value, value);
    }
    public Point2D() {
        this(0);
    }

    // метод для описания точек
    public String getInfo() {
        return String.format("x: %d, y:%d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
    public static double distance(Point2D a, Point2D b) {

        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
