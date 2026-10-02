public class Main
{
    int x = 4;
    int y;
    String name;

    public static void main (String [] args)
    {
        Pokèmon Pikachu= new Pokèmon("Pikachu", 100, 10, 10);
        Main myObj2= new Main();
        myObj2.x = 3;
        myObj2.y= 67;
        myObj2.name= "Freddy";
        System.out.println(Pikachu.nome);
        System.out.print(Pikachu.atk);
        System.out.println("PS:"+Pikachu.ps);
    }
}


