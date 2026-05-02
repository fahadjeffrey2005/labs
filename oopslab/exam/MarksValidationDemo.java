/*
 Create a Student class with a method calculateAverage(int totalMarks, int numberOfSubjects) that throws ArithmeticException if numberOfSubjects is zero. Write MarksValidationDemo that calls it with both valid and zero-subject inputs, catches the exception, and displays a meaningful error message.
 */

import java.util.*;
class Student
{
    double calculateAverage(int totalMarks, int numberOfSubjects)
    {
        if (numberOfSubjects == 0)
            throw new ArithmeticException("Number of subjects is zero.");
        return (double) totalMarks/numberOfSubjects;
    }
}
public class MarksValidationDemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        Student s[] = new Student[n];
        for(int i =0; i<n; i++)
        {
            System.out.println("Student "+(i+1)+" details: ");
            s[i] = new Student();
            System.out.println("Total Marks: ");
            int total = sc.nextInt();
            System.out.println("Number of subjects: ");
            int count = sc.nextInt();
            try
            {
                System.out.println(s[i].calculateAverage(total, count));
            }
            catch (ArithmeticException exc)
            {
                System.out.println("Number of subjects is zero. Invalid"+exc.getMessage());
            }
        }
    }
}



