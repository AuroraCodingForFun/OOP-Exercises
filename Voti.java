import java.util.ArrayList;
import java.util.List;

public class Voti {
    private final List<Integer> voti;
    public Voti(List<Integer> voti) 
        { this.voti = new ArrayList<>(voti); }
    public List<Integer> getVoti() 
        { return voti; }
    public double media() 
    { 
        double med=0;
        int num=0;
        for( Integer  i: voti)
        {
            med+= i;
            ++num;
        }
        return med/num;
    }
}
