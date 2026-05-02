/*
 An online store sells products across categories — Electronics (10% discount), Clothing (25% discount) and Grocery (5% discount). Create abstract class Product with private fields productName, productId, category and price. Create custom exception InvalidPriceException (if price ≤ 0). Throw it in constructor. Add abstract method applyDiscount() and method compare(Product p) that compares prices and displays appropriate message. Derive all three product classes. In main(), create array of at least 5 products, handle exceptions, apply discounts polymorphically and identify product with highest profit margin.
 
 */
public class InvalidPriceException extends Exception
{
    InvalidPriceException(String message)
    {
        super(message);
    }
}

abstract public class Product
{
    private String productName;
    private int productId;
    private String category;
    private double price;
    
    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getProductName()
    {
        return productName;
    }
    
    Product(String productName, int productId, String category, double price) throws InvalidPriceException
    {
        this.productName=productName;
        this.productId=productId;
        this.category=category;
        this.price=price;
        if(price<=0)
            throw new InvalidPriceException("Price of product cannot be lesser than or equal to 0.");
    }
    
    abstract public void applyDiscount();
    abstract public void compare(Product p);
}

class Electronics extends Product
{
    Electronics(String productName, int productId, String category, double price) throws InvalidPriceException
    {
        super(productName,productId,category,price);
    }
    public void applyDiscount()
    {
        setPrice(0.9 * getPrice());
        System.out.println("Discounted price: "+getPrice());
    }
    public void compare(Product p)
    {
        if(getPrice() < p.getPrice())
            System.out.println(p.getProductName()+" is more expensive than "+getProductName());
        else if(getPrice() > p.getPrice())
            System.out.println(getProductName()+" is more expensive than "+p.getProductName());
        else
            System.out.println("Both products have same price.");
    }
}
class Clothing extends Product
{
    Clothing(String productName, int productId, String category, double price) throws InvalidPriceException
    {
        super(productName,productId,category,price);
    }
    public void applyDiscount()
    {
        setPrice(0.75 * getPrice());
        System.out.println("Discounted price: "+getPrice());
    }
    public void compare(Product p)
    {
        if(getPrice() < p.getPrice())
            System.out.println(p.getProductName()+" is more expensive than "+getProductName());
        else if(getPrice() > p.getPrice())
            System.out.println(getProductName()+" is more expensive than "+p.getProductName());
        else
            System.out.println("Both products have same price.");
    }
}
class Grocery extends Product
{
    Grocery(String productName, int productId, String category, double price) throws InvalidPriceException
    {
        super(productName,productId,category,price);
    }
    public void applyDiscount()
    {
        setPrice(0.95 * getPrice());
        System.out.println("Product: "+productName+"\n Discounted price: "+getPrice());
    }
    public void compare(Product p)
    {
        if(getPrice() < p.getPrice())
            System.out.println(p.getProductName()+" is more expensive than "+getProductName());
        else if(getPrice() > p.getPrice())
            System.out.println(getProductName()+" is more expensive than "+p.getProductName());
        else
            System.out.println("Both products have same price.");
    }
}
