/*Libro, Scaffale, Libreria

Libro: pagine e prezzo.
Scaffale: collezione di libri. Espone solo pagine() e prezzo() totali.
Libreria: collezione di scaffali e un nome. Espone il nome, pagineTotali() e prezzoTotale().
*/
public class Libro {
    private final int pagine;
    private double prezzo;

    public Libro(int pagine, double prezzo)
    {
        this.pagine=pagine;
        this.prezzo=prezzo;
    }

    int getPagine()
    {
        return this.pagine;
    }
    double getPrezzo()
    {
        return this.prezzo;
    }
}
