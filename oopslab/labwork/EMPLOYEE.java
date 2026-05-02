/*
 
 Define a class EMPLOYEE having following members: Ename, Eid, Basic, DA,
 Gross_Sal, Net_Sal and following methods:
 a. read(): to read N employee details
 b. display(): to display employee details
 c. compute_net_sal(): to compute net salary
 Write a Java program to read data of N employee and compute and display net salary
 of each employee Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT = 30% of
 the gross salary)
 
 To the already defined EMPLOYEE class, add two subclasses FullTimeEmp and
 PartTimeEmp and implement the following:
 i) Include the following data members to the PartTimeEmp class-hoursWorked (int)
 that represents the number of hours worked by the part-time employee and
 hourlyRate (double, static and final) that represents the hourly rate at which the part-
 time employee is paid. Also, override calculateSalary() and
 displayEmployeeDetails() splayEmployeeDetails() method of the base class to
 display the part-time employee's details, including the hours worked and hourly rate.72
 ii) The FullTimeEmployee subclass includes the data members bonus and
 deductions as additional data members and are of type double and overrides the
 calculateSalary() and displayEmployeeDetails() methods to incorporate these
 factors.
 In main(), create various objects to illustrate the functionality of all the classes.
 
*/

import java.util.*;

public class EMPLOYEE
{
    String Ename;
    int Eid;
    float Basic, DA, Gross_Sal, Net_Sal, IT;
    
    EMPLOYEE()
    {

    }

ˀ    EMPLOYEE(String Ename, int Eid, float Basic)
    {
        this.Ename = Ename;
        this.Eid = Eid;
        this.Basic = Basic;
        compute_net_sal();
    }

    public void read()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        Ename = sc.nextLine();

        System.out.println("Enter employee ID: ");
        Eid = sc.nextInt();

        System.out.println("Enter basic salary: ");
        Basic = sc.nextFloat();
    }

    public void display()
    {
        System.out.println("Employee name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Basic salary: " + Basic);
        System.out.println("Gross salary: " + Gross_Sal);
        System.out.println("Net salary: " + Net_Sal);
    }

    public void compute_net_sal()
    {
        DA = 0.52f * Basic;
        Gross_Sal = Basic + DA;
        IT = 0.30f * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of employees: ");
        int N = sc.nextInt();

        EMPLOYEE[] e = new EMPLOYEE[N];

        for(int i = 0; i < N; i++)
        {
            e[i] = new EMPLOYEE();
            e[i].read();
            e[i].compute_net_sal();
            e[i].display();
        }

        EMPLOYEE e2 = new EMPLOYEE("Fahad", 101, 50000);
        e2.display();
    }
}



/***
 2. Employee Class
 Implement an EMPLOYEE class with an inner class named Department that handles
 department-related details. The inner class Department should:
 a. Contain fields for departmentName and location.
 b. Provide methods to set and display department details.
 The EMPLOYEE class should:
 Contain fields for eName (employee name), salary, and an array of Department objects.
 Provide methods to:
 c) Add departments.
 d) Display employee details along with department information.
 
 import java.util.*;

 public class EMPLOYEE
 {
     String eName;
     float salary;
     int n;

     // Array of Department objects
     Department[] dept;
     Scanner sc = new Scanner(System.in);

     // Inner class
     class Department
     {
         String departmentName;
         String location;

         // Method to set details
         void setDepartment()
         {
             sc.nextLine(); // clear buffer
             System.out.println("Enter department name: ");
             departmentName = sc.nextLine();

             System.out.println("Enter location: ");
             location = sc.nextLine();
         }

         // Method to display details
         void displayDepartment()
         {
             System.out.println("Department: " + departmentName + ", Location: " + location);
         }
     }

     // Method to input employee + departments
     public void assign()
     {
         System.out.println("Enter employee name: ");
         eName = sc.nextLine();

         System.out.println("Enter salary: ");
         salary = sc.nextFloat();

         System.out.println("Enter number of departments: ");
         n = sc.nextInt();

         dept = new Department[n];

         for(int i = 0; i < n; i++)
         {
             dept[i] = new Department();
             dept[i].setDepartment();
         }
     }

     // Display method
     public void display()
     {
         System.out.println("Employee Name: " + eName);
         System.out.println("Salary: " + salary);

         System.out.println("Departments:");
         for(int i = 0; i < n; i++)
         {
             dept[i].displayDepartment();
         }
     }

     public static void main(String[] args)
     {
         EMPLOYEE e = new EMPLOYEE();
         e.assign();
         e.display();
     }
 }
 
 
 
 */
