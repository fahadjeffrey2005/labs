/**
 
 A retail store needs a program to calculate the final bill for a customer purchasing multiple products. The program should:
 Store the prices of 5 products in an array. Ask the customer to enter a discount percentage and a tax percentage.Find the total price of all
 products before applying any discount or tax. Apply the discount, then add tax, and compute the final amount the customer has to pay.
 Make sure that:
 The total price of products can be stored in a variable that allows decimal values.[type casting]
 The discount and tax percentages, given by the customer, are rounded to whole numbers before use.
 (4)
 Display:
 The total price before applying any discount or tax.
 The amount after applying the discount.
 The final amount the customer must pay after adding tax .
 
 */

import java.util.*;

public class Bill
{
    float[] parr = new float[5];
    float total;
    Scanner sc = new Scanner(System.in);
    float[] inputData()
    {
        System.out.println("Enter the price for 5 products: ");
        for (int i=0; i<5; i++)
        {
            parr[i] = sc.nextFloat();
        }
        return parr;
    }
    float discount(float cost)
    {
        System.out.println("Discount percentage: ");
        int d = Math.round(sc.nextFloat());
        cost *= (1-(d/100.0f));
        return cost;
    }
    float tax(float a[])
    {
        System.out.println("Enter tax percentage: ");
        int t = Math.round(sc.nextFloat());
        for(int i=0; i<5;i++)
        {
            a[i] *= (1+(t/100.0f));
            total += a[i];
        }
        return total;
    }

    public static void main (String[]args)
    {
        Bill b = new Bill();
        float[] arr = new float[5];
        arr = b.inputData();
        float total = 0.0f, dtotal = 0.0f;
        for(int i =0; i<5; i++)
        {
            total += arr[i];
            System.out.println("Product "+(i+1)+": ");
            arr[i] = b.discount(arr[i]);
            dtotal += arr[i];
        }
        float price = b.tax(arr);
        System.out.println("The price for products without discount or tax is: "+total);
        System.out.println("The total price for products without tax is: "+dtotal);
        System.out.println("The final price for products is: "+price);
    }
}
