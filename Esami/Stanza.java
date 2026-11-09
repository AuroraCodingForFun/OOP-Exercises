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

public class Stanza {
    private double lunghezzax;
    private double lunghezzay;
    private double altezza;

    public Stanza(int lunghezzax, int lunghezzay, int altezza)
    {
        this.lunghezzax=lunghezzax;
        this.lunghezzay=lunghezzay;
        this.altezza=altezza;
    }

    public double area()
    {
        return this.lunghezzax*this.lunghezzay;
    }

    public double volume()
    {
        return this.area()*this.altezza;
    }
}
