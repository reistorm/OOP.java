package Homework.DZ1.Products;

public class Cosmetics extends Product {
    private String type;
    private Integer weight;
    public Cosmetics(String name, String brand, double cost, String type, Integer weight) {
        super(name, brand, cost);
        this.type = type;
        this.weight = weight;
    }
    public String getType() {
        return this.type;
    }
    public Integer getWeight() {
        return this.weight;
    }
    @Override
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f, type: %s, weight: %d",
                getName(), getBrand(), getCost(), getType(), getWeight());
    }
}
