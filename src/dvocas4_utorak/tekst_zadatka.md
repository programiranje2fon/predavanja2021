# Zadatak 1

Napraviti klasu **IspitneOcene** u paketu **dvocas4_utorak.zadatak1** koja ima:

- atribut **nazivPredmeta** koji predstavlja naziv predmeta na koji se odnose ocene
- atribut **ocene** koji predstavlja niz sa ocenama koje su dobili studenti na ispitu iz tog predmeta. Ocene mogu biti u rasponu od 5 do 10. **(nizovi u Javi, deklaracija niza)**


**Problem**: nizovi moraju da se inicijalizuju na određeni kapacitet pre nego što mogu da se koriste.

- konstruktor koji prima dva parametra: naziv predmeta i broj studenata koji su polagali ispit. Konstruktor treba da postavi atribut nazivPredemta na unetu vrednost za naziv, a da niz ocene inicijalizuje tako da mu kapacitet bude jednak unetom broju studenata. Ako je uneti broj studenata nula ili manji od nule, ispisati poruku o grešci na ekranu i inicijalizovati niz na kapacitet 100. **(Inicijalizacija niza - odmah pri deklaraciji ili u konstruktoru, kapacitet niza, istovremena (brza) inicijalizacija niza i dodeljivanje vrednosti)**


**Problem**: možda neko ne zna odmah broj studenata koji je polagao ispit.
- konstruktor koji prima samo naziv predmeta postavlja atribut nazivPredmeta na unetu vrednost. Takođe, inicijalizuje niz ocene na kapacitet 100. **(Klasa može imati više konstruktora po potrebi)**


- Napraviti metodu **ispisi** koja na ekranu ispisuje naziv predmeta i sve elemente niza ocene. **(pristupanje elementima niza, indeksi elemenata niza, kapacitet niza - length, iteracija kroz niz)**

Napraviti klasu **TestIspitneOcene** u paketu **dvocas4_utorak.zadatak1** koja ima main metodu i u kojoj se testiraju atributi i metode klase IspitneOcene. Napraviti objekat klase IspitneOcene za predmet "Programiranje 2" koji je polagalo 8 studenata. Ispisati na ekranu sve podatke iz objekta IspitneOcene.**(objasniti debugger na primeru metode ispisi i na primeru konstruktora. Postaviti break-pointe, objasniti debug perspektivu)**



Dodati u klasu **ispitneOcene**:

- metodu **unesiOcenu** koja kao parametar prima ocenu i unosi je u niz **ocene**. Ocena mora biti u rasponu od 5 do 10 (uključujući i te vrednosti), inače se ne unosi već se ispisuje poruka o grešci na ekranu. Takođe, ocena se unosi na prvo slobodno mesto u nizu (vrednost elementa niza na to mestu je 0). Ako u nizu nema slobodnih mesta, ispisuje se poruka o grešci na ekranu.**(iteracija kroz niz sa selekcijom, prekidanje petlje)**


U main metodi klase **TestIspitneOcene** u već napravljeni objekat IspitneOcene uneti ocene: 10, 10, 8, 9, 5, 6. **(objasniti da niz nije popunjen do kraja i razliku između kapaciteta i popunjenosti niza)**



**Problem**: ako se svaki put prolazi kroz ceo niz, možda nema potrebe da se uvodi brojač petlje?
- Napisati metodu **ispisi** preko for-each petlje **(for-each petlja, samo za kolekcije, skoro samo za read-only pristup)**


Dodati u klasu **IspitneOcene**:

- metodu **izracunajProsek** koja izračunava i vraća prosečnu ocenu na ispitu. Ne uzimati u razmatranje one elemente niza koji imaju vrednost 0. **(algoritam za prosek, for, while i for-each varijanta)**

- metodu **pronadjiNajvisuOcenu** koja pretražuje niz **ocene** i na ekranu ispisuje najvišu ocenu na ispitu. Ne uzimati u razmatranje one elemente niza koji imaju vrednost 0. **(algoritam za maksimum, početna vrednost za maksimum, pokazati ovaj algoritam u debugger-u)**

- metodu **izracunajProlaznost** koja izračunava i na ekranu ispisuje procenat studenata koji je položio ispit. Ne uzimati u razmatranje one elemente niza koji imaju vrednost 0.**(objasniti kako deljenje celih brojeva može imati neočekivane posledice, u ovom slučaju procenat je 0)**


U klasi **TestIspitneOcene** pozvati ove nove metode i proveriti njihov rad.


**Problem**: da li postoji mogućnost da se ubrza svaki od ovih algoritama, i nekako optimizuje rad klase? Ovde može veoma lako jer se elementi niza unose od početka niza i nema izbacivanja.


Napraviti kopiju klase IspitneOcene sa nazivom **IspitneOcene2** i uvesti u nju sledeće izmene:
- Uvesti atribut **brojac** koji pamti koliko je ocena zaista uneto u niz (ne koliki je kapacitet). Ovaj atribut ima početnu vrednost 0, a uvećava se posle svakog unosa. 
- Promeniti kod svih metoda tako da rade koristeći atribut brojac.




 