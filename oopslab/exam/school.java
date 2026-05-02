/*
 A school has two types of students. Science students have theory marks across subjects plus a practical component that contributes to their total and average. Arts students have theory marks and an elective subject. Both share common attributes and a way to compute and display results. Model this and show that calling display() on a mixed collection of students produces the correct output for each type.
 */
abstract public class student
{
    double[] tmarks;
    double[] subtotal;
    double total;
    double avg;
    int n;
    
    student(double[] tmarks, int n)
    {
        this.tmarks = tmarks;
        this.n = n;
        tmarks = new double[n];
    }
    
    abstract public void display();
    abstract public double compute();
}
public class sstudent extends student
{
    double[] pmarks;
    sstudent(double[] tmarks, double[] pmarks, int n)
    {
        super(tmarks, n);
        this.pmarks = pmarks;
        pmarks = new double[n];
        subtotal = new double[n];
    }
    public double compute()
    {
        for(int i=0; i<n;i++)
        {
            subtotal[i] = pmarks[i] + tmarks[i];
            total += subtotal[i];
        }
        avg = total/n;
        return avg;
    }
}
public class sstudent extends student
{
    double elective;
    sstudent(double[] tmarks, double elective, int n)
    {
        super(tmarks, n);
        this.elective = elective;
    }
    public double compute()
    {
        for(int i=0; i<n;i++)
        {
            total += tmarks[i];
        }
        avg = (total+elective)/n;
        return avg;
    }
}

import java.util.*;
public class school
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students")
    }
}
