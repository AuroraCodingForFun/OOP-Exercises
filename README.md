<h1 align="center">
 📓 Objected Oriented Programming-Exercises 📓
</h1>

# Exercises to prepare myself to my OOP exam 👩🏻‍💻💡

<h4>Listed by least to first:</h4>

<h2 style="background-color: #ffa666;">Esercizi medium:</h2>

- Vettore 
<h6>
Classe immutabile che rappresenta un vettore di double:
costruttore che riceve un array (⚠️ copia difensiva: non conservare il riferimento ricevuto!);
dimensione(), componente(int i);
somma(Vettore altro) e prodottoScalare(Vettore altro) — ritornano nuovi oggetti;
norma() — radice quadrata della somma dei quadrati delle componenti;
toString() che stampa le componenti tra parentesi.
</h6>

- Evento, Biglietto
<h6>
Evento — nome, capienza e prezzo base:
prenota() — ritorna un Biglietto se ci sono posti, altrimenti null;
postiRimanenti();
incassoTotale() — somma dei prezzi dei biglietti venduti.
Biglietto — immutabile, con un id progressivo (1, 2, 3…) assegnato nel costruttore tramite un campo static (ricicla l'idea dell'esercizio Ticket), più nome dell'evento e prezzo.
</h6>

- ContoCorrente, Banca
<h6>
ContoCorrente — intestatario e saldo. Espone deposita(double importo), preleva(double importo) e saldo().
Banca — collezione di conti:
apriConto(String intestatario) — crea un conto con saldo 0 e lo aggiunge;
saldoTotale();
contoPiuRicco() — ritorna il conto col saldo maggiore;
trasferisci(ContoCorrente da, ContoCorrente a, double importo) — ritorna true solo se il trasferimento è andato a buon fine.
</h6>

- Contatto, Rubrica
<h6>
Contatto — classe immutabile con nome e numero di telefono (String). Espone solo nome() e numero().
Rubrica — collezione di contatti, con:
aggiungi(Contatto c) — rifiuta (ritorna false) se il numero è già presente;
rimuovi(String numero) — ritorna true se rimosso;
cercaPerPrefisso(String prefisso) — ritorna una nuova Rubrica con i contatti il cui nome inizia col prefisso;
numeroContatti().
</h6>

- Orario 
<h6>
  Scrivi Orario (ore, minuti) con tre costruttori: (ore, minuti), (ore) e (), che deleghino al primo con this(...). Gli oggetti sono immutabili: il metodo piuMinuti(int m) ritorna un nuovo Orario, gestendo il riporto delle ore (es. 10:50 + 20 → 11:10).
  </h6>

- Catalogo
  <h6>
  Scrivi una classe Catalogo con un campo static final List<String> NOMI inizializzato in un blocco static, e un costruttore che stampa "nuovo catalogo". In un main crei due cataloghi.
  </h6>

- Ticket con id progressivo
  <h6>
  Ticket in cui ogni oggetto ha un id final progressivo (1, 2, 3...) assegnato nel costruttore tramite un campo static. Esponi solo getId() e un metodo static quantiCreati().
  </h6>

- Negozio, CentroCommerciale, MercatoCommerciale
  <h6>
  Si implementi una classe Negozio che memorizza la superficie in metri quadri e l’incasso annuo in euro. Si implementi poi una classe CentroCommerciale che contiene una collezione di negozi e un nome, inizializzati tramite costruttore. Oltre al nome, la classe deve esporre solo la superficie totale e l’incasso totale.

  Si implementi infine MercatoCommerciale, che contiene una collezione inizialmente vuota di centri commerciali. Deve fornire un metodo per aggiungere un centro e un metodo che, dato un CentroCommerciale, ritorna l’incasso stimato. L’incasso stimato si calcola moltiplicando la superficie del centro per l’incasso medio per metro quadro dei centri del mercato (media dei rapporti incasso/superficie dei centri, non rapporto delle somme).

  Da pensare: che cosa ritorna il metodo se il mercato è vuoto? Un centro con superficie 0 che cosa provoca nella media? Decidi e documenta nel Javadoc.
  </h6>

<h2 style="background-color: #99ff66;">Esercizi easy:</h2>

- Giocatore, Squadra
  <h6>
  Giocatore: gol segnati e partite giocate.
  <br>
  Squadra: nome e collezione di giocatori. Espone solo il nome, golTotali() e golPerPartita() (gol totali / partite totali, non la media delle medie).
  </h6>

- Libro, Scaffale, Libreria
    <h6>
    Libro: pagine e prezzo.
    <br>
    Scaffale: collezione di libri. Espone solo pagine() e prezzo() totali.
    <br>
    Libreria: collezione di scaffali e un nome. Espone il nome, pagineTotali() e prezzoTotale().
    </h6>

- Stanza e Appartamento (versione completa dell’esame)
    <h6>
    Stanza: lunghezza e larghezza (lati della pianta) e altezza del soffitto, dati nel costruttore. Esternamente accessibili solo superficie() e volume().
    <br>
    Appartamento: collezione di stanze e un valore, dati nel costruttore. Oltre al valore, espone solo superficieTotale() e volumeTotale().
    </h6>

- Film e Cinema
    <h6>
    Film: durata in minuti e prezzo del biglietto.
    <br>
    Cinema: espone solo incassoPotenziale() (somma dei prezzi) e durataMassima().
    </h6>

- 💿🎧 Canzone + Playlist 
  <h6>
  Canzone: titolo e durata in secondi.
  <br>
    Playlist: collezione di canzoni nel costruttore. Espone solo durataTotale() in secondi e durataMedia().
  </h6>

- 🛒🛍️Prodotto e Carrello
  <h6>
  Prodotto: prezzo e quantità.
  <br>
  Carrello: espone solo totale() (somma di prezzo × quantità) e numeroArticoli() (somma delle quantità).
  </h6>

- 🔲 Rettangolo
  <h6>
  Rettangolo: Base, Altezza, Area e Perimetro
  </h6>

<h6 align="center"> ❤️ </h6>
