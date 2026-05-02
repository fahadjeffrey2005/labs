import java.util.*;

public class universityDemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the university: ");
        String name = sc.nextLine();
        University.name = name;
        System.out.println("Enter name of the department: ");
        String dept = sc.nextLine();
        University.Department d = new University.Department(dept);
        d.displayDept();
    }
}
