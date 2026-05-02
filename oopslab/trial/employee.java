/**
 Define a class Employee with the following attributes:
Data Members:
 o Employee Name
 o Employee ID
 o Designation
 o Basic Salary
 o Static variable: Company Name
Methods:
 o A parameterized constructor to accept employee details.
 o A method calculateSalary() that computes net salary by
 adding allowances (HRA, DA) and deducting tax.
 o A method displayDetails() to show employee details.
 o A static method to display the company name.
 Create objects and illustrate all methods.
 
Example Input/Output:
 Enter number of employees: 1
 Enter details for Employee 1:
 Name: Dr Ritu Kumar
 Employee ID: MAHE101
 Designation: Professor
 Basic Salary: 7600
 
 Employee Details:
 Name: Dr Ritu Kumar
 Employee ID: MAHE101
 Designation: Professor
 Basic Salary: $7600.0
 Net Salary: $8100.0
 Company Name: MAHE
 */

import java.util.*;
public class employee
{
    Scanner sc = new Scanner(System.in);
    static String comp = "MAHE";
    String name;
    int id;
    String des;
    float basic;
    
    employee(String name, int id, String des, float basic)
    {
        this.name = name;
        this.id = id;
        this.des = des;
        this.basic = basic;
    }
    float calculateSalary()
    {
        System.out.println("Enter HRA: ");
        float hra = sc.nextFloat();
        System.out.println("Enter DA: ");
        float da = sc.nextFloat();
        System.out.println("Enter Tax rate: ");
        float rate = sc.nextFloat();
        float total = (basic + hra + da);
        total *= (1 - (rate/100.0f));
        return total;
    }
    void displayDetails()
    {
        System.out.println("Employee Details: ");
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Designation: "+des);
        System.out.println("Basic Salary: "+basic);
    }
    static void compName()
    {
        System.out.println("Company Name: "+comp);
    }
    
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        employee[] e = new employee[n];
        for(int i =0; i<n; i++)
        {
            System.out.println("Enter details of employee "+(i+1)+": ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Employee ID: ");
            int id  = sc.nextInt();
            sc.nextLine();
            System.out.print("Designation: ");
            String des = sc.nextLine();
            System.out.print("Basic salary: ");
            float basic  = sc.nextFloat();
            e[i] = new employee(name, id, des, basic);
            float netsal = e[i].calculateSalary();
            e[i].displayDetails();
            employee.compName();
            System.out.println("Net Salary: "+netsal);

        }

    }
}
