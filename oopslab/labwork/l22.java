/*
 
 For given a 9-digit registration number of a CSE student, identify the year of
 joining. Assuming the first two digits specify the year of joining.
 
 */
import java.util.*;

public class l22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 9 digit reg. no.: ");
        long reg = sc.nextLong();

        if (reg >= (long)Math.pow(10, 8) && reg < (long)Math.pow(10, 9))
        {
            int yr = (int)(reg / (long)Math.pow(10, 7));
            System.out.println("Year of joining: 20" + yr);
        }
        else
        {
            System.out.println("Enter valid reg. no.");
        }
    }
}
