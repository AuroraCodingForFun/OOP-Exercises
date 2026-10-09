/*Prodotto e Carrello
    Prodotto: prezzo e quantità.
    Carrello: espone solo totale() (somma di prezzo × quantità) e numeroArticoli() (somma delle quantità).

*/
import java.util.ArrayList;
import java.util.List;


public class Carrello {
    private List<Prodotto> carrello;
    public Carrello(List<Prodotto> carrello)
    {
        this.carrello= new ArrayList<>(carrello);
    }
    public double totale ()
    {
        double tot=0;
        for(Prodotto i: carrello)
        {
            tot+= (i.getPrezzo()* i.getQuantità());
        }
        return tot;
    }
    public int numeroArticoli()
    {
        int tot=0;
        for(Prodotto i: carrello)
        {
            tot+= i.getQuantità();
        }
        return tot;
    }
}
