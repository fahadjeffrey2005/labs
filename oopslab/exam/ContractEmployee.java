import java.util.*;

public class ContractEmployee extends salary
{
    ContractEmployee(int duration, double salary)
    {
        super(duration, salary);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employment duration (in months): ");
        int n = sc.nextInt();
        System.out.println("Enter salary amount: ");
        double sal = sc.nextDouble();
        try
        {
            ContractEmployee s = new ContractEmployee(n, sal);
            s.exceptionchecker();
            System.out.println("Valid Employee");
        }
        catch (InvalidSalaryException exc)
        {
            System.out.println(exc.getMessage());
        }
        catch (ContractLimitExceededException exc)
        {
            System.out.println(exc.getMessage());
        }
    }
}
