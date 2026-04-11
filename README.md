### MiniIMDB Movie Catalog App
#### Opis projekta
MiniIMDB je mobilna aplikacija koja korisnicima omogućava:
- pregled liste filmova;
- detaljan prikaz informacija o svakom filmu;
- pretragu filmova;
- ocjenjivanje filmova;
- dodavanje filmova u omiljene (favorites).

#### Cilj projekta
Cilj ovog projekta je razvoj Android mobilne aplikacije koja omogućava pregled kataloga filmova, pretragu po nazivu, ocjenjivanje filmova i upravljanje listom omiljenih filmova. Kroz ovaj projekat primijenjene su osnovne tehnike razvoja mobilnih aplikacija u Java programskom jeziku koristeći Android Studio.

#### Funkcionalnosti
#### 1. Glavni ekran
- Prikaz najmanje 20 filmova pomoću RecyclerView;
- Svaki film sadrži: - Sliku (poster); - Naziv; - Žanr; - Ocjenu.
#### 2. Pretraga
- Pretraga filmova po nazivu;
- Lista se automatski filtrira tokom unosa.

#### 3. Detalji filma
- Prikaz: - veće slike filma; - naziva; - žanra; - ocjene; - kratkog opisa.
- Lista glumaca: - slika glumca; - ime glumca.

#### 4. Ocjenjivanje
- Korisnik može promijeniti ocjenu filma pomoću RatingBar-a;
- Nova ocjena se prikazuje na glavnom ekranu.
#### 5. Omiljeni filmovi (Favorites)
- Dodavanje i uklanjanje filmova iz omiljenih;
- Poseban ekran za prikaz omiljenih filmova.
#### 6. UI poboljšanje
- Dodan Toolbar (AppBar) sa svim ekranima;
- Korišten CardView za prikaz filmova;
- Poboljšan raspored elemenata (spacing);
- Korištene stvarne slike za filmove i glumce.
#### Struktura projekta
#### 1. Aktivnosti
- MainActivity - prikaz liste filmova i pretraga;
- MovieDetailsActivity - detalji filma i ocjenjivanje;
- FavoritesActivity - prikaz omiljenih filmova.
#### 2. Paketi
- model: - Movie; - Actor.
- adapter: - MovieAdapter.
- data: -MovieData.
- utils: - FavoritesManager.
#### Korištene tehnologije
Za izradu projekta korištene su sledeće tehnologije:
- Java;
- Android Studio;
- XML layouti;
- RecyclerView;
- CardView;
- Intent komunikacija;
- RatingBar.
#### Pokretanje aplikacije (setup)
Za pokretanje aplikacije potrebno je uraditi sledeće:

1. Otvoriti projekat u Android Studio;
2. Sačekati da se Gradle sinhronizuje;
3. Pokrenuti aplikaciju u emulatoru ili fizičkom uređaju;
4. Aplikacija se pokreće na glavnom ekranu.
#### Korištenje aplikacije
- Pregled liste filmova skrolanjem;
- Korištenje pretrage za pronalaženje filmova;
- Klik na film za prikaz detalja;
- Promjena ocjene pomoću RatingBar-a;
- Dodavanje/uklanjanje iz omiljenih (favorites);
- Otvaranje Favorites ekrana.
#### Napomene
- Podaci o filmovima i glumcima su lokalno pohranjeni;
- Slike se nalaze u drawable folderu;
- Aplikacija prati osnovne principe Android razvoja.
#### Autor
- Ime i prezime: Ajla Halilčević
- Predmet: Razvoj mobilnih aplikacija
- Fakultet/smijer/godina: Internacionalna poslovno-informaciona akademija Tuzla / Informatika i računarstvo / treća godina studija.