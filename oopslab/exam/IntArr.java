/**
 
 14.    Define a class IntArr with: default constructor, parameterized constructor, display, search, and compare (equality of two arrays) methods.
 
 */
import java.util.*;

public class IntArr
{
    int[] a1;
    int[] a2;
    IntArr()
    {
        a1 = 0;
        a2 = 0;
    }
    IntArr(int[] a1, int[] a2, int n1, int n2)
    {
        this.a1 = a1;
        a1 = new int[n1];
        this.a2 = a2;
        a2 = new int[n2];
    }
    
    void display()
    {
        System.out.println("Enter which array needs to be displayed: ");
        int op= sc.nextInt();
        switch (op)
            {
                    
            }
    }
    
}
