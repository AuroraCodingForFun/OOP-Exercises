<h1 align="center">
 📓 Objected Oriented Programming-Exercises 📓
</h1>

# Exercises to prepare myself to my OOP exam 👩🏻‍💻💡

<h4>Listed by least to first:</h4>

<h2 style="background-color: #070707">Esercizi Hard:</h2>

- Shape → Polygon → Triangle / Quadrilateral (abstract + final + Liskov)
  <h6>
  Shape (astratta): name; astratto double area(); astratto double perimeter().
  Polygon extends Shape: campo int sides; final int sides().
  Triangle extends Polygon: lati a, b, c; area() con Erone; perimeter().
  Quadrilateral extends Polygon: lati a, b, c, d; perimeter(); area() astratto (non tutti i quadrilateri hanno formula unica).
  Rectangle extends Quadrilateral: width, height; area().
  </h6>

  <h2 style="background-color: #f9ea7a">Esercizi medium:</h2>

- Animal, Mammal, Dog
  <h6>
  Animal (astratta): name, protected int energy = 100, astratto String sound(), concreto void eat(int amount) che aumenta energy, e void speak() che stampa name + ": " + sound().
  Mammal extends Animal: campo bodyTemperature; override di eat che chiama super.eat(amount) ma con un bonus (es. +10%).
  Dog extends Mammal: sound() ritorna "Woof"; override di speak() che stampa "🐕 " + super.speak().
  </h6>
- Sistema di dispositivi
  <h6>
  Device (astratta): costruttore Device(String name, Room room), turnOn(), turnOff(), isOn(), getName(), getRoomName(), e un metodo astratto double getWatts().
  Lamp extends Device: campo maxWatts; getWatts() ritorna maxWatts se accesa, altrimenti 0.
  DimmableLamp extends Lamp: campo brightness (0–100); setBrightness(int) che aggiorna anche on (lampada spenta se brightness = 0); override di turnOn() che, se brightness era 0, la porta a 10 (come nelle slide).
  </h6>

- Vettore 
<h5>
Classe immutabile che rappresenta un vettore di double:
costruttore che riceve un array;
dimensione(), componente(int i);
somma(Vettore altro) e prodottoScalare(Vettore altro) — ritornano nuovi oggetti;
norma() — radice quadrata della somma dei quadrati delle componenti;
<<<<<<< HEAD
</h6>
=======
toString() che stampa le componenti tra parentesi.
</h5>
>>>>>>> 4beeb12154d38c9db6072439e36d84ee38b03ebd

- Evento, Biglietto
<h5>
Evento — nome, capienza e prezzo base:
prenota() — ritorna un Biglietto se ci sono posti, altrimenti null;
postiRimanenti();
incassoTotale() — somma dei prezzi dei biglietti venduti.
Biglietto — immutabile, con un id progressivo (1, 2, 3…) assegnato nel costruttore tramite un campo static (ricicla l'idea dell'esercizio Ticket), più nome dell'evento e prezzo.
</h5>

- ContoCorrente, Banca
<h5>
ContoCorrente — intestatario e saldo. Espone deposita(double importo), preleva(double importo) e saldo().
Banca — collezione di conti:
apriConto(String intestatario) — crea un conto con saldo 0 e lo aggiunge;
saldoTotale();
contoPiuRicco() — ritorna il conto col saldo maggiore;
trasferisci(ContoCorrente da, ContoCorrente a, double importo) — ritorna true solo se il trasferimento è andato a buon fine.
</h5>

- Contatto, Rubrica
<h5>
Contatto — classe immutabile con nome e numero di telefono (String). Espone solo nome() e numero().
Rubrica — collezione di contatti, con:
aggiungi(Contatto c) — rifiuta (ritorna false) se il numero è già presente;
rimuovi(String numero) — ritorna true se rimosso;
cercaPerPrefisso(String prefisso) — ritorna una nuova Rubrica con i contatti il cui nome inizia col prefisso;
numeroContatti().
</h5>

