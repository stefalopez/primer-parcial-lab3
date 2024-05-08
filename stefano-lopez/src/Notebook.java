public class Notebook extends IT {
    private Integer memory;

    public Notebook() {}

    public Notebook(Integer stock, String name, Double price, String manufacturer, Integer memory) {
        super(stock, name, price, manufacturer);
        this.memory = memory;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "** " + this.getClass() + " ------> " + super.toString() + " Memoria: " + this.getMemory() + "gb";
    }
}
