package EserciziEasy.GiocatoreSquadra;
/*
Giocatore, Squadra
  Giocatore: gol segnati e partite giocate.
  Squadra: nome e collezione di giocatori. Espone solo il nome, golTotali() e golPerPartita() 
  (gol totali / partite totali, non la media delle medie).
*/
public class Giocatore {
    private String nome;
    private int golSegnati;
    private int partiteGiocate;

    public Giocatore(String nome, int golSegnati, int partiteGiocate)
    {
        this.nome=nome;
        this.golSegnati=golSegnati;
        this.partiteGiocate=partiteGiocate;
    }
    public String getNome()
    {
        return this.nome;
    }
    public int getGolSegnati()
    {
        return this.golSegnati;
    }
    public int getPartiteGiocate()
    {
        return this.partiteGiocate;
    }
}
