public class Printer extends IT {
    private Integer printsPerMinute;

    public Printer() {}

    public Printer(Integer stock, String name, Double price, String manufacturer, Integer printsPerMinute) {
        super(stock, name, price, manufacturer);
        this.printsPerMinute = printsPerMinute;
    }

    public Integer getPrintsPerMinute() {
        return printsPerMinute;
    }

    public void setPrintsPerMinute(Integer printsPerMinute) {
        this.printsPerMinute = printsPerMinute;
    }

    @Override
    public String toString() {
        return "** " + this.getClass() + " ------> " + super.toString() + " || Impresiones por minuto: " + this.getPrintsPerMinute();
    }
}
