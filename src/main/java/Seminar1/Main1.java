package Seminar1;

public class Main1 {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProductList().add(new Product("Яблоко", 10));
        vendingMachine.getProductList().add(new Product("Груша", 20));
        vendingMachine.getProductList().add(new Product("Яблоко1", 10));
        vendingMachine.getProductList().add(new Baton("Батончик Марс", 10, 10));
        vendingMachine.getProductList().add(new SuperBaton("Большой Батончик Марс", 10, 10.43333, TypeSize.BIG));


        for (Product product : vendingMachine.getProductList()) {
//            System.out.println(product.getName() + ": " + product.getCost());
            System.out.println(product);
        }
    }
}