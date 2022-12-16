package Seminar1.Task1;

import java.util.List;

public class VendingMachine {
    
    public void initProducts(List <Product> productlist){
        // Product product = productlist.get(0);
        Product product1 = new Product("coal", 150);        
        Elite product2 = new Elite("Chips", 1.0, 40, 100);
        
    }

    public void getProduct(String name){
        
    }

    public void restore(){
        System.out.println("Напиток выдан");
    }
}
