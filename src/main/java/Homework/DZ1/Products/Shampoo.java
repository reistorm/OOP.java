package Homework.DZ1.Products;

public class Shampoo extends ShowerAccessories {
    private String condition;
    public Shampoo(String name, String brand, double cost, String flawor, String condition) {
        super(name, brand, cost, flawor);
        this.condition = condition;
    }
    public String getCondition() {
        return this.condition;
    }
    @Override
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f, flawor: %s, condition: %s",
                getName(), getBrand(), getCost(), getFlawor(), getCondition());
    }
}