- Orario 
<h5>
  Scrivi Orario (ore, minuti) con tre costruttori: (ore, minuti), (ore) e (), che deleghino al primo con this(...). Gli oggetti sono immutabili: il metodo piuMinuti(int m) ritorna un nuovo Orario, gestendo il riporto delle ore (es. 10:50 + 20 → 11:10).
  </h5>

- Catalogo
  <h5>
  Scrivi una classe Catalogo con un campo static final List<String> NOMI inizializzato in un blocco static, e un costruttore che stampa "nuovo catalogo". In un main crei due cataloghi.
  </h5>

- Ticket con id progressivo
  <h5>
  Ticket in cui ogni oggetto ha un id final progressivo (1, 2, 3...) assegnato nel costruttore tramite un campo static. Esponi solo getId() e un metodo static quantiCreati().
  </h5>

- Negozio, CentroCommerciale, MercatoCommerciale
  <h5>
  Si implementi una classe Negozio che memorizza la superficie in metri quadri e l’incasso annuo in euro. Si implementi poi una classe CentroCommerciale che contiene una collezione di negozi e un nome, inizializzati tramite costruttore. Oltre al nome, la classe deve esporre solo la superficie totale e l’incasso totale.

  Si implementi infine MercatoCommerciale, che contiene una collezione inizialmente vuota di centri commerciali. Deve fornire un metodo per aggiungere un centro e un metodo che, dato un CentroCommerciale, ritorna l’incasso stimato. L’incasso stimato si calcola moltiplicando la superficie del centro per l’incasso medio per metro quadro dei centri del mercato (media dei rapporti incasso/superficie dei centri, non rapporto delle somme).

  Da pensare: che cosa ritorna il metodo se il mercato è vuoto? Un centro con superficie 0 che cosa provoca nella media? Decidi e documenta nel Javadoc.
  </h5>

<h2 style="background-color: #99ff66;">Esercizi easy:</h2>

- Giocatore, Squadra
  <h5>
  Giocatore: gol segnati e partite giocate.
  <br>
  Squadra: nome e collezione di giocatori. Espone solo il nome, golTotali() e golPerPartita() (gol totali / partite totali, non la media delle medie).
  </h5>

- Libro, Scaffale, Libreria
    <h5>
    Libro: pagine e prezzo.
    <br>
    Scaffale: collezione di libri. Espone solo pagine() e prezzo() totali.
    <br>
    Libreria: collezione di scaffali e un nome. Espone il nome, pagineTotali() e prezzoTotale().
    </h5>

- Stanza e Appartamento (versione completa dell’esame)
    <h5>
    Stanza: lunghezza e larghezza (lati della pianta) e altezza del soffitto, dati nel costruttore. Esternamente accessibili solo superficie() e volume().
    <br>
    Appartamento: collezione di stanze e un valore, dati nel costruttore. Oltre al valore, espone solo superficieTotale() e volumeTotale().
    </h5>

- Film e Cinema
    <h5>
    Film: durata in minuti e prezzo del biglietto.
    <br>
    Cinema: espone solo incassoPotenziale() (somma dei prezzi) e durataMassima().
    </h5>

- 💿🎧 Canzone + Playlist 
  <h5>
  Canzone: titolo e durata in secondi.
  <br>
    Playlist: collezione di canzoni nel costruttore. Espone solo durataTotale() in secondi e durataMedia().
  </h5>

- 🛒🛍️Prodotto e Carrello
  <h5>
  Prodotto: prezzo e quantità.
  <br>
  Carrello: espone solo totale() (somma di prezzo × quantità) e numeroArticoli() (somma delle quantità).
  </h5>

- 🔲 Rettangolo
  <h5>
  Rettangolo: Base, Altezza, Area e Perimetro
  </h5>

<h5 align="center"> ❤️ </h5>
