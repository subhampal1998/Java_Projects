import java.util.*;
import java.io.*;
public class Project2
{
    ArrayList<String> list=new ArrayList<String>();
    public void main()throws IOException
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Insert");
        System.out.println("2.Search");
        System.out.println("3.Delete");
        System.out.println("4.Display");
        System.out.println("5.Exit");
        System.out.println("Enter your choice:");
        int n=Integer.parseInt(r.readLine());
        switch(n)
        {
            case 1:
            {
                System.out.println("Enter item to be inserted:");
                String str=r.readLine();
                list.add(str);
                System.out.println("Inserted successfully");
                main();
                break;
            }
            case 2:
            {
                System.out.println("Enter item to be searched");
                String str1=r.readLine();
                if(list.contains(str1))
                System.out.println("Item found in the list");
                else
                System.out.println("Item not found in the list");
                main();
                break;
            }
            case 3:
            {
                System.out.println("Enter item to be deleted");
                String str2=r.readLine();
                if(list.contains(str2))
                {
                    list.remove(str2);
                    System.out.println("Item successfully deleted");
                }
                else
                System.out.println("Item not found in the list");
                main();
                break;
            }
            case 4:
            {
                Iterator i=list.iterator();
                System.out.println("The Items in the list are:");
                while(i.hasNext())
                {
                    System.out.println(i.next());
                }
                main();
                break;
            }
            case 5:
            {
                System.out.println("Thank You");
                break;
            }
        }
    }
}