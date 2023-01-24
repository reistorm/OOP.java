package Homework.DZ1.Products;

public class Shadows extends Mascara {
    private String texture;
    public Shadows(String name, String brand, double cost, String type, Integer weight, String waterResistance, String texture) {
        super(name, brand, cost, type, weight, waterResistance);
        this.texture = texture;
    }
    public String getTexture() {
        return this.texture;
    }
    @Override
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f, type: %s, weight: %d, waterResistance: %s, texture: %s",
                getName(), getBrand(), getCost(), getType(), getWeight(), getWaterResistance(), getTexture());
    }
}
