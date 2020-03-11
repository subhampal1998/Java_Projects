import java.io.*;
public class AccountMain
{
    public void main()throws IOException
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("MAIN MENU");
        System.out.println("-----------");
        System.out.println("1.Interest Calculator - SB");
        System.out.println("2.Interest Calculator - FD");
        System.out.println("3.Interest Calculator - RD");
        System.out.println("4.Exit");
        System.out.println("Enter your option (1....4):");
        int n=Integer.parseInt(r.readLine());
        switch(n)
        {
            case 1:
            {
                SBAccount sb=new SBAccount();
                System.out.println("Enter the average amount in your account:");
                sb.amount=Double.parseDouble(r.readLine());
                if(sb.amount<0.0)
                {
                    System.out.println("Invalid amount. Please enter non-negetive values.");
                    main();
                    break;
                }
                System.out.println("Normal or NRI? ");
                sb.type=r.readLine();
                System.out.println("Interest gained: "+sb.calculateInterest());
                main();
                break;
            }
            case 2:
            {
                FDAccount fd=new FDAccount();
                System.out.println("Enter the FD amount:");
                fd.amount=Double.parseDouble(r.readLine());
                if(fd.amount<0.0)
                {
                    System.out.println("Invalid amount. Please enter non-negetive values.");
                    main();
                    break;
                }
                System.out.println("Enter the number of days:");
                fd.noOfDays=Integer.parseInt(r.readLine());
                if(fd.noOfDays<0.0)
                {
                    System.out.println("Invalid no. of days. Please enter non-negetive values.");
                    main();
                    break;
                }
                System.out.println("Enter your age:");
                fd.ageOfACHolder=Integer.parseInt(r.readLine());
                if(fd.ageOfACHolder<0.0)
                {
                    System.out.println("Invalid age of ACHolder. Please enter non-negetive values.");
                    main();
                    break;
                }
                System.out.println("Interest Gained: "+fd.calculateInterest());
                main();
                break;
            }
            case 3:
            {
                RDAccount rd=new RDAccount();
                System.out.println("Enter total RD amount:");
                rd.amount=Integer.parseInt(r.readLine());
                if(rd.amount<0.0)
                {
                    System.out.println("Invalid amount. Please enter non-negetive values.");
                    main();
                    break;
                }
                System.out.println("Enter the number of months:");
                rd.noOfMonths=Integer.parseInt(r.readLine());
                if(rd.noOfMonths<0.0)
                {
                    System.out.println("Invalid no. of months. Please enter non-negetive values.");
                    main();
                    break;
                }
                System.out.println("Enter your age:");
                rd.age=Integer.parseInt(r.readLine());
                if(rd.age<0.0)
                {
                    System.out.println("Invalid age. Please enter non-negetive values.");
                    main();
                }
                System.out.println("Interest Gained: "+rd.calculateInterest());
                main();
                break;
            }
            case 4:
            {
                System.out.println("Thank You");
                break;
            }
        }
    }
}
                
        