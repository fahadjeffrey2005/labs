/*
 
 A transport company manages fleet. Create custom exception InvalidDistanceException (if distance ≤ 0). Create abstract class Vehicle with fields vehicleId (String) and driverName (String) and abstract method calculateFare(int distance) that throws InvalidDistanceException. Implement Bike (fare = distance × 5), Auto (fare = distance × 10) and Cab (fare = distance × 15). In main(), create array of Vehicle references with mix of all three types, read from user, handle exceptions, call calculateFare() polymorphically and identify the vehicle with highest fare
 
 */
public class InvalidDistanceException extends Exception
{
    InvalidDistanceException(String message)
    {
        super(message);
    }
}
abstract public class Vehicle
{
    String vehicleId, driverName;
    double fare;
    int distance;
    Vehicle(String vehicleId, String driverName)
    {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
    }
    abstract public void calculateFare(int distance) throws InvalidDistanceException;
}

class Bike extends Vehicle
{
    Bike(String vehicleId, String driverName)
    {
        super(vehicleId,driverName);
    }
    public void calculateFare(int distance) throws InvalidDistanceException
    {
        if(distance <=0)
            throw new InvalidDistanceException("Distance cannot be less than or equal to 0. ");
        else
        {
            fare = distance * 5;
        }
    }
}
class Auto extends Vehicle
{
    Auto(String vehicleId, String driverName)
    {
        super(vehicleId,driverName);
    }
    public void calculateFare(int distance) throws InvalidDistanceException
    {
        if(distance <=0)
            throw new InvalidDistanceException("Distance cannot be less than or equal to 0. ");
        else
        {
            fare = distance * 10;
        }
    }
}
class Cab extends Vehicle
{
    Cab(String vehicleId, String driverName)
    {
        super(vehicleId,driverName);
    }
    public void calculateFare(int distance) throws InvalidDistanceException
    {
        if(distance <=0)
            throw new InvalidDistanceException("Distance cannot be less than or equal to 0. ");
        else
        {
            fare = distance * 15;
        }
    }
}
