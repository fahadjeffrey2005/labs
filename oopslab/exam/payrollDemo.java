import java.util.*;

public class payrollDemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee[] e = new Employee[n];
        for(int i =0; i<n; i++)
        {
            System.out.println("Employee Details: ");
            System.out.println("Name: ");
            sc.nextLine();
            String name  = sc.nextLine();
            
            System.out.println("Type: \n1.Salaried Employee\n2.Hourly Employee\n3.Commission Employee\nSelect option: ");
            int op = sc.nextInt();
            sc.nextLine();
            switch(op)
            {
                case 1:
                {
                    System.out.println("Enter pay rate: ");
                    double pay  = sc.nextDouble();
                    System.out.println("Enter no. of weeks: ");
                    int weeks  = sc.nextInt();
                    e[i] = new salEmp(name, pay, weeks);
                    e[i].compute();
                    break;
                }
                case 2:
                {
                    System.out.println("Enter pay rate: ");
                    double rate  = sc.nextDouble();
                    System.out.println("Enter no. of hours: ");
                    int hours  = sc.nextInt();
                    e[i] = new hrEmp(name, hours, rate);
                    e[i].compute();
                    break;
                }
                case 3:
                {
                    System.out.println("Enter total sales: ");
                    double sales  = sc.nextDouble();
                    System.out.println("Enter percentage of commission: ");
                    double percent  = sc.nextDouble();
                    e[i] = new comEmp(name, sales, percent);
                    e[i].compute();
                    break;
                }
                default:
                {
                    System.out.println("Invalid employment type. ");
                    i--;
                    break;
                }
            }
        }
        
        for(int i =0; i<n; i++)
        {
            e[i].display();
        }
    }
}
