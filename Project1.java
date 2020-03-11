import java.io.PrintStream;
public class Project1
    {
        public void main(String []args)
        {
            int empno[]={1001,1002,1003,1004,1005,1006,1007};
            String empname[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
            String joindate[]={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/01/2000","12/06/2006"};
            char descode[]={'e','c','k','r','m','e','c'};
            String dept[]={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
            int basic[]={20000,30000,10000,12000,50000,23000,29000};
            int hra[]={8000,12000,8000,6000,20000,9000,12000};
            int it[]={3000,9000,1000,2000,20000,4400,10000};
            int n=Integer.parseInt(args[0]);
            int cell=-1;
            String des="";
            int da=0;
            int salary=0;
            for(int i=0;i<7;i++)
            {
                if(n==empno[i])
                cell=i;
            }
            if(cell==-1)
            System.out.println("There is no employee with empid: "+n);
            else
            {
                switch(descode[cell])
                {
                    case 'e':
                    {
                        des="Engineer";
                        da=20000;
                        break;
                    }
                    case 'c':
                    {
                        des="Consultant";
                        da=32000;
                        break;
                    }
                    case 'k':
                    {
                        des="Clerk";
                        da=12000;
                        break;
                    }
                    case 'r':
                    {
                        des="Receptionist";
                        da=15000;
                        break;
                    }
                    case 'm':
                    {
                        des="Manager";
                        da=40000;
                        break;
                    }
                }
                salary=basic[cell]+hra[cell]+da-it[cell];
                System.out.printf("%10s %10s %10s %10s %10s", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
                System.out.println();
                System.out.format("%10d %10s %10s %10s %10d",
                empno[cell], empname[cell], dept[cell], des, salary);
                System.out.println();
            }
        }
    }
    