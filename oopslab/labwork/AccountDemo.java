import java.util.*;
public class AccountDemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        savings s = new savings("Fahad", 51534, "Savings", 1000000000, 10.0f);
        s.display();
    }
}
