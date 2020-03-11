public class RDAccount extends Account
{
    double interestRate;
    double amount;
    int noOfMonths;
    double monthlyAmount;
    int age;
    double calculateInterest()
    {
        monthlyAmount=amount/noOfMonths;
        if(age<55)
        {
            if(noOfMonths==6)
            interestRate=7.50;
            else if(noOfMonths==9)
            interestRate=7.75;
            else if(noOfMonths==12)
            interestRate=8.00;
            else if(noOfMonths==15)
            interestRate=8.25;
            else if(noOfMonths==18)
            interestRate=8.50;
            else if(noOfMonths==21)
            interestRate=8.75;
        }
        else
        {
            if(noOfMonths==6)
            interestRate=8.00;
            else if(noOfMonths==3)
            interestRate=10.00;
            else if(noOfMonths==12)
            interestRate=8.50;
            else if(noOfMonths==15)
            interestRate=8.75;
            else if(noOfMonths==18)
            interestRate=9.00;
            else if(noOfMonths==21)
            interestRate=9.25;
        }
        double amt=0.0;
        double r=0.0;
        for(int i=1;i<=noOfMonths;i++)
        {
            amt=amt+monthlyAmount+r;
            r=(amt*interestRate)/100.00;
        }
        return (amt-amount);
    }
}
        