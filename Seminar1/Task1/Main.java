package Seminar1.task1;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Реализуйте класс Product (товар), содержащий данные о товаре, и VendingMachine 
 * (торговый автомат), содержащий в себе методы initProducts (List <Product>) и 
 * getProduct (String name)
 * 2. Реализовать конструкторы, get/set методы, построить логику VendingMachine на основе 
 * кода реализованного в задании 1.
 * 3. Реализовать наследника класса Product, добавив новому классу доп переменную 
 * (например вес или объем напитка). Реализовать наследника класса VendingMachine, 
 * продающий только конкретный продукт.
 * 4. Реализовать у класса VendingMachine, метод void restore() и реализовать логику.Создать 
 * в main список из нескольких объектов VendingMachine и нескольких объектов его наследников.
 * Вызвать метод restore() для каждого элемента в списке. Переопределить метод restore() 
 * у потомков и повторить пункт 3
 */
public class Main {
    public static void main(String[] args) {
        List <VendingMachine> vm = new ArrayList<>();
        vm.add(new VendingMachine());
        vm.add(new TestVM());

        for(VendingMachine i : vm){
            i.restore();
        }
    }
}
