public class Main
{
    int x = 4;
    int y;

    public static void main (String [] args)
    {
        Main myObj= new Main();
        Main myObj2= new Main();
        myObj2.x = 3;
        myObj2.y= 67;
        System.out.println(myObj2.x);
        System.out.print(myObj2.y);
    }
}


