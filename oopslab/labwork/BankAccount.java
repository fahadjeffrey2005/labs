/***
 
 Q12 (5 marks)
 Define a class BankAccount with accountNumber (int), holderName (String), balance (double). Demonstrate constructor overloading for:

 Savings account — takes holderName and initial balance, sets a minimum balance of 1000
 Current account — takes holderName, balance and overdraftLimit (double)
 Fixed deposit — takes holderName, balance and tenure (int, in months)

 Each constructor should set an appropriate accountType (String). Implement processAccount() to display all account details. In main, instantiate all three and call processAccount() on each.

 ***/

import java.util.*;

public class BankAccount
{
    private int accountNumber;
    private String holderName;
    private double balance;
    String accountType;
    
    BankAccount(String name, double bal)
    {
        accountType = "Savings Account";
        name = holderName;
        bal = balance;
    }
    BankAccount(String name, double bal, double overdraftLimit)
    {
        accountType = "Current Account";
        name = holderName;
        bal = balance;
        System.out.println("Limit is set to: "+overdraftLimit);
    }
    BankAccount(String name, double bal, int months)
    {
        accountType = "Fixed Deposit";
        name = holderName;
        bal = balance;
        System.out.println("Time period is: "+months);

    }
    void processAccount(BankAccount b)
    {
        
    }
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of user: ");
        String name = sc.next();
        System.out.println("Enter current balance: ");
        double bal = sc.nextDouble();
        System.out.println("Enter option: \n1.Savings Account \n2. Current Account \n3. Fixed Deposit")
        int op = sc.nextInt
        BankAccount b = new BankAccount();
        
    }
}
