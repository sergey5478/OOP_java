package Homework1;

public class HotDrinkVendingMachine extends VendingMachine {
    private double volume;

    @Override
    public void initProducts() {
        HotDrink2 hotDrink2 = new HotDrink2("Drink2", 102.2, 10);
        volume += 100.1;
        System.out.println("test2");
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}
