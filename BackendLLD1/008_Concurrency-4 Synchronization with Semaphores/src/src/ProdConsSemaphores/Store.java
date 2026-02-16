package ProdConsSemaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int max_size;
    private ConcurrentLinkedQueue<Object> items;

    Store(int max_size) {
        this.max_size = max_size;
        this.items = new ConcurrentLinkedQueue<>();
    }

    public int getMax_size() {
        return max_size;
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
    }

    public void removeItem() {
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove();
    }
}
