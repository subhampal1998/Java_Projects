import java.util.*;
public class Project6
    {
        public void main(String[] args)
        {
            String S1=new String(args[0]);
            String S2=new String(args[1]);
            ArrayList<String> list=new ArrayList<String>();
            String v1="";
            int l=S1.length();
            for(int i=0;i<l;i++)
            {
                if(i%2==0)
                v1=v1+S2;
                else
                v1=v1+S1.charAt(i);
            }
            list.add(v1);
            v1="";
            int index=0;
            int count=0;
            int la=S2.length();
            while(S1.indexOf(S2,index)!=-1)
            {
                count++;
                index=S1.indexOf(S2,index);
                index++;
            }
            index--;
            String rev="";
            if(count>1)
            {
                for(int j=la-1;j>=0;j--)
                rev=rev+S2.charAt(j);
                v1=v1+S1.substring(0,index)+rev+S1.substring(index+la,l);
                list.add(v1);
                v1="";
            }
            else
            list.add(S1+S2);
            if(count>1)
            {
                int ind=S1.indexOf(S2);
                v1=v1+S1.substring(0,ind)+S1.substring(ind+la,l);
                list.add(v1);
                v1="";
            }
            else
            list.add(S1);
            if(la%2!=0)
            {
                int n=(la/2)+1;
                v1=v1+S2.substring(0,n)+S1+S2.substring(n,la);
                list.add(v1);
                v1="";
            }
            else
            {
                v1=v1+S2.substring(0,la/2)+S1+S2.substring(la/2,la);
                list.add(v1);
                v1="";
            }
            v1=S1;
            for(int i=0;i<la;i++)
            {
                char b=S2.charAt(i);
                v1=v1.replace(b,'*');
            }
            list.add(v1);
            v1="";
            Iterator i=list.iterator();
            int No=1;
            while(i.hasNext())
            {
                System.out.println(No+"."+i.next());
                No++;
            }
    }
}