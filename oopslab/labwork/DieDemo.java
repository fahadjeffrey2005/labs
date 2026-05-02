/*
 
 Create a Die class with one integer instance variable called sideUp. Give it a
 getSideUp() method that returns the values of sideUp and a void roll() method that
 changes sideUpto a random value from 1 to 6.Then create a DieDemo class with a
 method that creates two Die objects, rolls them, and prints the sum of the two sides
 up.
 
 */
public class DieDemo
{
    public static void main(String[]args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        int o1,o2;
        d1.roll();
        d2.roll();
        o1 = d1.getSideUp();
        o2 = d2.getSideUp();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println("SUM: "+ (o1+o2));
    }
}

