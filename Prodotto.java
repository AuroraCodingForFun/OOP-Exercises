/*Prodotto e Carrello

    Prodotto: prezzo e quantità.
    Carrello: espone solo totale() (somma di prezzo × quantità) e numeroArticoli() (somma delle quantità).
*/

public class Prodotto {
    private double prezzo;
    private int quantità;
    public Prodotto(double prezzo, int quantità)
    {
        this.prezzo=prezzo;
        this.quantità=quantità;
    }
    
    double getPrezzo()
    {
        return this.prezzo;
    }
    int getQuantità()
    {
        return this.quantità;
    }
}
