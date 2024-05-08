public class Chair extends Furniture {
    private Boolean wheels;

    public Chair() {}

    public Chair(Integer stock, String name, Double price, Boolean wheels) {
        super(stock, name, price);
        this.wheels = wheels;
    }

    public Boolean getWheels() {
        return wheels;
    }

    public void setWheels(Boolean wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {

        Boolean wheels = this.getWheels();
        String w;

        if (!wheels) {
            w = "No";
        } else {
            w = "Sí";
        }

        return "** " + this.getClass() + " ------> " + super.toString() + " || Tiene ruedas: "+w;
    }
}
