package Homework.DZ1.Products;

public class SkinCare extends Product {
    private String skinType;
    private String groundSubstance;
    public SkinCare(String name, String brand, double cost, String skinType, String groundSubstance) {
        super(name, brand, cost);
        this.skinType = skinType;
        this.groundSubstance = groundSubstance;
    }
    public String getSkinType() {
        return this.skinType;
    }
    public String getGroundSubstance() {
        return this.groundSubstance;
    }
    @Override
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f, skinType: %s, ground substance:%s",
                getName(), getBrand(), getCost(), getSkinType(), getGroundSubstance());
    }
}
