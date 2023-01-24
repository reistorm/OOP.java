package Homework.DZ1.Products;

public class Soap extends ShowerAccessories {
    public Soap(String name, String brand, double cost, String flawor) {
        super(name, brand, cost, flawor);
    }
    @Override
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f, flawor: %s",
               getName(), getBrand(), getCost(), getFlawor());
    }
}
