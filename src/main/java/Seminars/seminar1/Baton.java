package Seminars.seminar1;

public class Baton extends Product {
    private double calories;
    public Baton(String name, double cost, double calories) {
        super("Батончик Марс", cost);
        this.calories = calories; // вызов от текущего класса
    }
    public String toString() {
        return String.format(super.toString() + " calories: %f", this.calories);
    }
    public double getCalories() {
        return calories;
    }
}
