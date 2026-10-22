/*
Ticket con id progressivo (facile)
Scrivi Ticket in cui ogni oggetto ha un id final progressivo (1, 2, 3...) assegnato nel costruttore 
tramite un campo static. Esponi solo getId() e un metodo static quantiCreati().
 */
public class Ticket {
    private final int ID;
    private static int counter=1;
    public Ticket()
    {
        ID=counter;
        ++counter;
    }

    public int getID()
    {
        return this.ID;
    }
    public static int quantiCreati()
    {
        return counter;
    }
}
