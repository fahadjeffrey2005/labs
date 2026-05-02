/**
 
 Develop an abstract base class named Vehicle with attributes vehicleType, fuelLevel (0–100%), isEngineRunning (boolean), and mileage (double). Include methods: startEngine() (reduces fuel by 1%), stopEngine(), checkFuelLevel(), and accelerate() (increases mileage 10km, reduces fuel 2%). Create a derived class Car that overrides startEngine() (reduces fuel by 2%) and accelerate(). Car should also implement an Electric interface with a chargeBattery() method (increases battery 10% per cycle, max 100%). Demonstrate in Main.
 
 */
public interface Electric
{
    public void chargeBattery();
}
abstract public class Vehicle2
{
    String vehicleType;
    double fuelLevel;
    boolean isEngineRunning;
    double mileage;
    double batteryLevel;
    Vehicle2(String vehicleType, double fuelLevel, boolean isEngineRunning, double mileage, double batteryLevel)
    {
        this.vehicleType = vehicleType;
        this.isEngineRunning = isEngineRunning;
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
        this.batteryLevel = batteryLevel;
    }
    public void startEngine()
    {
        fuelLevel -=  1;
    }
    public void stopEngine()
    {
        isEngineRunning = false;
    }
    public void checkFuelLevel()
    {
        System.out.println("Fuel level: "+fuelLevel);
    }
    public void accelerate()
    {
        fuelLevel -= 2;
        mileage += 10;
    }
    abstract public void display();
}

public class Car extends Vehicle2 implements Electric
{
    int cycles;
    
    Car(String vehicleType, double fuelLevel, boolean isEngineRunning, double mileage, double batteryLevel, int cycles)
    {
        super(vehicleType, fuelLevel, isEngineRunning, mileage, batteryLevel);
        this.cycles  = cycles;
    }
    
    public void startEngine()
    {
        isEngineRunning = true;
        fuelLevel -=  2;
    }
    public void accelerate()
    {
        fuelLevel -= 2;
        mileage += 10;
    }
    public void chargeBattery()
    {
        if( batteryLevel <=100 && (batteryLevel + cycles*10)<=100)
            batteryLevel += cycles*10;
    }
    public void display()
    {
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Fuel level: "+fuelLevel);
        System.out.println("Engine state: "+isEngineRunning);
        System.out.println("Mileage: "+mileage);
        System.out.println("Battery level: "+batteryLevel);
        System.out.println("No. of Cycles: "+cycles);
    }
}
