package Seminar6.Solid5Lsp2.src.solid.lsp;

public abstract class Order implements Orderable {
    protected int price;
    protected int qnt;

    public Order(int price, int qnt) {
        this.price = price;
        this.qnt = qnt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
