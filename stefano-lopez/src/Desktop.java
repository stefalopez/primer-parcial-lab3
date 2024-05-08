public class Desktop extends Furniture {
    private Double height;
    private Double width;

    public Desktop() {}

    public Desktop(Integer stock, String name, Double price, Double height, Double width) {
        super(stock, name, price);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "** " + this.getClass() + " ------> " + super.toString() + " || Altura: " + this.getHeight() + "cm || Ancho: " + this.getWidth() + "cm";
    }
}
