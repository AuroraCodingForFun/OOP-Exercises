/*Libro, Scaffale, Libreria

Libro: pagine e prezzo.
Scaffale: collezione di libri. Espone solo pagine() e prezzo() totali.
Libreria: collezione di scaffali e un nome. Espone il nome, pagineTotali() e prezzoTotale().
 */
import java.util.ArrayList;
import java.util.List;
public class Scaffale {
    private List<Libro> libri;
    public Scaffale(List<Libro> libri)
    {
        this.libri=new ArrayList<>(libri);
    }

    public int pagineTotali()
    {
        int tot=0;
        for(Libro l:libri)
        {
            tot+=l.getPagine();
        }
        return tot;
    }

    public double prezzoTotale()
    {
        double tot=0;
        for(Libro l:libri)
        {
            tot+=l.getPrezzo();
        }
        return tot;
    }   
}
