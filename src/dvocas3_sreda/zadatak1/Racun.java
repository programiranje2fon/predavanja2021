package dvocas3_sreda.zadatak1;

public class Racun {
		
	
	private int brojRacuna;
	String nazivArtikla1, nazivArtikla2, nazivArtikla3;
	double jedinicnaCena1, jedinicnaCena2, jedinicnaCena3;
	int kolicina1, kolicina2, kolicina3;
	NacinPlacanja nacinPlacanja;
	
	static int brojacRacuna=0;
	
	Racun() {
		brojacRacuna= brojacRacuna+1;
		brojRacuna = brojacRacuna; 
	}
	
	double izracunajUkupanIznos() {
		double iznos = jedinicnaCena1 * kolicina1 + jedinicnaCena2 * kolicina2 + jedinicnaCena3 * kolicina3;
		return iznos;
	}
	
	double izracunajKusur(double uplacenIznos) {
		return uplacenIznos - izracunajUkupanIznos();
	}
	
	double izracunajProsecnuCenuArtikla() {
		double prosCena = (jedinicnaCena1 + jedinicnaCena2 + jedinicnaCena3) / 3.0;
		return prosCena;
	}
	
	double izracunajUkupanPorez() {
		double porez = izracunajUkupanIznos() / 1.2;
		return porez;
	}
	
	boolean daLiJeBesplatnaIsporuka() {
		double iznos = izracunajUkupanIznos();
		
		if (iznos > 3000) {
			return true;
		} else {
			return false;
		}
		
		// return iznos>3000;
	}
	
	boolean nagradnaIgra() {
		double slucajanBroj = Math.random();
		if (slucajanBroj >0.5) return true;

		return false;
	}
	
	
	static void prikaziRacun(Racun racun) {
		System.out.println("Broj racuna: "+racun.brojRacuna);
		System.out.println("Artikal 1: "+racun.nazivArtikla1 + " Cena: "+racun.jedinicnaCena1 + " Kol: "+racun.kolicina1 );
		System.out.println("Artikal 2: "+racun.nazivArtikla2 + " Cena: "+racun.jedinicnaCena2 + " Kol: "+racun.kolicina2 );
		System.out.println("Artikal 3: "+racun.nazivArtikla3 + " Cena: "+racun.jedinicnaCena3 + " Kol: "+racun.kolicina3 );
		System.out.println("Nacin placanja: "+racun.nacinPlacanja);	
		
		double iznos = racun.izracunajUkupanIznos();
		System.out.println("Ukupan iznos: "+iznos);
		
		double kusur = racun.izracunajKusur(5000);
		System.out.println("Uplaceno 1000 din, kusur je "+kusur);		
		
		//double prosecnaCena = racun.izracunajProsecnuCenuArtikla();
		System.out.println("Prosecna cena artikla: "+ racun.izracunajProsecnuCenuArtikla() );
		System.out.println("Ukupan porez: "+racun.izracunajUkupanPorez());
		
		if (racun.daLiJeBesplatnaIsporuka()) {		
			System.out.println("Besplatna isporuka");
		} else {
			System.out.println("Nije besplatna isporuka");
		}
		
		if (racun.nagradnaIgra()) {
			System.out.println("Cestitamo dobili ste nagradu!");
		}		

		System.out.println("------------------------------------------------------------");
		
	}
	
	static Racun kreirajRacun(String naziv1, double cena1, String naziv2, double cena2, String naziv3, double cena3) {
		Racun noviRacun = new Racun();
		
		//noviRacun.brojRacuna = 1;
		noviRacun.nacinPlacanja = NacinPlacanja.GOTOVINA;
		
		noviRacun.nazivArtikla1 = naziv1;
		noviRacun.jedinicnaCena1 = cena1;
		noviRacun.kolicina1 = 1;
		
		noviRacun.nazivArtikla2 = naziv2;
		noviRacun.jedinicnaCena2 = cena2;
		noviRacun.kolicina2 = 1;
		
		noviRacun.nazivArtikla3 = naziv3;
		noviRacun.jedinicnaCena3 = cena3;
		noviRacun.kolicina3 = 1;
		
		return noviRacun;
		
	}
	
	
}
