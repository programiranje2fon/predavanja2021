# Zadatak 1

Napraviti klasu **Menjacnica** u paketu **dvocas3_utorak.zadatak1** koja ima:

- atribut **prodajniKurs** koji predstavlja prodajni kurs neke valute u menjačnici (npr. 118.5) **(Default vrednosti za tipove podataka u Javi double 0.0, int 0, boolean false, char '\u0000' (null znak), String i ostali objekti null)**
- atribut **kupovniKurs** koji predstavlja kupovni kurs neke valute u menjačnici (npr. 117.2)
- atribut **srednji kurs** koji predstavlja srednji kurs neke valute u menjačnici (npr. 117.85).
- Atribut valuta koji predstavlja oznaku valutu koja se menja (npr. "EUR" ili "USD").

- metodu **postaviProdajniKurs** koja kao parametar dobija vrednost za prodajni kurs i postavlja vrednost atributa prodajniKurs na novounetu vrednost, samo ako je veća od nule. Inače ispisuje poruku o grešci na ekranu.**(postaviti da naziv parametra bude pk)**

- metodu **postaviKupovniKurs** koja kao parametar dobija vrednost za kupovni kurs i postavlja vrednost atributa kupovniKurs na novounetu vrednost, samo ako je veća od nule. Inače ispisuje poruku o grešci na ekranu.**(postaviti da naziv parametra bude kk)**

- metodu **postaviValutu** koja kao parametar dobija vrednost oznake za valutu i postavlja vrednost atributa valuta na novounetu vrednost, samo ako je različita od null. Inače ispisuje poruku o grešci na ekranu.**(postaviti da naziv parametra bude v)**

- metodu **izracunajSrednjiKurs** koja nema parametre, već izračunava vrednost srednjeg kursa kao aritmetičku sredinu između prodajnog i kupovnog kursa, samo ako su obe vrednosti veće od nule. Inače ispisuje poruku o grešci na ekranu.**(aritmetički operatori +, -, / , *, ++ i --)**

- metodu **zameniZaDinare** koja kao parametar dobija količinu strane valute (evra, dolara i td.) koje klijent menjačnice želi da zameni za dinare, a metoda vraća koliko će dinara klijent dobiti. Koristiti atribut kupovni kurs pri izračunavanju.

- metodu **zameniZaStranuValutu** koja kao parametar dobija željenu količinu strane valute (evra, dolara i td.) koje klijent menjačnice želi da kupi, a metoda vraća koliko dinara klijent treba da da menjačnici. Koristiti atribut prodajni kurs pri izračunavanju.

- metodu **ispisi** koja na ekranu ispisuje sva tri kursa u menjačnici i naziv valute uz odgovarajuću poruku.

Napraviti klasu **TestMenjacnica** u paketu **dvocas3_utorak.zadatak1** koja ima main metodu i u kojoj se testiraju atributi i metode klase Menjacnica. Prvo napraviti jedan objekat klase Menjacnica, pa onda postaviti kupovni kurs na 117.0 i prodajni na 118.5, a valutu na "EUR". Ispisati podatke o menjačnici na ekranu i ispisati koliko klijent može da dobije dinara ako zameni 100 evra za dinare. Pozvati metodu za izračunavanje srednjeg kursa, pa ponovo ispisati. Napraviti još jedan objekat klase Menjacnica, ali ovaj put sa kursevima 109.8 i 111.0 i oznakom valute "CHF" i ponoviti sve pozive za ovaj objekat.



- **Objasniti zašto camel case i [Java naming conventions](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html) - koji se problem time rešava?**
- **Objasniti Eclipse autocompletion, i kako izlazi dokumentacija kada se iskuca.**
- **Pokazati dokumentaciju klase java.lang.Math na Oracle sajtu i u Eclipse editoru. Pokušati sa Math.random() u metodi zameniZaDinare**
- **Objasniti i Eclipse perspektive i kako se perspektiva resetuje, premeštaju i otvaraju/zatvaraju podprozori, pokazati Window - Show view iz glavnog menija.**

Potrebno je uneti neke izmene u klasu Menjacnica.

- **Problem**: kao parametri metoda se prikazuju kk, pk i v koji ne znače ništa posebno jer su skraćeni.
- Izmeniti nazive parametara v, kk i pk u metodama klase Menjacnica u valuta, prodajniKurs i kupovniKurs i ponovo probati kod iz main metode.**(Objasniti zašto se dešava da se ne dodeljuje ništa, pa onda objasniti this)**


