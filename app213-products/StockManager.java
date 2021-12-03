import java.util.*;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Mercy Sholola
 * @version 18/11/2021
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    // Links Product class dependencies
    private Product product;
    // The quantity of products sold
    private int sellQuantity;
    
    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Adds a product to the arraylist.
     */
    public void addProduct(Product product)
    {
        stock.add(product);
    }
    
    /**
     * Locate a product with the given ID, and return how
     * Many of these items are currently in stock. 
     * If the product ID does not match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        int quantityAmount = 0;
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            { 
                quantityAmount = product.getQuantity();
            }
        }
        return quantityAmount;
    }
    
    /**
     * Print the product's specifications. If found,
     * Its title and stock amount will be displayed..
     * @param id The ID of the product to look for.
     * An error system based on if 
     * and else statements is added to aid user troubleshooting.
     */
    public void printProduct(int id)
    {
        boolean resultSearch = false;
        String productString = null;
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            { 
                resultSearch =true;
                productString = product.toString();
            }
        }
        if(resultSearch  == true)
        {
            System.out.println(productString);
        }
        else
        {
            System.out.println("Invalid ID");
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        System.out.println("======================================");
        System.out.println("         Mercy's Stock List         ");
        System.out.println("======================================");
        System.out.println();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }
        System.out.println("======================================");
        System.out.println();
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct(int id, int quantity)   
    {
        boolean resultSearch = false;
        String productName = null;
        int oldQuantity = 0;
        int newQuantity = 0;
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            { 
                resultSearch = true;
                oldQuantity = product.getQuantity();
                quantity = product.getQuantity() + quantity;
                productName = product.getName();
                product.replaceQuantity(quantity);
                newQuantity = product.getQuantity();
            }
        }
        if(resultSearch  == true)
        {
            System.out.println("======================================");
            System.out.println("Delivered: " + productName);
            System.out.println("======================================");
            System.out.println("Quantity Delivered : " + quantity);
            System.out.println("Stock level        : " + oldQuantity + " --> " + newQuantity);
            System.out.println("======================================");
        }
        else
        {
            System.out.println(" Invalid ID");
        }
        System.out.println();
    }
    
    /**
     * Sell a specified quantity of a product.
     * An error is reported if there appears to be no stock.
     */
    public void sellProduct(int id, int sellQuantity)
    {
        boolean resultSearch = false;
        boolean error = false;
        String productName = null;
        int oldQuantity = 0;
        int newQuantity = 0;
        for(Product product : stock) 
        {
            if(product.getID() == id)
            {
                int quantity = product.getQuantity();
                if(quantity >= sellQuantity) 
                {
                    resultSearch = true;
                    oldQuantity = product.getQuantity();
                    quantity = quantity - sellQuantity;
                    product.replaceQuantity(quantity);
                    newQuantity = product.getQuantity();
                    productName = product.getName();
                }
                else
                {
                    error = true;
                }
            }
            else
            {
                error = false;
            }
        }
        if(resultSearch  == true)
        {
            System.out.println("======================================");
            System.out.println("Sold: " + productName);
            System.out.println("======================================");
            System.out.println("Quantity Sold : " + sellQuantity);
            System.out.println("Stock level   : " + oldQuantity + " --> " + newQuantity);
            System.out.println("======================================");
        }
        else if(error = true)
        {
            System.out.println("Quantity inadequate");
        }
        else
        {
            System.out.println("Invalid ID");
        }
        System.out.println();
    }
    
    /**
     * Renames a product using its ID as an identifier
     * An error is reported if there appears to be no stock.
     * For easier user troubleshooting, 
     * an error system based on if and else statements is included.
     */
    public void renameProduct(int id, String newName)
    {
        boolean resultSearch = false;
        String oldName = null;
        for(Product product : stock) 
        { 
            if(product.getID() == id)
            { 
                resultSearch = true;
                oldName = product.getName();
                product.replaceName(newName);
            }
        }
        if(resultSearch  == true)
        {
            System.out.println("Replaced '" + oldName + "' with '" + newName + "'");
        }
        else
        {
            System.out.println("Invalid ID");
        }
        System.out.println();
    }
    
     /**
     * Removes data from array list using the ID to locate the data
     */
    public void removeProduct(int id)
    {
        stock.removeIf(product -> product.getID() == id);
    }
    
    /**
     * Finds a product using syntax similar to arraylist items
     * For easier user troubleshooting, 
     * an error system based on if and else statements is included.
     */
    public void findProduct(String name)
    {
        boolean resultSearch = false;
        System.out.println("======================================");
        System.out.println("            Search for products       ");
        System.out.println("======================================");
        System.out.println();
        for(Product product : stock) 
        { 
            if(product.getName().contains(name))
            {
                resultSearch = true;
                System.out.println(product.toString());
            }
        }
        if(resultSearch == false)
        {
            System.out.println("Sorry, no products have been found");
        }
        System.out.println();
        System.out.println("======================================");
        System.out.println("You searched: '" + name + "'");
        System.out.println("======================================");
        System.out.println();
    }
    
    /**
     * Searches product quantity through a loop with if statement to filter low stock
     * For easier user troubleshooting, 
     * an error system based on if and else statements is included.
     */
    public void lowStockFinder()
    {
        boolean resultSearch = false;
        System.out.println("======================================");
        System.out.println("           Stock shortages            ");
        System.out.println("======================================");
        System.out.println();
        for(Product product : stock) 
        { 
            if(product.getQuantity() <= 5)
            {
                resultSearch = true;
                System.out.println(product.toString());
            }
        }
        if(resultSearch == false)
        {
            System.out.println("No low stock products found");
        }
        System.out.println("======================================");
        System.out.println();
    }
}