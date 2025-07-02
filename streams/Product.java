package streams;

public class Product {
    private String name;

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
