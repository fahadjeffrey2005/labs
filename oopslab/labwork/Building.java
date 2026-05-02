/**
 
 Create a Building class with two subclasses namely, House and School. The Building
 class contains fields for square footage and stories. The House class contains
 additional fields for number of bedrooms and baths. The School class contains
 additional fields for number of classrooms and grade level (for example, elementary
 or junior high). All the classes contain appropriate overloaded constructors and
 methods to display the details. In a separate class that contains main(), demonstrate
 the working of this hierarchy
 
 */
import java.util.*;
public class Building
{
    float sqft;
    int floors;
    
    Building()
    {
        sqft = 0.0f;
        floors = 0;
    }
    Building(float sqft, int floors)
    {
        this.sqft = sqft;
        this.floors = floors;
    }
    public void display()
    {
        System.out.println("Sqft. :"+sqft);
        System.out.println("No. of floors:"+floors);
    }
    
}


class House extends Building
{
    int b,bath;
    House()
    {
        super();
    }
    House(float sqft, int floors, int b, int bath)
    {
        super(sqft, floors);
        this.b = b;
        this.bath = bath;
    }
    public void display()
    {
        super.display();
        System.out.println("No. of bedrooms: "+b);
        System.out.println("No. of bathrooms: "+bath);
    }
}


class School extends Building
{
    int c;
    String grade;
    School()
    {
        super();
    }
    School(float sqft, int floors, int c, String grade)
    {
        super(sqft, floors);
        this.c = c;
        this.grade = grade;
    }
    public void display()
    {
        super.display();
        System.out.println("No. of classrooms: "+c);
        System.out.println("Grade: "+grade);
    }
}
