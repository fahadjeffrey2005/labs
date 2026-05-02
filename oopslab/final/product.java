/*
 Classes, Objects, Methods
 A store sells grocery products. Each product has a name, an ID, a category, and a price. Build a system that can store multiple products, display each product's details, and compare any two products by price, printing which one is cheaper or whether they cost the same.
 */

public class product
{
    String name, category;
    int id;
    double price;
    
    product(String name, int id, double price, String category)
    {
        this.name = name;
        this.id = id;
        this.price = price;
        this.category = category;
    }
    
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Price: "+price);
        System.out.println("Category: "+category);
    }
    public void compare(product p)
    {
        if(p.price > price)
            System.out.println(p.name+" is more expensive than "+name);
        else if(p.price < price)
            System.out.println(name+" is more expensive than "+p.name);
        else
            System.out.println(p.name+" and "+name+" are of the same price. ");
    }
}


