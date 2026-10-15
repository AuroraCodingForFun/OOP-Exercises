/*Negozio, CentroCommerciale, MercatoCommerciale
  Si implementi una classe Negozio che memorizza la superficie in metri quadri e l’incasso annuo in euro. 
  Si implementi poi una classe CentroCommerciale che contiene una collezione di negozi e un nome, 
  inizializzati tramite costruttore. 

  Oltre al nome, la classe deve esporre solo la superficie totale e l’incasso totale.
  Si implementi infine MercatoCommerciale, che contiene una collezione inizialmente vuota di centri commerciali. 
  Deve fornire un metodo per aggiungere un centro e un metodo che, dato un CentroCommerciale, ritorna l’incasso stimato. 
  L’incasso stimato si calcola moltiplicando la superficie del centro per l’incasso medio per metro quadro dei centri 
  del mercato (media dei rapporti incasso/superficie dei centri, non rapporto delle somme).
*/
import java.util.ArrayList;
import java.util.List;

public class CentroCommerciale {
    private String nomeCentro;
    private List<Negozio> negozi;
    
}
