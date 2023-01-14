package Lecture.Lecture1;

public class Program1 {
    //обычно описываем так
//    static double distance(int x1, int y1, int x2, int y2) {
//        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//    }
//
//    public static void main(String[] args) {
//        int ax = 0;
//        int ay = 0;
//        int bx = 0;
//        int by = 0;
//        System.out.println(distance(ax, ay, bx, by));
//    }

    // с учетом полей х и у в point2D.java

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
//        a.setX(12); // отдельно чтение и запись получается
        // хорошо для логина и пароль
        // логин видят все, но никто не может изменить
        // пароль не видят все, но только 1 чел может изменить
//        Point2D a = new Point2D(); // a -экземпляр класса, он будет размещаться в стеке
//        a.x = 0;
//        a.y = 2;
//        System.out.println(a.toString());
        System.out.println(a.getInfo());
        System.out.println(a.getX());
        System.out.println(a.getY()); // чтобы обойти private int x,y

        Point2D b = new Point2D(0);
//        Point2D b = new Point2D(); // b -экземпляр класса
//        b.x = 0;
//        b.y = 10;
        System.out.println(b.toString());
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
