import java.util.*;
public class BuildingDemo

{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Building b = new Building(2400, 2);
        House h = new House(2100, 1, 3, 4);
        School s = new School(50000, 5, 20, "First Year");
        b.display();
        h.display();
        s.display();

    }
}

