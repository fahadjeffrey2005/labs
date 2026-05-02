import java.util.*;

public class StudentDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter marks: ");
        int[] marks = new int[5];
        for(int i = 0; i < 5; i++)
        {
            marks[i] = sc.nextInt();
        }
        Student s = new Student(name, marks);
        s.computeGrade();
        s.display();
        
        System.out.println("Do you want to compare data of 2 students? (Y/N)");
        char op = sc.next().charAt(0);
        switch(op)
        {
            case 'Y':
                System.out.println("Enter student1 name: ");
                String name1 = sc.next();
                System.out.println("Enter marks: ");
                int[] marks1 = new int[5];
                for(int i = 0; i < 5; i++)
                {
                    marks1[i] = sc.nextInt();
                }
                Student s1 = new Student(name1, marks1);
                s1.computeGrade();
                s1.display();
                
                System.out.println("Enter student2 name: ");
                String name2 = sc.next();
                System.out.println("Enter marks: ");
                int[] marks2 = new int[5];
                for(int i = 0; i < 5; i++)
                {
                    marks2[i] = sc.nextInt();
                }
                Student s2 = new Student(name2, marks2);
                s2.computeGrade(); 
                s2.display();
                
                Student.topScorer(s1, s2);
                break;
                
            case 'N':
                System.out.println("Okay bro.");
                break;
                
            default:
                System.out.println("Invalid character.");
                break;
        }
    }
}
