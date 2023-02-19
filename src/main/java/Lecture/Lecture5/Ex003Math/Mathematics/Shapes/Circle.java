package Lecture.Lecture5.Ex003Math.Mathematics.Shapes;

import Lecture.Lecture5.Ex003Math.Mathematics.Exceptions.UnacceptableValueException;

public class Circle extends Lecture.Lecture5.Ex003Math.Mathematics.Shapes.Shape {
    
    public static Circle create(double radius, String name) throws UnacceptableValueException {
        // ???...
        if (radius < 0)
            throw new UnacceptableValueException("radius < 0"); // если пишет отриц значение - ошибка

        var instance = new Circle(); //вместо конструктора
        instance.name = name;
        instance.radius = radius;
        return instance;
    }

    public double radius;

    private Circle() {
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() { // РАСЧЕТ площади
        return Math.pow(radius, 2) * Math.PI;
    }

    // @Override
    // public String toString() {
    // // ???...
    // return String.format("Name: %s radius: %s", name, radius);
    // }

}
