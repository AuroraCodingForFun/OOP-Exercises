public class Main
{
    int x = 4;
    int y;
    String name;

    public static void main (String [] args)
    {
        Main myObj= new Main();
        Main myObj2= new Main();
        myObj2.x = 3;
        myObj2.y= 67;
        myObj2.name= "Freddy";
        System.out.println(myObj2.x);
        System.out.print(myObj2.y);
        System.out.println("Name:"+myObj2.name);
    }
}