- **Problem**: klasa može da se koristi iako još nisu postavljene obavezne vrednosti za naziv valute, i kurseve. Nema smisla postavljati početne (default) vrednosti za atribute. Trebalo bi obavezati korisnika da unese ove podatke odmah na početku.
- Napraviti konstruktor koji prima tri parametra: valutu, prodajni kurs i kupovni kurs i koji omogućava unos ove tri vrednosti u odgovarajuće atribute i koji automatski poziva metodu izracunajSrednjiKurs da postavi i tu vrednost.**(Konstruktori, klasa može imati više konstruktora, default, bezparametarski i parametrizovani)**


- **Problem**: Kao naziv valute može da se unese bilo koji neprazan String. Bolje bi bilo ograničiti korisnika na par opcija: EUR, USD i možda još poneki.


Napraviti nabrojivi tip **Valuta** u paketu **dvocas3_utorak.zadatak1** koji ima sledeće instance: **EUR**, **USD** i **CHF**. Izmeniti klasu Menjacnica tako da se koristi nabrojivi tip Valuta umesto String-a.**(Nabrojivi tip, instance)**


# Zadatak 2

Napraviti klasu **Ispisivac** u paketu **dvocas3_utorak.zadatak2**. Ova klasa bi trebalo da ima:

- metodu **ispisiZdravo** koja na ekranu ispisuje poruku "Zdravo" 5 puta. **(FOR petlja, osnovna sintaksa, kada se koristi)**

Napraviti klasu **TestIspisivac** u paketu **dvocas3_utorak.zadatak2** koja ima main metodu iz koje se pozivaju i proveravaju metode klase Ispisivac.

** Problem **: zašto uopšte praviti objekat klase Ispisivac da bi se pozvala jedna metoda za ispis? Klasa ne pamti trenutno stanje (nema čak ni atribute), pa zašto onda rezervisati memorijski prostor za objekat uopšte?

- Izmeniti metodu **ispisiZdravo** tako da bude statička. Izmeniti i sve pozive ove metode. **(objasniti statičke metode)**

Dodati u klasu Ispisivac:
- Statičku metodu **ispisiPoruku** koja kao parametar dobija poruku koju je na ekranu potrebno ispisati 10 puta.
- Statičku metodu **ispisiPoruku** koja ima dva parametra: poruku koju treba ispisati na ekranu i ceo broj koji predstavlja koliko puta treba ispisati tu poruku na ekranu. Metoda na ekranu ispisuje poruku željeni broj puta. **(Preklapanje metoda - overloading)**
- Statičku metodu **ispisiBrojeveOd1Do20** koja nema parametre i koja na ekranu ispisuje brojeve od 1 do 20. Pre ispisa brojeva, treba ispisati reč "START" na ekranu, a posle ispisa svih brojeva reč "STOP". **(Pokazati i isprobati beskonačnu petlju i kako se prekida izvršavanje takvog koda u Eclipse-u, neizvršivu petlju)**


** Problem **: kako kontrolisati preciznije izršavanje petlje: prekinuti petlju pre izvršenog uslova za prekid, preskočiti neki krug (iteraciju, ciklus) petlje, kako prekinuti celu metodu.

- Izmeniti kod metode **ispisiBrojeveOd1Do20** tako da se ne ispisuje broj 15, a svi ostali ispišu normalno. **(continue naredba)**
- Izmeniti kod metode **ispisiBrojeveOd1Do20** tako da se ispis brojeva prekida posle broja 18, a da se ipak metoda izvrši do kraja i ispiše reč "STOP" posle ispisa brojeva. **(break naredba)**
- Izmeniti kod metode **ispisiBrojeveOd1Do20** tako da se izvršavanje metode prekida posle broja 18. **(return naredba, može čak iako metoda ne vraća ništa)**


** Problem **: a šta ako nije poznat broj iteracija unapred, pa nema smisla koristiti for petlju?

Dodati u klasu Ispisivac:

- Statičku metodu **vremeDupliranja** koja kao parametre dobija iznos novca koji je uložen u banku i godišnju kamatu koju banka daje na uložen novac. Metoda na ekranu ispisuje iznos novca u banci posle svake godine i to sve dok se novac ne duplira u odnosu na originalni iznos. Pretpostavlja se da klijent ne podiže novac u međuvremenu tj. da će ići "kamata na kamatu".**(while petlja, i napomenuti da se svaka petlja može ispisati i preko while i preko for naredbe)**