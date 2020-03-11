import java.io.*;
import java.util.*;
public class BoxRun 
    {
        public void main()throws IOException
        {
            BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
            HashSet<Box> list=new HashSet<Box>();
            System.out.println("Enter Number Of Box");
            int n=Integer.parseInt(r.readLine());
            for(int j=1;j<=n;j++)
            {
                System.out.println("Enter Box "+j+" Details:");
                System.out.println("Enter Length");
                double length=Double.parseDouble(r.readLine());
                System.out.println("Enter Width");
                double width=Double.parseDouble(r.readLine());
                System.out.println("Enter Height");
                double height=Double.parseDouble(r.readLine());
                Box b=new Box(length,width,height);
                if(list.isEmpty())
                list.add(b);
                else
                {
                    Iterator i=list.iterator();
                    int f=0;
                    while(i.hasNext())
                    {
                        Box b1=(Box)i.next();
                        if(b.volume()==b1.volume())
                        {
                            f=1;
                            break;
                        }
                    }
                    if(f==0)
                        list.add(b);
                }
            }
            System.out.println("Unique Boxes in the Set are:");
            Iterator i0=list.iterator();
            while(i0.hasNext())
            {
                Box b2=(Box)i0.next();
                System.out.println("Length="+b2.length+" "+"Width="+b2.width+" "+"Height="+b2.height+" "+"Volume="+b2.volume());
            }
    }
}
                