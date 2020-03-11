import java.io.*;
import java.util.*;
public class Cards
    {
        String symbol;
        int number;
        public void main()throws IOException
        {
            BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
            TreeSet<String> list=new TreeSet<String>();
            ArrayList list1=new ArrayList();
            int count=0;
            int sum=0;
            System.out.println("Enter Number of Cards:");
            int n=Integer.parseInt(r.readLine());
            while(list1.size()!=(n*2))
            {
                System.out.println("Enter a card:");
                symbol=r.readLine();
                number=Integer.parseInt(r.readLine());
                list1.add(symbol);
                list1.add(new Integer(number));
                list.add(symbol);
            }
            System.out.println("Distinct Symbols are:");
            System.out.println(list);
            Iterator l=list.iterator();
            while(l.hasNext())
            {
                String temp=(String)l.next();
                Iterator i=list1.iterator();
                System.out.println("Cards in "+temp+" Symbol");
                while(i.hasNext())
                    {
                        if(i.next().equals(temp))
                        {
                            count++;
                            String x1="";
                            x1=x1+i.next();
                            int num=Integer.parseInt(x1);
                            System.out.print(temp+" ");
                            System.out.println(num);
                            sum=sum+num;
                        }
                    }
                System.out.println("Number of cards: "+count);
                System.out.println("Sum of Numbers: "+sum);
                count=0;
                sum=0;
                    
                }
            }
        }
    

