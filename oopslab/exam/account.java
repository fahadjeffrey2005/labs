/**
 
 Question 2: Advanced Banking Transactions (Custom Exception Handling)
 Develop a Banking Application that validates transactions using a hierarchy of custom exceptions. Create a base exception called InvalidTransactionException and two specific subclasses: InsufficientBalanceException and DailyLimitExceededException. The program should prompt a user for an account number, current balance, and a withdrawal amount. Implement a validation system using nested try-catch blocks:
 The outer block must validate if the account number matches a predefined constant (e.g., "12345678").
 The inner block must check if the withdrawal exceeds the daily limit of 50,000 units or the available balance. If any rule is violated, the corresponding custom exception must be thrown and caught with a descriptive error message. If the transaction is valid, update and display the new balance.
 
 */

public class InvalidTransactionException extends Exception
{
    InvalidTransactionException(String message)
    {
        super(message);
    }
}
public class InsufficientBalanceException extends InvalidTransactionException
{
    InsufficientBalanceException(String message)
    {
        super(message);
    }
}
public class DailyLimitExceededException extends InvalidTransactionException
{
    DailyLimitExceededException(String message)
    {
        super(message);
    }
}

public class account
{
    String accno;
    double bal;
    account(String accno, double bal)
    {
        this.accno = accno;
        this.bal = bal;
    }
    
    public void withdraw(double w) throws InvalidTransactionException
    {
        if (accno.equals("12345678"))
        {
           if (bal>=w)
            {
                if(w < 50000)
                {
                   System.out.print("Withdrawal approved. ");
                   bal -= w;
                }
                else
                    throw new DailyLimitExceededException("Daily withdrawal limit is 50000. ");
            }
            else
                throw new InsufficientBalanceException("Balance is: "+bal+". Insufficient Balance. ");
        }
        else
            throw new InvalidTransactionException("Account number " + accno + " is invalid.");
    }
}
