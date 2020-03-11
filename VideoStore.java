public class VideoStore 
{
    static Video[]store=new Video[1000];
    static int size=-1;
    void addVideo(String name)
    {
        size++;
        store[size]=new Video(name);
        store[size].checkout=false;
    }
    void doCheckout(String name)
    {
            int f=0;
            for(int i=0;i<=size;i++)
                {
                    if(store[i].getName().equals(name)&&store[i].checkout==false)
                        {
                            f=1;
                            store[i].doCheckout();
                            System.out.println("Video "+name+" sucessfully checked out");
                        }
                    }
            if(f==0)
                    System.out.println("Video not found");
                }
    void doReturn(String name)
    {
            int f=0;
            for(int i=0;i<=size;i++)
                {
                        if(store[i].getName().equals(name)&&store[i].checkout==true)
                            {
                                f=1;
                                store[i].doReturn();
                                System.out.println("Video "+name+" sucessfully returned");
                            }
                        }
            if(f==0)
                System.out.println("Video not found for return");
    }
    void receiveRating(String name,int rating)
    {
            int x=0;
            for(int i=0;i<=size;i++)
                {
                        if(store[i].videoName.equals(name))
                            {
                                store[i].receiveRating(rating);
                                x=1;
                                System.out.println("Rating "+rating+" has been sucessfully mapped");
                            }
                        }
            if(x==0)
                System.out.println("Video not found");
           
    }
    void listInventory()
    {
        System.out.printf("%10s %15s %10s", "Video Name", "Checkout Status", "Rating");
        System.out.println();
        System.out.println("=========================================================");
        for(int i=0;i<=size;i++)
        {
            System.out.printf("%10s %15s %10d", store[i].getName(), store[i].getCheckout(), store[i].getRating());
            System.out.println();
        }
        System.out.println("=========================================================");
    }
}
