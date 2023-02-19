package Seminar6.Solid5Lsp2.src.solid.lsp;

public class ClientOrder extends Order{
    private int price;
    private int qnt;

    public ClientOrder(int price, int qnt) {
        super(price, qnt);
    }

    public int getAmount() {
        return qnt * price;
    }

}
