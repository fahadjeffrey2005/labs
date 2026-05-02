public class FigureDemo
{
    public static void main(String[]args)
    {
        Rectangle r = new Rectangle(10,20);
        Square s = new Square(10,10);
        Triangle t = new Triangle(10,5);
        
        r.area();
        t.area();
        s.area();
    }
}
