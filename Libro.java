public class Libro 
{
    private int pagine;
    private final String autore;
    private final String titolo;
    private final double prezzo;

    public Libro(int pag, String autor, String title, double prezzo)
    {
        if(pag<=0|| autor==null|| title==null || prezzo<=0)
        {
            throw new IllegalArgumentException("Valori input impossibili");
        }
        this.autore=autor;
        this.pagine=pag;
        this.titolo=title;
        this.prezzo=prezzo;
    }

    public double PrezzoPerPagina()
    {
        return this.prezzo/this.pagine;
    }

    public double getPrezzo()
    {
        return this.prezzo;
    }

    public int getPagine()
    {
        return this.pagine;
    }
  
}
