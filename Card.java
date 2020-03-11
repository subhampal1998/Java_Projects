import java.io.*;
import java.util.*;
public class Card
    {
        String symbol;
        int number;
        public void main()throws IOException
        {
            BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
            TreeMap<String,Integer> list=new TreeMap<String,Integer>();
            int count=0;
            while(list.size()!=4)
            {
                System.out.println("Enter a card:");
                count++;
                symbol=r.readLine();
                number=Integer.parseInt(r.readLine());
                if(!list.containsKey(symbol))
                list.put(symbol,number);
            }
            System.out.println("Four symbols gathered in "+count+" cards.");
            System.out.println("Cards in set are:");
            Set set=list.entrySet();
            Iterator i=set.iterator();
            while(i.hasNext())
            {
                Map.Entry e=(Map.Entry)i.next();
                System.out.println(e.getKey()+" "+e.getValue());
            }
        }
 }
    

