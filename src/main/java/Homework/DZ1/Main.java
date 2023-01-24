package Homework.DZ1;
import Homework.DZ1.Products.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product skinCare = new SkinCare("Eye cream", "Maybelline", 600.0, "Dry", "cream");
        Product cream = new Cream("Face cream", "Nivea", 400.0, "Oily", "cream");
        Product tonic = new Tonic("Face tonic", "Librederm", 500.0, "Dry", "liquid", 200);
        Product showerAccessories = new ShowerAccessories("Body milk", "Camay", 400.0, "Floral");
        Product shampoo = new Shampoo("Shampoo", "Palmolive", 300.0, "Forest", "liquid");
        Product showerGel = new ShowerGel("Shower gel", "L'occitane", 300.0, "Mountain", 5.5);
        Product soap = new Soap("Soap", "Camay", 100.0, "Lemon");
        Product cosmetics = new Cosmetics("Foundation", "Dior", 2000.0, "Professional", 100);
        Product mascara = new Mascara("Mascara", "NYX", 1500.0, "Professional", 50, "water resistance");
        Product lipstick = new Lipstick("Lipstick", "La Roche-Posay", 650.0, "Pharmacy", 25, 2.5);
        Product shadows = new Shadows("Eye shadow", "Lancome", 2000.0, "Professional", 30, "water resistance", "baked");


        List<Product> products = List.of(skinCare, cream, tonic, showerAccessories, shampoo, showerGel, soap, cosmetics, mascara, lipstick, shadows);
        for (Product element : products) {
            Program.printData(element);
        }

    }
}
