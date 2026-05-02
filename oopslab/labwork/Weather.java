import java.util.*;

public class Weather
{
    static class Forecast
    {
        float temperature;
        float humidity;
        String city;

        void setData(String city, float temperature, float humidity)
        {
            this.city = city;
            this.temperature = temperature;
            this.humidity = humidity;
        }

        void predict()
        {
            System.out.print("City: " + city + " -> ");

            if(temperature > 30 && humidity < 50)
            {
                System.out.println("Sunny");
            }
            else if(humidity > 70)
            {
                System.out.println("Rainy");
            }
            else
            {
                System.out.println("Cloudy");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of cities: ");
        int n = sc.nextInt();

        Forecast[] f = new Forecast[n];

        for(int i = 0; i < n; i++)
        {
            f[i] = new Forecast();

            sc.nextLine(); // clear buffer
            System.out.println("Enter city name: ");
            String city = sc.nextLine();

            System.out.println("Enter temperature: ");
            float temp = sc.nextFloat();

            System.out.println("Enter humidity: ");
            float hum = sc.nextFloat();

            f[i].setData(city, temp, hum);
        }

        System.out.println("\nWeather Forecast:");
        for(int i = 0; i < n; i++)
        {
            f[i].predict();
        }
    }
}
