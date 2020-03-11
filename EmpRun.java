import java.io.*;
import java.util.*;
public class EmpRun 
    {
        public void main()throws IOException
        {
            BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Employee> list=new ArrayList<Employee>();
            System.out.println("Enter Number Of Employees");
            int n=Integer.parseInt(r.readLine());
            TreeSet<String> fname=new TreeSet<String>();
            for(int i=1;i<=n;i++)
            {
                System.out.println("Enter Employee "+i+" Details:");
                System.out.println("Enter the Firstname");
                String Fname=r.readLine();
                System.out.println("Enter the Lastname");
                String Lname=r.readLine();
                System.out.println("Enter the Mobile");
                String mob=r.readLine();
                System.out.println("Enter the Email");
                String em=r.readLine();
                System.out.println("Enter the Address");
                String add=r.readLine();
                Employee e=new Employee(Fname,Lname,mob,em,add);
                list.add(e);
                fname.add(Fname);
            }
            System.out.println("Employee List:");
            System.out.printf("%15s %15s %15s %30s %15s\n", "FirstName", "LastName", "Mobile", "Email", "Address");
            Iterator i0=fname.iterator();
            while(i0.hasNext())
            {
                String x=(String)i0.next();
                Iterator i1=list.iterator();
                while(i1.hasNext())
                {
                    Employee e1=(Employee)i1.next();
                    if(e1.firstname.equals(x))
                    System.out.printf("%15s %15s %15s %30s %15s\n", e1.firstname, e1.lastname, e1.mobno, e1.email, e1.address);
                }
            }
        }
    }
                