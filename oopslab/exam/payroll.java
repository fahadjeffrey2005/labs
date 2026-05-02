/**
 
 Question 1: Corporate Payroll System (Inheritance, Abstraction, and Polymorphism)
 Design a Java program for a corporate payroll system that manages different types of employees. The system must handle Salaried Employees (fixed weekly pay), Hourly Employees (overtime pay at 1.5x after 40 hours), and Commission Employees (paid a percentage of sales). Use an abstract base class to enforce a common structure for name and salary computation. Implement the system using an array of objects to store at least five different employees and use dynamic method dispatch to iterate through the array and display the final computed salary for each individual. The program should output the name and the final salary based on the specific rules for each employee type.
 
 */
abstract public class Employee
{
    String name;
    double sal;
    
    Employee(String name)
    {
        this.name = name;
    }
    abstract public void compute();
    abstract public void display();
}

class salEmp extends Employee
{
    double pay;
    int weeks;
    salEmp(String name, double pay, int weeks)
    {
        super(name);
        this.pay = pay;
        this.weeks = weeks;
    }
    public void compute()
    {
        sal = pay*weeks;
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Emp Type: Salaried Employee");
        System.out.println("Pay: "+ sal);
    }
}
class hrEmp extends Employee
{
    int hours;
    double rate;
    hrEmp(String name, int hours, double rate)
    {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }
    public void compute()
    {
        
        if(hours <= 40)
            sal = rate*hours;
        else if(hours > 40)
            sal = (rate*40)+(1.5*rate*(hours-40));
        else
            System.out.println("Invalid working hours. ");
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Emp Type: Hourly Employee");
        System.out.println("Pay: "+ sal);
    }
}
class comEmp extends Employee
{
    double sales, percent;
    comEmp(String name, double sales, double percent)
    {
        super(name);
        this.sales = sales;
        this.percent = percent;
    }
    public void compute()
    {
        sal = sales*(percent/100);
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Emp Type: Commission Employee");
        System.out.println("Pay: "+ sal);
    }
}
