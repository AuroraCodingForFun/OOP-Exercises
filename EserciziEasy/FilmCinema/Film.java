package EserciziEasy.FilmCinema;
/*
Film e Cinema
    Film: durata in minuti e prezzo del biglietto.
    Cinema: espone solo incassoPotenziale() (somma dei prezzi) e durataMassima().
*/
public class Film {
    private int minuti;
    private double prezzo;
    public Film(int minuti, double prezzo)
    {
        this.minuti=minuti;
        this.prezzo=prezzo;
    }
    public int getMinuti()
    {
        return this.minuti;
    }
    public double getPrezzo()
    {
        return this.prezzo;
    }
}
