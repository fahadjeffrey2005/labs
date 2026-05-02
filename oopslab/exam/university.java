/**
 
 Question 3: Institutional Management (Static Members and Inner Classes)
 Create a Java application to manage and display details for a university's departments. Define an outer class University that contains a static variable for the university's name and a static method to display this name. Within this class, implement a static inner class named Department. The Department class should be able to access the university's name and include its own logic to display department-specific messages alongside the institutional name. Demonstrate the functionality in a main method by creating objects of the static inner class without needing an instance of the outer class, and ensure the university's name is consistent across all instances.

 */

public class University
{
    static String name;
    University(String name)
    {
        this.name = name;
    }
    static void displayName()
    {
        System.out.println("University name: "+name);
    }
    public static class Department
    {
        String deptname;
        Department(String deptname)
        {
            this.deptname = deptname;
        }
        void displayDept()
        {
            System.out.println("University name: "+name);
            System.out.println("Department name: "+deptname);
        }
    }
}
