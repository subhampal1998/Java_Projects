import java.util.*;
class List3
    {
        ArrayList<String> al=new ArrayList<String>();
        public void main()
        {
            al.add("January");
            al.add("February");
            al.add("March");
            al.add("April");
            al.add("May");
            al.add("June");
            al.add("July");
            al.add("August");
            al.add("September");
            al.add("October");
            al.add("November");
            al.add("December");
            printAll();
        }
        void printAll()
        {
            for(Iterator i=al.iterator();i.hasNext();)
            System.out.println(i.next());
        }
    }
            