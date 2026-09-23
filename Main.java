public class Main
{
    int x = 4;
    int y= 67;

    public static void main (String [] args)
    {
        Main myObj= new Main();
        Main myObj2= new Main();
        myObj2.x = 3;
        System.out.println(myObj.x);
        System.out.print(myObj2.x);
    }
}


