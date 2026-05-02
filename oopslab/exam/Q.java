/*
 
 Consider an Interface P with a data member p and a method disp(). Create two interfaces P1 and P2 which inherit interface P. Each interface P1 and P2 has a data member and one method. Create a class Q which implements P1 and P2. Instantiate class Q and invoke each of its methods. Each method displays one of the constants.
 
 */

public interface P
{
    int p=100;
    void disp();
}
interface P1 extends P
{
    int p1=200;
    void disp1();
}
interface P2 extends P
{
    int p2=300;
    void disp2();
}
public class Q implements P1,P2
{
    public void disp();
    {
        System.out.println(p);
    }
    public void disp1();
    {
        System.out.println(p1);
    }
    public void disp2();
    {
        System.out.println(p2);
    }
}
