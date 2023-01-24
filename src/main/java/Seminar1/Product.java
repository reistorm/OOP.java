package Seminar1;

public class Product  {
    private Double cost;
    private String name;
    public Product(String name, double cost) {
        this.cost = cost;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return getName() + ": " + getCost();
    }
    public double getCost() {
        return cost;
    }
}
