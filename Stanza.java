/*Stanza e Appartamento

Stanza: lunghezza e larghezza (lati della pianta) e altezza del soffitto, dati nel costruttore.
Esternamente accessibili solo superficie() e volume().

Appartamento: collezione di stanze e un valore, dati nel costruttore. Oltre al valore,
espone solo superficieTotale() e volumeTotale().
*/
public class Stanza {
    double lunghezza;
    double larghezza;
    double altezza;
    public Stanza(double lunghezza, double larghezza, double altezza)
    {
        this.lunghezza=lunghezza;
        this.larghezza=larghezza;
        this.altezza=altezza;
    }
    public double getSuperficie()
    {
        return this.lunghezza*this.larghezza;
    }
    public double getVolume()
    {
        return this.getSuperficie()*this.altezza;
    }
}
