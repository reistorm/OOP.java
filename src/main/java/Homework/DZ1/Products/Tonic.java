package Homework.DZ1.Products;

public class Tonic extends SkinCare{
    private Integer volume;
    public Tonic(String name, String brand, double cost, String skinType, String groundSubstance, Integer volume) {
        super(name, brand, cost, skinType, groundSubstance);
        this.volume = volume;
    }
    public Integer getVolume() {
        return this.volume;
    }
    @Override
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f, skin Type: %s, ground substance: %s, volume: %d", getName(),
                getBrand(), getCost(), getSkinType(), getGroundSubstance(), getVolume());
    }
}
