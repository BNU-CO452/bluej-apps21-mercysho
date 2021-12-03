


import java.util.*;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @modified by Mercy Sholola
 * @version 0.1 25/11/2021
 */
public class StockDemo
{
    // The StockManager class dependencies.
    private StockManager manager;
    // Allows the demo to randomise structured test data
    private Random rand = new Random();
    /**
     * Create a StockManager and populate it with a few
     * sample products inside an arraylist with manager dependencies
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(101, "Nike AF 1's");
        manager.addProduct(102, "Adidas Flux");
        manager.addProduct(103, "Air Jordan 4's");
        manager.addProduct(104, "Air Jordan 1's");
        manager.addProduct(105, "New Balance Wind Runners");
        manager.addProduct(106, "Balenciaga Speed Sneakers");
        manager.addProduct(107, "Reebok Classics");
        manager.addProduct(108, "Puma Classics");
        manager.addProduct(109, "Nike AirMax 270's");
        manager.addProduct(110, "Nike AirMax 95's");
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown
     * Uses a for loop and iterates ID to go through all data
     * Gives a range of 1-12 new stock
     */
    public void demoDelivery()
    {
        for(int id =12; id <= 22; id++)
        {
            manager.deliverProduct(id, rand.nextInt(12) + 1);
        }
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown
     * Uses a for loop and iterates ID to go through all data
     * Scans for the IDs max quantity avoiding any overselling
     */
    public void demoSell()
    {
        for(int id =12; id <= 22; id++)
        {   
            int stockQuantity = manager.numberInStock(id);
            if(stockQuantity < 1)
            {
                stockQuantity = 1;
            }
            manager.sellProduct(id, rand.nextInt(stockQuantity) + 1);
        }
    }
    
    /**
     * Runs all key tasks with the demo data provided
     */
    public void runDemo(String findName)
    {
        manager.findProduct(findName);
        manager.printAllProducts();
        demoDelivery();
        demoSell();
    }
}
