/**
 Define a class Student with instance variables name (String), marks (int array of size 5) and grade (char).

 a) Parameterized constructor to receive name and marks array and initialize them
 b) Method computeGrade() that calculates the average of marks and assigns grade: A(>=90), B(>=75), C(>=60), D(>=50), F(below 50)
 c) Method display() using for-each loop to print name, all marks and grade
 d) Method topScorer(Student s1, Student s2) — a static method that compares two Student objects and returns the one with the higher average

 Test with class StudentDemo having main method. Create at least 2 students and find the top scorer.
 */

import java.util.*;

public class Student
{
    String name;
    int[] marks = new int[5];
    char grade;
    int avg, total;
    
    Student(String name, int[] marks)
    {
        this.name = name;
        this.marks = marks;
    }
    
    void computeGrade()
    {
        total=0;
        for(int i =0; i<5; i++)
        {
            total += marks[i];
        }
        avg = total/5;
        if(avg>=90)
            grade = 'A';
        else if(avg>=75 && avg <90)
            grade = 'B';
        else if(avg>=60 && avg <75)
            grade = 'C';
        else if(avg>=50 && avg <60)
            grade = 'D';
        else
            grade = 'F';
    }
    
    void display()
    {
        System.out.println("Name of the sudent is: "+name);
        System.out.println("Marks: ");
        for(int m:marks)
            System.out.println(m);
        System.out.println("Grade: "+grade);
    }
    
    static void topScorer(Student s1, Student s2)
    {
        if(s1.avg>s2.avg)
            System.out.println(s1.name+" has scored higher.");
        else
            System.out.println(s2.name+" has scored higher.");
    }
}

