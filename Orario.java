/*
Orario immutabile (medio)
Scrivi Orario (ore, minuti) con tre costruttori: (ore, minuti), (ore) e (), che deleghino al primo con this(...). 
Gli oggetti sono immutabili: il metodo piuMinuti(int m) ritorna un nuovo Orario, 
gestendo il riporto delle ore (es. 10:50 + 20 → 11:10).
 */
public class Orario {
    private final int ore;
    private final int minuti;

    public Orario(int ore, int minuti)
    {
        if (ore < 0 || ore > 23 || minuti < 0 || minuti > 59)
            throw new IllegalArgumentException("Orario non valido");
        this.ore = ore;
        this.minuti = minuti;
    }
    public Orario (int ore)
    { 
        this(ore, 0);
    }
    public Orario ()
    { 
        this(0,0);
    }
    public Orario piuMinuti(int m)
    {
        int totale = Math.floorMod(this.ore * 60 + this.minuti + m, 24 * 60);
        return new Orario(totale / 60, totale % 60);

    }
}
