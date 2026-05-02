/*
 A company tracks how many employee objects have been created at any point. Each employee has an ID that is automatically assigned in sequence starting from 1 — no two employees should ever share an ID and the ID should not be set manually. Each employee also has a name and a salary. Build this and demonstrate that the count and IDs are correct after creating several employees.
 
 */
public class employee
{
    int count = 0;
    String name;
    double salary;
    
    employee(name, salary)
    {
        this.name = name;
        this.salary = salary;
        count++;
    }
    void display()
    {
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
        System.out.println("ID: "+ count);
    }
}

import java.util.*;
public class employeeDemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        employee[] e = new employee[n];
        
        for(int i =0; i<n; i++)
        {
            System.out.println("Employee "+(i+1)+": ");
            System.out.println("Name: ");
            String name = sc. nextLine();
            System.out.println("Salary: ");
            double salary = sc. nextDouble();
            e[i] = new employee(name, salary);
        }
        for(int i=0; i<n; i++)
        {
            e[i].display();
        }
    }
}
