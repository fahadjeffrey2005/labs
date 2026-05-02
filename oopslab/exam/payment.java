/*
 
 Write a Java program using inheritance and interfaces to design a Payment Processing System. All payment methods (CreditCard, PayPal) share common functionalities like payment validation and refunds — model these using inheritance from an abstract class. Different methods process payments differently. Logging and notification are optional features — model these using interfaces. Provide code demonstrating how inheritance handles general processing and interfaces handle optional features.
 
 */

interface logging
{
    public void log();
}
interface notification
{
    public void notif();
}
abstract class payment
{
    abstract public void validation();
    abstract public void refund();
}
class paypal extends payment implements logging
{
    public void validation()
    {
        System.out.println("PayPal validation inititated. ");
    }
    public void refund()
    {
        System.out.println("Refund process from PayPal inititated. ");
    }
    public void log()
    {
        System.out.println("Transaction logging. ");
    }
}
class credit extends payment implements notification
{
    public void validation()
    {
        System.out.println("Card validation inititated. ");
    }
    public void refund()
    {
        System.out.println("Refund process from card inititated. ");
    }
    public void notif()
    {
        System.out.println("Transaction notification. ");
    }
}
