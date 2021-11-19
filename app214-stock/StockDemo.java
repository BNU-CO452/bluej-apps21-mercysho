
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Mercy Sholola
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
        
        stock.add(new Product(101, "Nike AF 1's"));
        stock.add(new Product(102, "Adidas Flux"));
        stock.add(new Product(103, "Air Jordan 4's"));
        stock.add(new Product(104, "Air Jordan 1's"));
        stock.add(new Product(105, "New Balance Wind Runners"));
        stock.add(new Product(106, "Balenciaga Speed Sneakers"));
        stock.add(new Product(107, "Reebok Classics"));
        stock.add(new Product(108, "Puma Classics"));
        stock.add(new Product(109, "Nike AirMax 270's"));
        stock.add(new Product(110, "Nike AirMax 95's"));
        
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
        stock.buyProduct(101,500);
        stock.buyProduct(102,300);
        stock.buyProduct(103,600);
        stock.buyProduct(104,50);
        stock.buyProduct(105,500);
        stock.buyProduct(106,200);
        stock.buyProduct(107,600);
        stock.buyProduct(108,20);
        stock.buyProduct(109,700);
        stock.buyProduct(110,500);
    }

    private void sellProducts()
    {
        stock.sellProduct(101,400);
        stock.sellProduct(102,500);
        stock.sellProduct(103,200);
        stock.sellProduct(104,500);
        stock.sellProduct(105,600);
        stock.sellProduct(106,200);
        stock.sellProduct(107,100);
        stock.sellProduct(108,900);
        stock.sellProduct(109,400);
        stock.sellProduct(110,500);
    }    
}