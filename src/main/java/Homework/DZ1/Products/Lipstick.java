package Homework.DZ1.Products;

public class Lipstick extends Cosmetics {
    private Double longevity;
    public Lipstick(String name, String brand, Double cost, String type, Integer weight, Double longevity) {
        super(name, brand, cost, type, weight);
        this.longevity = longevity;
    }
    public Double getLongevity() {
        return this.longevity;
    }
    @Override
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f, type: %s, weight: %d, longevity: %f",
                getName(), getBrand(), getCost(), getType(), getWeight(), getLongevity());
    }
}
