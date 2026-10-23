/*
Vettore 
Classe immutabile che rappresenta un vettore di double:
costruttore che riceve un array;
dimensione(), componente(int i);
somma(Vettore altro) e prodottoScalare(Vettore altro) — ritornano nuovi oggetti;
norma() — radice quadrata della somma dei quadrati delle componenti;
toString() che stampa le componenti tra parentesi.
 */
import java.util.ArrayList;
import java.util.List;

public class Vettor {

    private ArrayList<Double> vett = new ArrayList<>();

    public Vettor( double[] a)
    {
        for( double i: a)
        {
            vett.add(i);
        }
    }
}
