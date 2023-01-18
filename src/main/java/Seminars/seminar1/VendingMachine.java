package Seminars.seminar1;
// инкапсулаяция - возврат продукта по имени и цене
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> productList;
    public List<Product> getProductList() {
        return productList;
    }
    public Product getProductByName(String name) {
        for(Product product : productList) {
            if(product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }
    public Product getProductByCost(double cost) {
        for (Product product : productList) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }
    public VendingMachine() {
        this.productList = new ArrayList<>();
    }
}
