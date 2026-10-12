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
    public double superficie()
    {
        return this.lunghezza*this.larghezza;
    }
    public double volume()
    {
        return this.superficie()*this.altezza;
    }
}
