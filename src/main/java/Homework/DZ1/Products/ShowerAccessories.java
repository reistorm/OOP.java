package Homework.DZ1.Products;

public class ShowerAccessories extends Product{
    private String flawor;
    public ShowerAccessories(String name, String brand, double cost, String flawor){
        super(name, brand, cost);
        this.flawor = flawor;
    }
    public String getFlawor() {
        return this.flawor;
    }
    @Override
    public String toString() {
        return String.format("name: %s, brand: %s, cost: %f, flawor: %s",
                getName(), getBrand(), getCost(), getFlawor());
    }
}
