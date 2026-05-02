/*
 
     Custom exceptions InvalidSalaryException (salary < Rs.50,000) and ContractLimitExceededException (duration > 24 months). Employee base class + ContractEmployee subclass. Demonstrate with try-catch.
 
 */
import java.util.*;
class InvalidSalaryException extends Exception {
    InvalidSalaryException(String msg) {
        super(msg);
    }
}

class ContractLimitExceededException extends Exception {
    ContractLimitExceededException(String msg) {
        super(msg);
    }
}
class salary
{
    int duration;
    double salary;
    salary(int duration, double salary)
    {
        this. duration = duration;
        this.salary = salary;
    }
    void exceptionchecker() throws InvalidSalaryException, ContractLimitExceededException
    {
        if (salary < 50000)
            throw new InvalidSalaryException("Salary is lower than base amount. ");
        if (duration>24)
            throw new ContractLimitExceededException("Contract cannot be beyond 24 months");
    }
}


