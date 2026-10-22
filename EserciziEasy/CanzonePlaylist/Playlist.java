package EserciziEasy.CanzonePlaylist;
/*Canzone e Playlist
    Canzone: titolo e durata in secondi.
    Playlist: collezione di canzoni nel costruttore. Espone solo durataTotale() in secondi e durataMedia().
*/
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Canzone> canzoni;
    public Playlist(List<Canzone> canzoni)
    {
        this.canzoni=new ArrayList<>(canzoni);
    }
    public int durataTotale()
    {
        int count=0;
        for(Canzone i:canzoni)
        {
            count+=i.getDurata();
        }
        return count;
    }
    public double durataMedia()
    {
        return (double) durataTotale() / canzoni.size();
    }
}
