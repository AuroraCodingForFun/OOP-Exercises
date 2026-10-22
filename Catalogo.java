/* 
Scrivi una classe Catalogo con un campo static final List<String> NOMI inizializzato in un blocco static, 
e un costruttore che stampa "nuovo catalogo". In un main crei due cataloghi. 
*/
import java.util.ArrayList;
import java.util.List;
public class Catalogo {
    static final List<String> NOMI;

    static
    {
        NOMI= new ArrayList<>();
    }
    public Catalogo()
    {
        System.out.println("Nuovo Catalogo"); ;
    }
}
