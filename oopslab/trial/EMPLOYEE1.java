/**
 
 Implement an EMPLOYEE class with an inner class named Department that handles
 department-related details. The inner class Department should:
 a. Contain fields for departmentName and location.
 b. Provide methods to set and display department details.
 The EMPLOYEE class should:
 Contain fields for eName (employee name), salary, and an array of Department objects.
 Provide methods to:
 c) Add departments.
 d) Display employee details along with department information.
 
 */

import java.util.*;
public class EMPLOYEE1
{
    String eName;
    float salary;
    Department[] dept;
    int n;
    Scanner sc = new Scanner(System.in);
    public class Department
    {
        String departmentName, location;
        void setDept()
        {
            sc.nextLine();
            System.out.println("Enter name of Dept.");
            departmentName = sc.nextLine();
            System.out.println("Enter location:");
            location = sc.nextLine();
        }
        void displayDept()
        {
            System.out.println("Dept: "+departmentName+" |Location: "+location);
        }
    }
    
    void addDetails()
    {
        System.out.println("Enter name: ");
        eName = sc.nextLine();
        System.out.println("Enter salary: ");
        salary = sc.nextFloat();
        System.out.println("Enter number of depts. ");
        n = sc.nextInt();
        dept = new Department[n];
        for (int i =0; i<n; i++)
        {
            dept[i] = new Department();
            dept[i].setDept();
        }
    }
    void displayEmp()
    {
        System.out.println("Name: "+eName);
        System.out.println("Salary: "+salary);
        for (int i=0; i<n; i++)
        {
            dept[i].displayDept();
        }
    }
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        EMPLOYEE1[] e = new EMPLOYEE1[n];
        for (int i =0; i<n; i++)
        {
            e[i] = new EMPLOYEE1();
            e[i].addDetails();
        }
        System.out.println();
        for (int i =0; i<n; i++)
        {
            e[i].displayEmp();
        }
    }
}
