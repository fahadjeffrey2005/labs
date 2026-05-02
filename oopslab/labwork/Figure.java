/**
 
 Create an abstract class Figure with an abstract method area and two integer variables
 that represent x and y dimensions. Create three more classes Rectangle, Triangle and
 Square that extend Figure and implement the area method appropriately. Illustrate
 how the method area can be computed at run time for Rectangle, Square and Triangle
 to achieve dynamic polymorphism.
 
 */

import java.util.*;
abstract public class Figure
{
    Scanner sc = new Scanner(System.in);
    int x,y;
    abstract public void area();
    public static void main(String[] args)
    {
        
    }
}


class Rectangle extends Figure
{
    Rectangle(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void area()
    {
        int area = x*y;
        System.out.println("Area of rectangle is: "+area);
    }
}


class Triangle extends Figure
{
    Triangle(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void area()
    {
        float area = (0.5f)*x*y;
        System.out.println("Area of triangle is: "+area);
    }

}


class Square extends Figure
{
    Square(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void area()
    {
        x=y;
        int area = x*y;
        System.out.println("Area of square is: "+area);
    }
}

