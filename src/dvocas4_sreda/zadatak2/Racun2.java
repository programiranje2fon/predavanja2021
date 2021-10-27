package dvocas4_sreda.zadatak2;

import dvocas3_sreda.zadatak1.NacinPlacanja;

public class Racun2 {
		
	
	private int brojRacuna;
	private String[] nazivArtikla;
	private double[] jedinicnaCena;
	private int[] kolicina;
	NacinPlacanja nacinPlacanja;
	
	static int brojacRacuna=0;
	
	Racun2(int brojArtikala) {
		brojacRacuna= brojacRacuna+1;
		brojRacuna = brojacRacuna;
		
		nazivArtikla = new String[brojArtikala];
		jedinicnaCena = new double[brojArtikala];
		kolicina = new int[brojArtikala];
		
		nacinPlacanja = NacinPlacanja.GOTOVINA;		
	}
	
	double izracunajUkupanIznos() {
		double iznos = 0; // jedinicnaCena1 * kolicina1 + jedinicnaCena2 * kolicina2 + jedinicnaCena3 * kolicina3;
		for(int i=0; i<nazivArtikla.length; i++) {
			iznos = iznos + jedinicnaCena[i] * kolicina[i];
		}
		return iznos;
	}
	
	double izracunajKusur(double uplacenIznos) {
		return uplacenIznos - izracunajUkupanIznos();
	}
	
	double izracunajProsecnuCenuArtikla() {
		double prosCena =  0 ; // (jedinicnaCena1 + jedinicnaCena2 + jedinicnaCena3) / 3.0;
		
		for(int i=0; i< jedinicnaCena.length; i++) {
			prosCena = prosCena + jedinicnaCena[i];
		}
		
		return prosCena / jedinicnaCena.length;
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
	
	
	
	
	
	public String[] getNazivArtikla() {
		return nazivArtikla;
	}

	public void setNazivArtikla(String[] nazivArtikla) {
		this.nazivArtikla = nazivArtikla;
	}

	public double[] getJedinicnaCena() {
		return jedinicnaCena;
	}

	public void setJedinicnaCena(double[] jedinicnaCena) {
		this.jedinicnaCena = jedinicnaCena;
	}

	public int[] getKolicina() {
		return kolicina;
	}

	public void setKolicina(int[] kolicina) {
		this.kolicina = kolicina;
	}

	static void prikaziRacun(Racun2 racun) {
		System.out.println("Broj racuna: "+racun.brojRacuna);
		System.out.println("ARTIKLI");
		for(int i=0; i<racun.nazivArtikla.length; i++) {
			System.out.println((i+1)+": "+racun.nazivArtikla[i] + " | Jed. Cena: "+racun.jedinicnaCena[i] + " | Kol: "+racun.kolicina[i] );
		}
		
		//System.out.println("Artikal 1: "+racun.nazivArtikla1 + " Cena: "+racun.jedinicnaCena1 + " Kol: "+racun.kolicina1 );
		//System.out.println("Artikal 2: "+racun.nazivArtikla2 + " Cena: "+racun.jedinicnaCena2 + " Kol: "+racun.kolicina2 );
		//System.out.println("Artikal 3: "+racun.nazivArtikla3 + " Cena: "+racun.jedinicnaCena3 + " Kol: "+racun.kolicina3 );
		
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
	
	static Racun2 kreirajRacun(String[] naziv, double cena[], int[] kolicina) {
		Racun2 noviRacun = new Racun2(4);
			
		noviRacun.nazivArtikla = naziv;
		noviRacun.jedinicnaCena = cena;
		noviRacun.kolicina = kolicina;
		
		return noviRacun;		
	}
	
	
}
