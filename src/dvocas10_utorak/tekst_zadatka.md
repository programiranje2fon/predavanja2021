# Zadatak 1

Napraviti javnu klasu **Osoba** u paketu **dvocas10_utorak.zadatak1** koja ima:


- privatni atribut **imePrezime** koji predstavlja ime i prezime osobe.
- privatni atribut **adresa** koji predstavlja adresu stanovanja osobe.
- privatni atribut **telefon** koji predstavlja telefon osobe kao ceo broj.



- javne **get i set metode** za ve ove atribute. Atributi imePrezime i adresa ne smeju biti null niti prazni stringovi. Telefon mora biti broj veći od nule. U slučaju pokušaja unosa nedozvoljenih vrednosti baciti izuzetak sa odgovarajućom porukom.
- redefinisanu javnu **toString** metodu koja vraća String sa svim podacima o Osobi.
- redefinisanu javnu **equals** metodu koja poredi dva objekta klase Osoba i vraća true ako su im isti ime i prezime, a false ako nisu.


Napraviti javnu klasu **Imenik** u paketu **dvocas10_utorak.zadatak1** koja ima::

- privatni atribut **osobe** koji predstavlja **listu** objekata klase Osoba. Ovu listu treba odmah inicijalizovati kao ArrayList.


- javnu metodu **ucitajOsobu** koja **sa tastature** učitava sve podatke o jednoj osobi, pravi nov objekat klase Osoba, puni ga ovim podacima i unosi i listu **osobe**. Ako u listi postoji ista osoba, ne unositi je, već baciti izuzetak sa odgovarajućom porukom.**(učitavanja sa tastature, ulazni i izlazni tokovi u Javi, klasa BufferedReader, metoda readLine, parsiranje String-a u drugi format - klase Integer, Double, Boolean i metode parseInt, parseDouble, parseBoolean)***
- javnu metodu **pronadjiOsobu** koja **sa tastature** učitava deo imena ili prezimena neke osobe i u listi **osobe** pronalazi i ispisuje na ekranu podatke o svim osobama koje imaju uneti string kao deo imena ili prezimena.*
- javnu metodu **ispisi** koja kao na ekranu ispisuje sve osobe iz liste **osobe** i to po jedan red po osobi.


Napraviti javnu klasu **TestImenik** u paketu **dvocas10_utorak.zadatak1.test** koja u main metodi pravi jedan objekat klase Imenik, a onda unosi dve osobe sa tastature i ispisuje sve osobe iz imenika na ekranu.


# Zadatak 2


Napraviti javnu klasu **Imenik** u paketu **dvocas10_utorak.zadatak2** kao kopiju klase **Imenik** iz paketa **dvocas10_utorak.zadatak2** i prepraviti je tako da se za učitavanje sa tastature koristi klasa Scanner. **(klasa Scanner, metode nextLine, nextInt, nextDouble)**


