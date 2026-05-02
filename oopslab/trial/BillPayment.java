/*
 
 Define a class called BillPayment with paymenttype,amount,details.For thisgiven BillPayment class, demonstrate constructor
 overloading for three types of payment. That is for cash on delivery, card, and UPI payments. Instantiate the BillPayment class using
 each overloaded constructor. Call the processPayment() method on each instance to display the corresponding payment details.
 
 */
import java.util.*;
public class BillPayment
{
    String paymenttype;
    float amount;
    String name;
    int id;
    
    BillPayment()
    {}
    
    BillPayment(String name, float amount)
    {
        paymenttype = "Cash";
        this.name = name;
        this.amount = amount;
    }
    BillPayment(String name,float amount, int card, int cvv)
    {
        paymenttype = "Card";
        this.name = name;
        this.amount = amount;
    }
    BillPayment(String name, float amount, int upid)
    {
        paymenttype = "UPI ID";
        this.name = name;
        this.amount = amount;
        
    }
    void processPayment(BillPayment b)
    {
        System.out.println("Name of user is: "+b.name);
        System.out.println("Mode of payment is: "+b.paymenttype);
        System.out.println("Amount is: "+b.amount);
        System.out.println("Payment processed. ");
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter option: \n1.Cash \n2.Card \n3.UPI");
        int op = sc.nextInt();
        sc.nextLine();
        BillPayment b = new BillPayment();
        System.out.println("Enter name of user: ");
        b.name= sc.nextLine();
        System.out.println("Enter amount: ");
        b.amount= sc.nextFloat();
        switch(op)
        {
            case 1:
                BillPayment b1 = new BillPayment(b.name, b.amount);
                b.amount = b1.amount;
                b.name = b1.name;
                b.processPayment(b1);
                break;
                
            case 2:
                
                System.out.println("Enter Card No: ");
                int card = sc.nextInt();
                System.out.println("Enter CVV No: ");
                int cvv = sc.nextInt();
                BillPayment b2 = new BillPayment(b.name, b.amount, card, cvv);
                b.amount = b2.amount;
                b.name = b2.name;
                b.processPayment(b2);
                break;
            
            case 3:
                System.out.println("Enter UPI ID: ");
                int upid = sc.nextInt();
                BillPayment b3 = new BillPayment(b.name, b.amount, upid);
                b.amount = b3.amount;
                b.name = b3.name;
                b.processPayment(b3);
                break;
                
            default:
                System.out.println("Invalid payment type.");
                break;
        }
    }
}



