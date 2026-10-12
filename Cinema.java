/*- Film e Cinema
    Film: durata in minuti e prezzo del biglietto.
    Cinema: espone solo incassoPotenziale() (somma dei prezzi) e durataMassima().
    */
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Film> films;
    public Cinema(List<Film> films)
    {
        this.films=new ArrayList<>();
    }
    public double incassoPotenziale()
    {
        double sum=0;
        for(Film f :films)
        {
            sum+=f.getPrezzo();
        }
        return sum;
    }
    public int durataMassima()
    {
        int max=0;
        for(Film i:films)
        {
            if(i.getMinuti()>max)
            {max=i.getMinuti();}
        }
        return max;
    }
}
