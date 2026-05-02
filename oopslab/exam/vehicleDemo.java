import java.util.*;

public class vehicleDemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vehicles: ");
        int n = sc.nextInt();
        Vehicle[] v = new Vehicle[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Choose vehicle type: \n1.Bike\n2.Auto\n3.Cab");
            int op = sc.nextInt();
            sc.nextLine();
            switch(op)
            {
                case 1:
                {
                    System.out.println("Enter Details: ");
                    System.out.println("Vehicle ID: ");
                    String vi = sc.nextLine();
                    System.out.println("Driver Name: ");
                    String name = sc.nextLine();
                    System.out.println("Distance travelled: ");
                    int distance = sc.nextInt();
                    v[i] = new Bike(vi, name);
                    v[i].distance = distance;
                    break;
                }
                case 2:
                {
                    System.out.println("Enter Details: ");
                    System.out.println("Vehicle ID: ");
                    String vi = sc.nextLine();
                    System.out.println("Driver Name: ");
                    String name = sc.nextLine();
                    System.out.println("Distance travelled: ");
                    int distance = sc.nextInt();
                    v[i] = new Auto(vi, name);
                    v[i].distance = distance;
                    break;
                }
                case 3:
                {
                    System.out.println("Enter Details: ");
                    System.out.println("Vehicle ID: ");
                    String vi = sc.nextLine();
                    System.out.println("Driver Name: ");
                    String name = sc.nextLine();
                    System.out.println("Distance travelled: ");
                    int distance = sc.nextInt();
                    v[i] = new Cab(vi, name);
                    v[i].distance = distance;
                    break;
                }
                default:
                {
                    System.out.println("No Such option available. ");
                    i--;
                    break;
                }
            }
        }
        double max = 0;
        int maxi =0;
        for (int i =0; i<n; i++)
        {
            try
            {
                v[i].calculateFare(v[i].distance);
                if (v[i].fare>max)
                {
                    max = v[i].fare;
                    maxi = i;
                }
                System.out.println("Fare for vehicle: "+(i+1)+" is: "+v[i].fare);
            }
            catch(InvalidDistanceException e)
            {
                System.out.println("Error: "+e.getMessage());
            }
        }
        System.out.println("Max fare: "+v[i].fare+" of vehicle: "+(maxi+1));
    }
}
