/*
Vettore 
Classe immutabile che rappresenta un vettore di double:
costruttore che riceve un array;
dimensione(), componente(int i);
somma(Vettore altro) e prodottoScalare(Vettore altro) — ritornano nuovi oggetti;
norma() — radice quadrata della somma dei quadrati delle componenti;
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Vettor {

    private final double[] vett;

    public Vettor( double[] a)
    {
        this.vett = Arrays.copyOf(a, a.length);
    }
    public int dimensione()
    {
        return vett.length;
    }
    public double componente(int i)
    {
        return vett[i];
    }
    public Vettor somma(Vettor altro)
    {
        if(altro.dimensione()!=this.dimensione())
        {throw new IllegalArgumentException("Dimensioni diverse");}
        double[] sum = new double[vett.length];
        for(int i=0; i< vett.length; ++i)
        {
            sum[i]= altro.componente(i)+vett[i];
        }
        return new Vettor(sum);
    }
    public double prodottoScalare(Vettor altro)
    {
        if(altro.dimensione()!=this.dimensione())
        {throw new IllegalArgumentException("Dimensioni diverse");}
        double prod= 0;
        for(int i=0; i< vett.length; ++i)
        {prod+= vett[i]* altro.componente(i);}
        return prod;
    }
    public double norma()
    {
        double sum=0;
        for(double x: vett)
        {
            sum+=x*x;
        }
        return Math.sqrt(sum);
    }
}
