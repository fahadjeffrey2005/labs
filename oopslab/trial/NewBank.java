/**
 
 A bank has accounts. Each account has an owner name (String), account number (int), and balance (double). Create 5 accounts. Display all of them. Find the account with the lowest balance.
 
 */

import java.util.*;
public class NewBank
{
    String name;
    int acc;
    double bal;
    NewBank(String name, int acc, double bal)
    {
        this.name = name;
        this.acc = acc;
        this.bal = bal;
    }
    void display()
    {
        System.out.println("Name of customer is: "+name);
        System.out.println("Account number: "+acc);
        System.out.println("Balance: "+bal);
    }
    
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of customers: ");
        int n = sc.nextInt();
        NewBank[] nb = new NewBank[n];
        sc.nextLine();
        
        for (int i =0; i<n; i++)
        {
            System.out.println("Enter customer "+(i+1)+" details: ");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Account no: ");
            int acc = sc.nextInt();
            System.out.println("Balance: ");
            double bal = sc.nextDouble();
            
            nb[i] = new NewBank(name, acc, bal);
        }
        
        
        for(int i =0; i<n;i++)
        {
            nb[i].display();
        }
    }
}
