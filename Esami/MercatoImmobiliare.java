/*
Si implementi una classe MercatoImmobiliare che contiene una collezione di appartamenti
inizialmente vuota. Tale classe deve fornire un metodo che permette di aggiungere
appartamenti al MercatoImmobiliare, e un metodo che, dato un Appartamento, ritorna il
suo valore. Tale valore deve essere calcolato moltiplicando la superficie dell’appartamento
per il valore medio degli appartamenti nel MercatoImmobiliare per metro quadro.
Ad esempio, se in MercatoImmobiliare c’e’ un Appartamento di valore 100 e superficie 100
metri quadri, e un Appartamento di valore 150 e superficie 75 metri quadri, il valore medio
per metro quadro sara’ di 1,5 (ovvero la media tra 1 - valore per metro quadro del primo
appartemento - e 2 - valore per metro quadro del secondo appartamento). Passando quindi
un appartamento di superficie 200, il metodo deve ritornare 300.

*/
package Esami;

import java.util.ArrayList;
import java.util.List;

public class MercatoImmobiliare {
    private List<Appartamento> mercato;

    public MercatoImmobiliare()
    {
        this.mercato= new ArrayList<>();
    }

    public void addAppartamento(Appartamento a)
    {
        this.mercato.addLast(a);
    }

    protected double value()
    {
        double val=0;
        double sup=0;
        for(Appartamento a: this.mercato)
        {
            val+= a.getval();
            sup+= a.areatot();
        }
        return val/sup;
    }

    public double valore(Appartamento a)
    {
        return a.areatot()*this.value();
    }
}
