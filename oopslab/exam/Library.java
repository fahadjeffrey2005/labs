/**
 
 A library management system needs to track books. Each book has a title (String),
 author (String), price (double) and isAvailable (boolean). The library wants to
 apply a discount on books — Fiction books get 15% discount, Science books get
 10% discount and all others get 5% discount. The discount logic must be in a
 separate method applyDiscount() that takes the category (String) as parameter
 and returns the updated price after discount. Also compute the profit margin
 (price - discountedPrice) for each book. Design and implement the complete Java
 program using an array of at least 4 Book objects and identify the book with the
 highest discount amount.
 
 */

import java.util.*;

class book
{
    String name, author, cat;
    double price,dprice;
    boolean isAvailable;
    
    book(String name, String author, String cat, double price, boolean isAvailable)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
        this.cat = cat;
    }
    
    
    double applyDiscount(String cat)
    {
        if("fiction".equalsIgnoreCase(cat))
        {
            dprice = price * 0.85;
        }
        else if("science".equalsIgnoreCase(cat))
        {
            dprice = price * 0.9;
        }
        else
        {
            dprice = price * 0.95;
        }
        return dprice;
    }
    
    double margin()
    {
        return (price-dprice);
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
        System.out.println("Category: "+cat);
        System.out.println("Price: "+price);
        System.out.println("Discounted price: "+dprice);
        System.out.println("Margin: "+(price-dprice));
        System.out.println("Available: "+isAvailable);
    }
}

public class Library
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        book[] b;
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        b = new book[n];
        
        for(int i =0; i<n; i++)
        {
            System.out.println("Enter details of book "+(i+1)+": ");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Author: ");
            String author = sc.nextLine();
            System.out.println("Category: ");
            String cat = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            System.out.println("Available? (0/1): ");
            int op = sc.nextInt();
            boolean isAvailable;
            if(op == 1)
                isAvailable = true;
            else
                isAvailable = false;
            b[i] = new book(name, author, cat, price, isAvailable);
            b[i].applyDiscount(cat);
        }
        double max = b[0].margin();
        String maxn = b[0].name;
        for(int i=0;i<n;i++)
        {
            System.out.println("Book: "+(i+1)+": ");
            b[i].display();
            if(max<b[i].margin())
            {
                max=b[i].margin();
                maxn = b[i].name;
            }
        }
        System.out.println("Book with max margin of profit: "+maxn);
    }
}

