/*
 
 Create a class Smartphone that contains an inner class Processor. Implement the following:
 1.The Smartphone class should have an instance variable brand and a constructor to initialize it.
 2.The inner class Processor should have instance variables cores (int) and clockSpeed (double, in GHz) with a constructor to initialize
 them.
 speed.
 the processor details.
 (5)
 3.The Processor class should have a method displayProcessorDetails() that prints the smartphone brand, number of cores, and clock
 Implement the necessary logic in the main() method to create a Smartphone object and associate it with a Processor object. Then, display
 
 */

import java.util.*;

public class Smartphone
{
    String brand;
    
    Smartphone(String brand)
    {
        this.brand = brand;
    }
    
    public class Processor
    {
        int cores;
        double clockSpeed;
        
        Processor(int cores, double clockSpeed)
        {
            this.cores = cores;
            this. clockSpeed = clockSpeed;
        }
        void displayProcessorDetails()
        {
            System.out.println("Brand of phone is: "+brand);
            System.out.println("No. of cores is: "+cores);
            System.out.println("Clock Speed is: "+clockSpeed);
        }
    }
    
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name of the phone: ");
        String name = sc.nextLine();
        Smartphone s1 = new Smartphone(name);
        System.out.println("Enter no of the cores: ");
        int core = sc.nextInt();
        System.out.println("Enter clock speed: ");
        double clock = sc.nextDouble();
        Smartphone.Processor p1 = s1.new Processor(core, clock);
        p1.displayProcessorDetails();

    }
}
