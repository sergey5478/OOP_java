package Homework1;

import java.util.ArrayList;
import java.util.List;

/*
 * 1.Создать наследника реализованного класса HotDrink с дополнительным полем int температура.
 * 2.Создать класс HotDrinkVendingMachine, реализующий интерфейс VendingMachine и реализовать 
 * перегруженный метод getProduct(String name,double volume, double temperature), выдающий 
 * продукт соответствующего имени, объема и температуры.
 * 3.В main проинициализировать несколько экземпляров HotDrink и HotDrinkVendingMachine и 
 * воспроизвести логику заложенную в программе
 * 4.Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {
    public static void main(String[] args) {
        List<VendingMachine> vendingMachines = new ArrayList<>();
        vendingMachines.add(new VendingMachine());
        vendingMachines.add(new HotDrinkVendingMachine());

        for (VendingMachine vm : vendingMachines) {
            VendingMachine.getHotDrink("Drinkes ", 10.5, 36);
        }
        for (VendingMachine vm : vendingMachines) {
            vm.initProducts();
        }
    }
}
