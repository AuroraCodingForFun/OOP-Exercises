package EserciziEasy.LibroScaffaleLibreria;
/*Libro, Scaffale, Libreria

Libro: pagine e prezzo.
Scaffale: collezione di libri. Espone solo pagine() e prezzo() totali.
Libreria: collezione di scaffali e un nome. Espone il nome, pagineTotali() e prezzoTotale().
 */
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Libreria {
    private final String nome;
    private List<Scaffale> scaffali;
    public Libreria (String nome, List<Scaffale> scaffali)
    {
        this.nome=nome;
        this.scaffali= new ArrayList<>(scaffali);
    }

    public String nome()
    {return nome;}

    public int pagineTotali()
    {
        int tot=0;
        for(Scaffale s: scaffali)
        {
            tot+=s.pagine();
        }
        return tot;
    }

    public double prezzoTotale()
    {
        double tot=0;
        for(Scaffale s:scaffali)
        {
            tot+=s.prezzo();
        }
        return tot;
    }
}
