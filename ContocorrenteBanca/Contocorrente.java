/*
ContoCorrente — intestatario e saldo. Espone deposita(double importo), preleva(double importo) e saldo().

Banca — collezione di conti:

apriConto(String intestatario) — crea un conto con saldo 0 e lo aggiunge;
saldoTotale();
contoPiuRicco() — ritorna il conto col saldo maggiore;
trasferisci(ContoCorrente da, ContoCorrente a, double importo) 
— ritorna true solo se il trasferimento è andato a buon fine.
 */
package ContocorrenteBanca;

public class Contocorrente {
    private String intestatario;
    private double saldo;
    public Contocorrente(String intestatario)
    {
        this.saldo=0;
        this.intestatario=intestatario;
    }
    public void deposita(double importo)
    {
        if(importo<0)
        {System.err.println("Importo non può essere negativo");
            return;
        }
        else
        {saldo+=importo;}
    }
    public void preleva(double importo)
    {
        if(importo<0)
        {
            System.err.println("Importo non può essere negativo");
            return;
        }
        if(saldo-importo<0)
        {
            System.err.println("Sei troppo povero");
            return;
        }
        else
        {saldo-=importo;}
    }
    public double saldo()
    {
        return this.saldo;
    }
}
