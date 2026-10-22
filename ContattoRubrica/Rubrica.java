/*
Rubrica — collezione di contatti, con:
aggiungi(Contatto c) — rifiuta (ritorna false) se il numero è già presente;
rimuovi(String numero) — ritorna true se rimosso;
cercaPerPrefisso(String prefisso) — ritorna una nuova Rubrica con i contatti il cui nome inizia col prefisso;
numeroContatti().
 */
package ContattoRubrica;

import java.util.ArrayList;
import java.util.List;

public class Rubrica {
    private List<Contatto> contatti;
    public Rubrica()
    {
        contatti= new ArrayList<>();
    }
    public boolean aggiungi(Contatto c)
    {
        for(Contatto i: contatti)
        {
            if(i.getnumero().equals(c.getnumero()))
            {return false;}
        }
        contatti.addLast(c);
        return true;
    }
    public boolean rimuovi(String numero)
    {
        for(Contatto i: contatti)
        {
            if(i.getnumero().equals(numero))
            {
                contatti.remove(i);
                return true;
            }
        }
        return false;
    }
    public Rubrica cercaPrefisso(String pre)
    {
       Rubrica rub= new Rubrica();
       for(Contatto i: contatti)
        {
            if(i.getnome().startsWith(pre, 0))
            {
                rub.aggiungi(i);
            }
        }
        return rub;
    }
}
