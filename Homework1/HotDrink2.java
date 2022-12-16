package Homework1;

public class HotDrink2 extends HotDrink {

    private Integer temperature;

    public HotDrink2(String name, double price, Integer temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
