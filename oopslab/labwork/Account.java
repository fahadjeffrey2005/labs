/**
 
 Create an Account class that stores customers name, acc-no and type of account.
 From this derive class current account and savings bank account. Include necessary
 methods to achieve following tasks
 i) Accept the deposit from a customer and update the balance
 ii) Display the balance
 iii) Compute and deposit interest
 iv) Permit withdraw and update the balance
 v) Check for minimum balance impose penalty if necessary and update the balance
 For savings bank account, the facilities provided include computing interest and
 withdrawal. No interest can be computed on current bank account and a minimum
 balance must always be maintained. In any instance when it goes below this level,
 service tax must be imposed.
 
 */

import java.util.*;
public class Account
{
    Scanner sc = new Scanner (System.in);
    String name,type;
    long acc;
    float bal;
    Account()
    {
        name="";
        type="default";
        acc=000;
    }
    
    Account(String name, long acc, String type)
    {
        this.name = name;
        this.acc = acc;
        this.type = type;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + acc);
        System.out.println("Balance: " + bal);
    }
}

class savings extends Account
{
    float rate;
    savings()
    {
        super();
    }
    savings(String name, long acc, String type, float bal, float rate)
    {
        super(name, acc, type);
        this.bal = bal;
        this.rate = rate;
    }
    public void deposit()
    {
        System.out.println("Enter amount to be deposited: ");
        float dep = sc.nextFloat();
        bal += dep;
        System.out.println("New Balance: "+bal);
    }
    public void withdraw()
    {
            System.out.println("Enter amount to be withdrawn: ");
            float with = sc.nextFloat();
            if (bal>with)
            {
                bal -= with;
                System.out.println("New Balance: "+bal);
            }
            else
                System.out.println("Insufficient Balance");
    }
    public void intcompute()
    {
        bal *= (1+rate);
        System.out.println("Balance after interest: "+bal);
    }
    
}
class current extends Account
{
    current(String name, long acc, String type, float bal, float rate)
    {
        super(name, acc, type);
        this.bal = bal;
        this.rate = rate;
    }
    public void deposit()
    {
        System.out.println("Enter amount to be deposited: ");
        float dep = sc.nextFloat();
        bal += dep;
        System.out.println("New Balance: "+bal);
    }
    public void withdraw()
    {
        if (bal>5000)
        {
            System.out.println("Enter amount to be withdrawn: ");
            float with = sc.nextFloat();
            if (bal>with)
            {
                bal -= with;
                System.out.println("New Balance: "+bal);
            }
            else
                System.out.println("Insufficient Balance");
        }
        else
        {
            System.out.println("Account lacks minimum balance: ");
            if (bal>10)
            {
                System.out.println("Penality: Service Tax (2% of current balance) ");
                bal *= 0.98;
                System.out.println("New Balance: "+bal);
            }
        }
    }
}
