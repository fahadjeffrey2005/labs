/*
 
 Design a class Grading with methods to read/display RegNo and marks in 5 subjects. Create an interface Co_Curricular with get_Score() and put_Score(). Design a class Result that extends Grading and implements Co_Curricular. Final score = 80% academic + 20% co-curricular. Write a demo class.

 
 */
import java.util.*;

interface co_curricular
    {
    public void get_score();
    public void put_score();
}

class Grading
{
    double[] grades;
    int n;
    int reg;
    Scanner sc = new Scanner(System.in);

    public void read()
    {
        System.out.println("Enter reg no: ");
        reg = sc.nextInt();
        System.out.println("Enter the number of subjects: ");
        n = sc.nextInt();
        grades = new double[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter marks for subject " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }
    }

    public void display()
    {
        System.out.println("Reg No.: " + reg);
        System.out.println("Grades: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println("Subject " + (i + 1) + ": " + grades[i]);
        }
    }
}

class Result extends Grading implements co_curricular
{
    int coScore;

    public void get_score()
    {
        System.out.println("Enter co-curricular score (out of 100): ");
        coScore = sc.nextInt();
    }

    public void put_score()
    {
        System.out.println("Co-curricular score: " + coScore);
    }

    public void computeAndDisplay()
    {
        System.out.println("\n--- Final Results ---");
        System.out.println("Reg No.: " + reg);
        double totalFinal = 0;
        for (int i = 0; i < n; i++) {
            double finalScore = (0.8 * grades[i]) + (0.2 * coScore);
            System.out.println("Subject " + (i + 1) + " final score: " + finalScore);
            totalFinal += finalScore;
        }
        System.out.println("Overall final score: " + (totalFinal / n));
    }
}

public class ResultDemo
{
    public static void main(String[] args)
    {
        Result r = new Result();
        r.read();
        r.get_score();
        r.display();
        r.put_score();
        r.computeAndDisplay();
    }
}
