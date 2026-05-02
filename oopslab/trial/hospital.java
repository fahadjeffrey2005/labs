/**
 
 A hospital manages patient appointments. Each patient has a name, age, and department (General/Specialist/Emergency). Fees differ per department. Senior citizens (age > 60) get a 15% discount. Track total patients registered using a static member. Demonstrate constructor and method overloading.
 
 */
import java.util.*;
public class hospital
{
    String name;
    int age;
    String dept;
    float fees;
    static int count;
    
    hospital(String name, int age)
    {
        this.name = name;
        this.age = age;
        dept = "General";
        count++;
    }
    hospital(String name, int age, String dept)
    {
        this.name = name;
        this.age = age;
        this.dept = dept;
        count++;
    }
    void calculateFees()
    {
        if (dept.equals("General"))
            fees = 1000;
        else if (dept.equals("Specialist"))
            fees = 3000;
        else if (dept.equals("Emergency"))
            fees = 3500;
        else
        {
            System.out.println("Invalid Dept.");
            fees = 0;
        }
    }
    void calculateDiscount()
    {
        if (age>60)
            fees *= 0.85;
    }
    void calculateDiscount(int per)
    {
            fees *= (1 - (per/100.0f));
    }
    
    void display()
    {
        System.out.println("Patient details: ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Dept: "+dept);
        System.out.println("Fees: "+fees);
    }
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();
        hospital[] h = new hospital[n];
        for (int i =0; i<n; i++)
        {
            System.out.println("Patient "+(i+1)+": ");
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Specific Dept. applicable: Y/N? ");
            char op1 = sc.next().charAt(0);
            sc.nextLine();
            if (op1 == 'Y')
            {
                System.out.println("Enter dept name: ");
                String dept = sc.nextLine();
                h[i] = new hospital(name,age,dept);
            }
            else
                h[i] = new hospital(name,age);
            
            h[i].calculateFees();
            
            System.out.println("Special discount applicable: Y/N? ");
            char op2 = sc.next().charAt(0);
            sc.nextLine();
            if (op2 == 'Y')
            {
                System.out.println("Enter discount percentage: ");
                int per = sc.nextInt();
                h[i].calculateDiscount(per);
            }
            else
                h[i].calculateDiscount();
        }
        
        for (int i =0; i<n; i++)
        {
            System.out.println((i+1)+" :");
            h[i].display();
        }
        
    }
}
