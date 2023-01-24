package Homework.DZ1.Products;

public class ShowerGel extends ShowerAccessories {
    private double pHLevel;
    public ShowerGel(String name, String brand, double cost, String flawor, double pHLevel) {
        super(name, brand, cost, flawor);
        this.pHLevel = pHLevel;
    }
    public double getPhLevel() {
        return this.pHLevel;
    }
    @Override
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f, flawor: %s, pHLevel: %f",
                getName(), getBrand(), getCost(), getFlawor(), getPhLevel());
    }
}
