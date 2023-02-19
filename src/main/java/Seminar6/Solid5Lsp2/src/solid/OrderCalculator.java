package Seminar6.Solid5Lsp2.src.solid;

import Seminar6.Solid5Lsp2.src.solid.lsp.ClientOrder;
import Seminar6.Solid5Lsp2.src.solid.lsp.Order;
import Seminar6.Solid5Lsp2.src.solid.lsp.Orderable;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator implements Iterable<Orderable> {
    private List<Orderable> orders = new ArrayList<>();

    public void add(Orderable orderable) {
        orders.add(orderable);
    }

    public int calcAmount() {
        int sum = 0;
        for (Orderable order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<Orderable> iterator() {
        return orders.iterator();
    }
}
