
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * modified by Mercy Sholola
 * @version 2021.11.18
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Nike AirForce 1s"));
        stock.add(new Product(102, "Adidas ZX Flux "));
        stock.add(new Product(103, "Air Jordan 4s"));
        stock.add(new Product(104, "New Balance WNL"));
        stock.add(new Product(105, "Under Armour Flow Velocity Trainers"));
        stock.add(new Product(106, "Vans Old Skool Trainers"));
        stock.add(new Product(107, "Nike Air Max 270's"));
        stock.add(new Product(108, "Reebok Classic Trainers"));
        stock.add(new Product(109, "Converse All Star Trainers"));
        stock.add(new Product(110, "Pumer Classic Trainers"));
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 500);
        stock.buyProduct(102, 40);
        stock.buyProduct(103, 400);
        stock.buyProduct(104, 50);
        stock.buyProduct(106, 200);
        stock.buyProduct(107, 70);
        stock.buyProduct(108, 300);
        stock.buyProduct(109, 600);
        stock.buyProduct(110, 400);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 100);
        stock.sellProduct(102, 50);
        stock.sellProduct(103, 30);
        stock.sellProduct(104, 500);
        stock.sellProduct(105, 100);
        stock.sellProduct(106, 400);
        stock.sellProduct(107, 100);
        stock.sellProduct(108, 600);
        stock.sellProduct(109, 50);
        stock.sellProduct(110, 300);
    }    
}