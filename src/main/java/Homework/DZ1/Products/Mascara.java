package Homework.DZ1.Products;

public class Mascara extends Cosmetics{
    private String waterResistance;
    public Mascara(String name, String brand, double cost, String type, Integer weight, String waterResistance) {
        super(name, brand, cost, type, weight);
        this.waterResistance = waterResistance;
    }
    public String getWaterResistance() {
        return this.waterResistance;
    }
    @Override
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f, type: %s, weight: %d, waterResistance: %s",
                getName(), getBrand(), getCost(), getType(), getWeight(), getWaterResistance());
    }
}
