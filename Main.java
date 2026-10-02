public class Main
{
    int x = 4;
    int y;
    String name;

    public static void main (String [] args)
    {
        Pokèmon Pikachu= new Pokèmon("Pikachu", 100, 100, 10);
        Pokèmon Charizard= new Pokèmon("Charizard", 100, 50, 20);
        Pikachu.attack(Charizard);
        System.out.println("Cps"+Charizard.ps);
    }
}


