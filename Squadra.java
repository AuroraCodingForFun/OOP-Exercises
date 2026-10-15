/*
Giocatore, Squadra
  Giocatore: gol segnati e partite giocate.
  Squadra: nome e collezione di giocatori. Espone solo il nome, golTotali() e golPerPartita() 
  (gol totali / partite totali, non la media delle medie).
*/
import java.util.ArrayList;
import java.util.List;
public class Squadra {
    private List<Giocatore> squadra;
    private String nomeSquadra;
    private int partiteGiocateS;
    public Squadra(String nome, List<Giocatore> squadra, int partiteGiocateS)
    {
        this.nomeSquadra=nome;
        this.squadra= new ArrayList<>(squadra);
        this.partiteGiocateS=partiteGiocateS;
    }
    public String getNomeSquadra()
    {
        return this.nomeSquadra;
    }
    public int golTotali()
    {
        int tot=0;
        for(Giocatore g: squadra)
        {
            tot+=g.getGolSegnati();
        }
        return tot;
    }
    public double golPerPartita()
    {
        return (double) golTotali()/partiteGiocateS;
    }
}
