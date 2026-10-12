/*Stanza e Appartamento

Stanza: lunghezza e larghezza (lati della pianta) e altezza del soffitto, dati nel costruttore.
Esternamente accessibili solo superficie() e volume().

Appartamento: collezione di stanze e un valore, dati nel costruttore.
Oltre al valore, espone solo superficieTotale() e volumeTotale().
*/
import java.util.ArrayList;
import java.util.List;

public class Appartamento {
    private List<Stanza> stanze;
    private int valore;
    public Appartamento(List<Stanza> stanze, int valore)
    {
        this.stanze= new ArrayList<>(stanze);
        this.valore=valore;
    }

    public int getValore()
    {
        return this.valore;
    }
    
    public double superficieTotale()
    {
        double tot=0;
        for(Stanza s: stanze)
        {
            tot+=s.getSuperficie();
        }
        return tot;
    }
    
    public double volumeTotale()
    {
        double tot=0;
        for(Stanza s:stanze)
        {
            tot+=s.getVolume();
        }
        return tot;
    }

}
