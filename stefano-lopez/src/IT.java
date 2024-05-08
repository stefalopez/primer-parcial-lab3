public class IT extends Product {
    private String manufacturer;

    public IT() {}

    public IT(Integer stock, String name, Double price, String manufacturer) {
        super(stock, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + " || Marca: " + getManufacturer();
    }
}
