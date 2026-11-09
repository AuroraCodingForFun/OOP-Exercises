/*
Si implementi una classe Stanza che rappresenta una stanza rettangolare di un
appartamento, e che memorizza la lunghezza in metri dei due lati della pianta della stanza
rettangolare, e l’altezza del soffitto. Esternamente devono essere accessibili solo la superficie
della stanza in metri quadri, e il suo volume in metri cubi. Tutti i dati devono essere
inizializzabili tramite costruttore.
Si implementi poi una classe Appartamento che contiene una collezione di appartamenti
inizializzati tramite costruttore, e il valore di tale appartamento. Oltra al valore, questa classe
deve esporre esternamente solo la superficie e il volume totali dell’appartamento.
*/

package Esami;
import java.util.ArrayList;
import java.util.List;

public class Appartamento {
    private double valore;
    private List<Stanza> appartamento;

    public Appartamento(double valore, List<Stanza> appartamento)
    {
        this.valore=valore;
        this.appartamento= new ArrayList<>(appartamento);
    }

    public double areatot()
    {
        double area=0;
        for(Stanza s: this.appartamento)
        {area+=s.area();}
        return area;
    }
    public double volumetot()
    {
        double volume=0;
        for(Stanza s: this.appartamento)
        {volume+=s.volume();}
        return volume;
    }
    public double getval()
    {return this.valore;}
}
