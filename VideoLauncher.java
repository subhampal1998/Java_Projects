import java.io.*;
public class VideoLauncher 
{
    public void main()throws IOException
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("MAIN MENU");
        System.out.println("==========");
        System.out.println("1.Add Videos:");
        System.out.println("2.Check Out Video:");
        System.out.println("3.Return Video:");
        System.out.println("4.Receive Rating:");
        System.out.println("5.List Inventory:");
        System.out.println("6.Exit:");
        System.out.println("Enter your choice (1....6):");
        int n=Integer.parseInt(r.readLine());
        VideoStore vs=new VideoStore();
        switch(n)
        {
            case 1:
            {
                System.out.println("Enter the name of the video you want to add:");
                String x=r.readLine();
                vs.addVideo(x);
                System.out.println("Video "+x+" successfully added");
                main();
                break;
            }
            case 2:
            {
                System.out.println("Enter the name of video you want to checkout:");
                String y=r.readLine();
                vs.doCheckout(y);
                main();
                break;
            }
            case 3:
            {
                System.out.println("Enter the name of the video you want to return:");
                String xy=r.readLine();
                vs.doReturn(xy);
                main();
                break;
            }
            case 4:
            {
                System.out.println("Enter the name of the video you want to rate:");
                String xx=r.readLine();
                System.out.println("Enter the rating of this video:");
                int rx=Integer.parseInt(r.readLine());
                vs.receiveRating(xx,rx);
                main();
                break;
            }
            case 5:
            {
                vs.listInventory();
                main();
                break;
            }
            case 6: 
            {
                System.out.println("Exiting...Thanks for using the application");
                break;
            }
        }
    }
}
                  

            