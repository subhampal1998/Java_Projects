public class SBAccount extends Account
{
    double interestRate;
    double amount;
    String type;
    double calculateInterest()
    {
        if(type.equals("Normal"))
        interestRate=4.00;
        else if(type.equals("NRI"))
        interestRate=6.00;
        return (interestRate*amount)/100.00;
    }
}