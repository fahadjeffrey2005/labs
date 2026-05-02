import java.util.Scanner;
public class Vehicle2Demo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details: ");
        System.out.println("Vehicle Type: ");
        String v = sc.nextLine();
        System.out.println("Fuel level: ");
        double f = sc.nextDouble();
        System.out.println("Engine state: ");
        boolean e = sc.nextBoolean();
        System.out.println("Mileage: ");
        double m = sc.nextDouble();
        System.out.println("Battery level: ");
        double b = sc.nextDouble();
        System.out.println("No. of Cycles: ");
        int cycles = sc.nextInt();
        Car c = new Car(v,f,e,m,b,cycles);
        c.display();
    }
}
