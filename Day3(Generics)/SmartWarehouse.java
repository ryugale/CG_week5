import java.util.*;

abstract class WarehouseItem {

    private String name;
    private double weight;

    public WarehouseItem(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "WarehouseItem{name='" + name + "', weight=" + weight + "}";
    }
}

class Electronics extends WarehouseItem {

    public Electronics(String name, double weight) {
        super(name, weight);
    }
}

class Groceries extends WarehouseItem {

    public Groceries(String name, double weight) {
        super(name, weight);
    }
}

class Furniture extends WarehouseItem {

    public Furniture(String name, double weight) {
        super(name, weight);
    }
}

class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class SmartWarehouse {

    public static void main(String[] args) {
        Storage<WarehouseItem> storage = new Storage<>();
        storage.addItem(new Electronics("Joystick", 300));
        storage.addItem(new Furniture("Bench", 5000));
        System.out.println(storage.getItems());
        displayItems(storage.getItems());
    }

    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName());
        }
    }
}