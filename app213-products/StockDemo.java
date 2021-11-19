import java.util.*;
/**
 * Display the StockManager and Product classes. 
 * When the StockManager class is completed, 
 * the demonstration becomes properly functional.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @modified by Mercy Sholola
 * @version 18/11/2021
 */
public class StockDemo
{
    // The StockManager class dependencies.
    private StockManager manager;
    // Allows the demo to randomise structured test data
    private Random rand = new Random();
    /**
     * Set up a StockManager with a few sample products in a list 
     * with dependents and populate it with the sample products
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(new Product(101, "Nike AF 1s"));
        manager.addProduct(new Product(102, "Adidas Flux"));
        manager.addProduct(new Product(103, "Air Jordan 4s"));
        manager.addProduct(new Product(104, "Air Jordan 1s"));
        manager.addProduct(new Product(105, "New Balance Wind Runners"));
        manager.addProduct(new Product(106, "Balenciaga Speed Sneakers"));
        manager.addProduct(new Product(107, "Reebok Classics"));
        manager.addProduct(new Product(108, "Puma Classics"));
        manager.addProduct(new Product(109, "Nike AirMax 270's"));
        manager.addProduct(new Product(110, "Nike AirMax 95's"));
        
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. 
     * Displays the details of one product 
     * Iterates over all data using a loop and ID 
     * Gives a range of 1-12 new products
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
     * Scans for the max quantity of IDs to avoid any overselling in a for loop 
     * Iterates through all data with ID to go through all data
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
