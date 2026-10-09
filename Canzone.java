/*Canzone e Playlist
    Canzone: titolo e durata in secondi.
    Playlist: collezione di canzoni nel costruttore. Espone solo durataTotale() in secondi e durataMedia().
*/

public class Canzone {
    private String titolo;
    private int durata;

    public Canzone(String titolo, int durata)
    {
        this.titolo=titolo;
        this.durata=durata;
    }
    public int getDurata()
    {
        return this.durata;
    }
    public String getTitolo()
    {
        return this.titolo;
    }
}
