/**
 
 Design a Java program for an automobile manufacturing plant that tracks production.Create a class Car with instance variables for details
 such as model (a String) and productionNumber (an int). Use a static variable to count the total number of cars produced. Implement a
 static method displayProductionSummary() that prints the total production count. In the main class, simulate the production of multiple
 cars by creating Car objects and then display the production summary using the static method.
 
 */

import java.util.*;

public class Car
{
    String model;
    int productionNumber;
    static int count;
    static void displayProductionSummary()
    {
        System.out.println("Total number of cars produced: "+count);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of cars to be produced: ");
        int n = sc.nextInt();
        Car[] c = new Car[n];
        for (int i =0; i<n; i++)
        {
            c[i] = new Car();
            sc.nextLine();
            System.out.println("Enter model of car "+(i+1)+":");
            c[i].model = sc.nextLine();
            System.out.println("Enter production number of car "+(i+1)+":");
            c[i].productionNumber = sc.nextInt();
            count++;
        }
        Car.displayProductionSummary();
    }
}
