/*
 
 Define a class to represent a Bank account. Include the following members.
 
 Data members:
 a. Name of the depositor
 b. Account number.
 c. Type of account.
 d. Balance amount in the account.
 e. Rate of interest (static data)
 Provide a default constructor and parameterized constructor to this class. Also
 provide Methods:
 a. To deposit amount.
 b. To withdraw amount after checking for minimum balance.
 c. To display all the details of an account holder.
 d. Display rate of interest (a static method)
 
 Illustrate all the constructors as well as all the methods by defining objects.
 
 */
/*
 Define a class to represent a Bank account. Include the following members.
*/
import java.util.*;
public class BANK
{
    String name;
    long acc;
    String type;
    float bal;
    static float r;

    BANK()
    {
        name = "";
        acc = 0;
        type = "";
        bal = 0.0f;
        r = 0.0f;
    }

    BANK(String name, long acc, String type, float bal, float r)
    {
        this.name = name;
        this.acc = acc;
        this.type = type;
        this.bal = bal;
        this.r = r;
    }

    public void deposit(float d)
    {
        bal += d;
        System.out.println("Amount Deposited: " + d);
    }

    public void withdraw(float w)
    {
        if(bal - w >= 500)
        {
            bal -= w;
            System.out.println("Amount Withdrawn: " + w);
        }
        else
        {
            System.out.println("Minimum balance must be maintained!");
        }
    }

    public void display()
    {
        System.out.println("Name of customer: "+name);
        System.out.println("Account No: "+acc);
        System.out.println("Account type: "+type);
        System.out.println("Balance: "+bal);
    }

    static void rate(float rate)
    {
        r = rate;
        System.out.println("Rate of interest: "+r);
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        BANK b1 = new BANK();

         BANK b = new BANK("Fahad",123456789L,"Savings",5000.0f,6.5f);

        b.display();
        BANK.rate(r);

        System.out.println("Enter your option: \n1. Deposit\n2. Withdraw");
        int op = sc.nextInt();

        if (op == 1)
        {
            System.out.println("Enter amount to deposit:");
            float amt = sc.nextFloat();
            b.deposit(amt);
        }
        else if (op == 2)
        {
            System.out.println("Enter amount to withdraw:");
            float amt = sc.nextFloat();
            b.withdraw(amt);
        }
        else
            System.out.println("Invalid Input");

        b.display();
    }
}


























//import java.util.*;
//
//public class BANK
//{
//    String name;
//    int acc;
//    String type;
//    int bal;
//    float rate;
//    BANK()
//    {
//        
//    }
//    BANK(String name, int acc, String type, int bal, float rate)
//    {
//        this.name = name;
//        this.acc = acc;
//        this.type = type;
//        this.bal = bal;
//        this.rate = rate;
//    }
//    public int deposit()
//    {
//        System.out.println("Enter amount to be deposited: ");
//        int dep = sc.nextInt();
//        bal += dep;
//    }
//    public int withdraw()
//    {
//        System.out.println("Enter amount to be withdrawn: ");
//        int wit = sc.nextInt();
//        bal -= wit;
//    }
//    public int display()
//    {
//        System.out.println("Name of customer: "+name);
//        System.out.println("Account No: "+acc);
//        System.out.println("Account type: "+type);
//        System.out.println("Balance: "+bal);
//    }
//    public static interest()
//    {
//        
//    }
//    
//    public static void main()
//    {
//        Scanner sc = new Scanner(System.in);
//        BANK b = new BANK();
//        b.display();
//        System.out.println("Enter your option: /n1. Deposit/n2. Withdraw");
//        int op = sc.nextInt();
//        if ( op == 1)
//        {
//            b.deposit();
//        }
//        else if ( op == 2)
//        {
//            b.withdraw();
//        }
//        else
//            System.out.println("Invalid Input");
//        b.display();
//        
//    }
//}
