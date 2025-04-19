import java.util.ArrayList;
import java.util.List;

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category=" + category + '}';
    }
}

class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class ProductCatalog {
    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void applyDiscount(Product<? extends Category> product, double percentage) {
        product.setPrice(product.getPrice() * (1 - percentage / 100));
    }
}

public class DynamicMarket {
    public static void main(String[] args) {
        Category ClothingCategory = new Category("Cloths");
        Category BookCategory = new Category("Books");

        Product<Category> tShirt = new Product<Category>("Tshirt", 100000, ClothingCategory);
        Product<Category> harryPotter = new Product<Category>("Harry Potter", 111110, BookCategory);

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(tShirt);
        catalog.addProduct(harryPotter);

        
        System.out.println(harryPotter);
        catalog.applyDiscount(harryPotter, 10);
        System.out.println(harryPotter);
        
    }
}