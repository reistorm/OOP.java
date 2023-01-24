package Homework.DZ1.Products;

public class Cream extends SkinCare {

    public Cream(String name, String brand, double cost, String skinType, String groundSubstance) {
        super(name, brand, cost, skinType, groundSubstance);
    }
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f, skin type:%s, ground substance: %s",
                getName(), getBrand(), getCost(), getSkinType(), getGroundSubstance());
    }
}
