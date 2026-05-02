/*
 
 1. Define a Class STUDENT having following
 Members: sname, marks_array, total, avg and provide the following methods:
 a. assign(): to assign initial values to the STUDENT object
 b. display(): to display the STUDENT object
 c. compute(): to Compute Total, Average marks
 Write a Java program Illustrating Class Declarations, Definition, and Accessing Class
 Members to test the class defined.
 
 
 Consider the already defined STUDENT class. Provide a default constructor and
 parameterized constructor to this class. Also provide a display method. Illustrate all
 the constructors as well as the display method by defining STUDENT objects.
 
 
 Enhance the STUDENT class by adding an inner class named Subject that handles details of
 individual subjects. Where:
 a) The inner class Subject should:
 a. Contain fields for subjectName and marks.
 b. Provide methods to assign marks and display subject details.
 b) The STUDENT class should maintain an array of Subject objects.
 c) The STUDENT class should:
 a. Provide methods to add subjects.
 d) Calculate total and average marks by iterating over the Subject objects.
 
 
 To the already defined STUDENT class, add two subclasses ScienceStudent and
 ArtsStudent and implement the following:
 i) Add a data member practicalMarks (int) to the ScienceStudent class that
 represents the marks obtained by the student in the laboratory subject. The
 ScienceStudent class should override the compute() method to include the
 practical marks in the total marks and average marks calculation. Additionally,
 the ScienceStudent class should provide a method displayPracticalMarks() to
 display the practical marks obtained by the science student.
 ii) Add a data member electiveSubject (String): to the ArtsStudent class that
 represents the elective subject chosen by the arts student. Also, add appropriate
 constructors to the subclasses.
 In main(), create objects of STUDENT, ScienceStudent, and ArtsStudent, and
 demonstrate the keyword ‘super’ and other functionalities of the classes by assigning
 values, computing marks, and displaying the information of the students. Also,
 demonstrate dynamic polymorphism.
 */
import java.util.*;

public class STUDENT
{
    String name;
    int n = 0;
    int total = 0;
    float avg = 0.0f;
    Scanner sc = new Scanner(System.in);
    Subject[] subjects;

    class Subject
    {
        String subjectName;
        int marks;
        void assignSubject()
        {
            sc.nextLine();
            System.out.println("Enter subject name: ");
            subjectName = sc.nextLine();

            System.out.println("Enter marks: ");
            marks = sc.nextInt();
        }

        void displaySubject()
        {
            System.out.println(subjectName + ": " + marks);
        }
    }

    STUDENT()
    {
    }

    STUDENT(String name, int[] marks_array)
    {
        this.name = name;
        this.n = marks_array.length;

        subjects = new Subject[n];

        for(int i = 0; i < n; i++)
        {
            subjects[i] = new Subject();
            subjects[i].subjectName = "Subject" + (i+1);
            subjects[i].marks = marks_array[i];
        }
        compute();
    }

    public void assign()
    {
        System.out.println("Enter name of student: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.println("Enter no of subjects: ");
        n = sc.nextInt();

        subjects = new Subject[n];

        for(int i = 0; i < n; i++)
        {
            subjects[i] = new Subject();
            subjects[i].assignSubject();
        }
    }

    public void compute()
    {
        total = 0;

        for(int i = 0; i < n; i++)
        {
            total += subjects[i].marks;
        }

        avg = (float) total / n;
    }

    public void display()
    {
        System.out.println("Student Name: " + name);

        System.out.println("Subjects:");
        for(int i = 0; i < n; i++)
        {
            subjects[i].displaySubject();
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }

    public static void main(String[] args)
    {
        STUDENT s1 = new STUDENT();
        s1.assign();
        s1.compute();
        s1.display();

        int arr[] = {80, 90, 85};
        STUDENT s2 = new STUDENT("Fahad", arr);
        s2.display();
    }
}



class ScienceStudent extends STUDENT
{
    int practicalMarks;
    ScienceStudent()
    {
        super();
    }
    ScienceStudent(String name, int[] marks_array, int practicalMarks)
    {
        super(name, marks_array);
        this.practicalMarks = practicalMarks;
    }
    public void compute()
    {
        total = 0;

        for(int i = 0; i < n; i++)
        {
            total += subjects[i].marks;
        }
        total += practicalMarks;
        avg = (float) (total) / (n+1);
    }
    public void displayPracticalMarks()
    {
        System.out.println("Practical marks obtained is: "+ practicalMarks);
    }
}
class ArtsStudent extends STUDENT
{
    String electiveSubject;
    ArtsStudent()
    {
        super();
    }
    ArtsStudent(String name, int[] marks_array, String electiveSubject)
    {
        super(name, marks_array);
        this.electiveSubject = electiveSubject;
    }
}
