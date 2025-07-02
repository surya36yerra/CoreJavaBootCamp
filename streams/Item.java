package streams;

public class Item {
    private String name;
    private double price;

    public boolean isInStock() {
        return inStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOutStock() {
        return outStock;
    }

    private boolean inStock;
    private boolean outStock;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", outStock=" + outStock +
                '}';
    }

    public Item(String name, double price, boolean inStock, boolean outStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.outStock = outStock;
    }
}
