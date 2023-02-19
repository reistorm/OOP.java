package Seminar6.Solid5Lsp2.src.solid.lsp;

public class FactoryOrder {
    public Orderable create(int price, int qnt, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(price, qnt);
        }
        return new ClientOrder(price, qnt);
    }
}
