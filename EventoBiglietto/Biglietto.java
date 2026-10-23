/*
Evento — nome, capienza e prezzo base:
prenota() — ritorna un Biglietto se ci sono posti, altrimenti null;
postiRimanenti();
incassoTotale() — somma dei prezzi dei biglietti venduti.
Biglietto — immutabile, con un id progressivo (1, 2, 3…) assegnato nel costruttore tramite un campo static 
(ricicla l'idea dell'esercizio Ticket), più nome dell'evento e prezzo.
*/

package EventoBiglietto;

public final class Biglietto {
    private static int id=1;
    private final int ID;
    private final String nome;
    private final double prezzo;
    public Biglietto(String nome, double prezzo)
    {
        this.ID= id;
        ++id;
        this.nome=nome;
        this.prezzo=prezzo;
    }
    public double getPrezzo()
    {
        return this.prezzo;
    }
}
