/*
Banca — collezione di conti:

apriConto(String intestatario) — crea un conto con saldo 0 e lo aggiunge;
saldoTotale();
contoPiuRicco() — ritorna il conto col saldo maggiore;
trasferisci(ContoCorrente da, ContoCorrente a, double importo) 
— ritorna true solo se il trasferimento è andato a buon fine. 
*/
package EserciziMedium.ContocorrenteBanca;
import java.util.ArrayList;
import java.util.List;

public class Banca {
    private List<Contocorrente> conti;
    private String nomeBanca;

    public Banca(String nomeBanca)
    {
        conti= new ArrayList<>();
        this.nomeBanca=nomeBanca;
    }
    public String getNomeBanca()
    {
        return this.nomeBanca;
    }
    public void apriConto(String intestatario)
    {
        Contocorrente c= new Contocorrente(intestatario);
        conti.addLast(c);
    }
    public double saldoTotale()
    {
        double tot=0;
        for(Contocorrente c:conti)
        {tot+=c.saldo();}
        return tot;
    }
    public Contocorrente contopiuRicco()
    {
       Contocorrente max= conti.getFirst();
       for(Contocorrente c:conti)
       {
        if(max.saldo()<c.saldo())
        {
            max=c;
        }
       }
       return max;
    }
    public boolean trasferisci(Contocorrente da, Contocorrente a, double importo)
    {
        if(importo<0||da.saldo()-importo<0)
        {return false;}
        else
        {
            da.preleva(importo);
            a.deposita(importo);
            return true;
        }
    }
}
