public class Product {
    private Integer stock;
    private String name;
    private Double price;

    public Product() {}

    public Product(Integer stock, String name, Double price) {
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double applyDiscount(Double percent) {
        return this.getPrice() - (this.getPrice() * percent / 100);
    }

    public Double updatePrice(Double percent) {
        Double newPrice = this.getPrice() + (this.getPrice() * percent / 100);
        setPrice(newPrice);
        return newPrice;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + " || Precio: $" + getPrice() + " || Stock disponible: " + getStock();
    }
}
