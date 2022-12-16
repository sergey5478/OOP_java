package Homework1;

public class VendingMachine {

    public void initProducts() {
        HotDrink hotDrink = new HotDrink("Drink", 101.1);
        HotDrink2 hotDrink2 = new HotDrink2("Drink2", 102.2, 10);
        System.out.println("test");
    }

    public static void getHotDrink(String name, double price, Integer temperature) {
        System.out.println(name + price + " t " + temperature);
    }

}
