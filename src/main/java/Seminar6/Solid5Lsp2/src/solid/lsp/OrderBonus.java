package Seminar6.Solid5Lsp2.src.solid.lsp;

public class OrderBonus extends ClientOrder {

    public OrderBonus(int price, int qnt) {
        super(price, qnt);
    }

    @Override
    public int getAmount() {
        return 0;
    }
}
