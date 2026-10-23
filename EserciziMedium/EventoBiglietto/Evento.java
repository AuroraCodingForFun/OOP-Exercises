/*
Evento — nome, capienza e prezzo base:
prenota() — ritorna un Biglietto se ci sono posti, altrimenti null;
postiRimanenti();
incassoTotale() — somma dei prezzi dei biglietti venduti.
Biglietto — immutabile, con un id progressivo (1, 2, 3…) assegnato nel costruttore tramite un campo static 
(ricicla l'idea dell'esercizio Ticket), più nome dell'evento e prezzo.
*/
package EserciziMedium.EventoBiglietto;
import java.util.ArrayList;
import java.util.List;
public class Evento {
    private String nome;
    private int capienza;
    private int postiDisponibili;
    private double prezzoBase;
    private List<Biglietto> bigliettos;
    public Evento(String nome, int capienza, double prezzoBase)
    {
        this.bigliettos= new ArrayList<>();
        this.nome=nome;
        this.capienza=capienza;
        this.prezzoBase=prezzoBase;
        this.postiDisponibili=capienza;
    }
    public int postiRimanenti()
    {return this.postiDisponibili;}
    public Biglietto prenota()
    {
        if(postiRimanenti()>0)
        {
            --this.postiDisponibili;
            Biglietto b= new Biglietto(this.nome,this.prezzoBase);
            bigliettos.addLast(b);
            return b;
        }
        else
        {return null;}
    }
    public double incassoTotale()
    {
        double tot=0;
        for(Biglietto b:bigliettos)
        {tot+=b.getPrezzo();}
        return tot;
    }
    public int capienza()
    {
        return this.capienza;
    }
}
