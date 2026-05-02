import java.util.*;

public class accountDemo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        String n = sc.nextLine();
        System.out.println("Enter balance: ");
        double b = sc.nextDouble();
        System.out.println("Enter amount to e withdrawn: ");
        double w = sc.nextDouble();
        account a = new account(n,b);
        try
        {
            try
            {
                a.withdraw(w);
            }
            catch (DailyLimitExceededException exc)
            {
                System.out.println(exc.getMessage());
            }
            catch (InsufficientBalanceException exc)
            {
                System.out.println(exc.getMessage());
            }
        }
    }
}
