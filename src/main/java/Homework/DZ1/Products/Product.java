package Homework.DZ1.Products;

public class Product {
    private String name;
    private String brand;
    private Double cost;

    public Product(String name, String brand, double cost) {
        this.name = name;
        this.brand = brand;
        this.cost = cost;
    }
    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }
    public Double getCost() {
        return this.cost;
    }
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f", getName(), getBrand(), getCost());
    }
}


