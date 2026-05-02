/**
 
 Abstract + Inheritance + Polymorphism
 A company manages different types of employees.
 Create an abstract class Employee with:
 name, salary
 abstract method calculateBonus()
 Create subclasses:
 PermanentEmployee → bonus = 20% of salary
 ContractEmployee → bonus = 10% of salary
 In main:
 Create an array of at least 4 employees
 Use runtime polymorphism to call calculateBonus()
 Display employee details and bonus
 
 */
import java.util.*;
abstract class Employee
{
    String name;
    double salary;
    abstract void calculateBonus();
}

class PermanentEmployee extends Employee
{
    PermanentEmployee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    void calculateBonus()
    {
        System.out.println("Bonus: "+(salary*0.2));
        System.out.println("Total: "+(salary+(salary*0.2)));
    }
}

class ContractEmployee extends Employee
{
    ContractEmployee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    void calculateBonus()
    {
        System.out.println("Bonus: "+(salary*0.1));
        System.out.println("Total: "+(salary+(salary*0.1)));
    }
}

public class company
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of permanent employees: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the number of contract employees: ");
        int n2 = sc.nextInt();
        Employee[] emp = new Employee[n1+n2];
        System.out.println("Permanent Employee Details: ");
        for (int i=0; i<n1; i++)
        {
            System.out.println((i+1)+": ");
            System.out.println("Name: ");
            sc.nextLine();
            String name1 = sc.nextLine();
            System.out.println("Salary: ");
            double sal1 = sc.nextDouble();
            emp[i] = new PermanentEmployee(name1, sal1);
        }
        
        System.out.println("Contract Employee Details: ");
        for (int i=0; i<n2; i++)
        {
            System.out.println((i+1)+": ");
            System.out.println("Name: ");
            sc.nextLine();
            String name2 = sc.nextLine();
            System.out.println("Salary: ");
            double sal2 = sc.nextDouble();
            emp[n1+i] = new ContractEmployee(name2, sal2);
        }
        
        System.out.println("Employees: ");
        for (int i=0; i<emp.length; i++)
        {
            System.out.println("Name: "+emp[i].name);
            emp[i].calculateBonus();
        }
    }
}
