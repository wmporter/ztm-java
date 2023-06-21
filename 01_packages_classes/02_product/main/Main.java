package main;

import inventory.Product;
import inventory.Inventory;
import inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        Inventory i = new Inventory();
        Warehouse w = new Warehouse();
        
        p.price = 2400.32;
        p.productName = "candle";
        w.warehouseName = "Warehouse 13";
        i.product = p;
        
        System.out.println("price: " + p.price);
        System.out.println("warehouse name: " + w.warehouseName);
        System.out.println("inventory product name: " + i.product.productName);
    }
}
