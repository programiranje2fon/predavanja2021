package dvocas5_sreda.zadatak2;

import java.util.GregorianCalendar;

import dvocas3_sreda.zadatak1.NacinPlacanja;

public class Racun3 {
		
	
	protected int brojRacuna;
	protected String[] nazivArtikla;
	protected double[] jedinicnaCena;
	protected int[] kolicina;
	protected NacinPlacanja nacinPlacanja;
	protected GregorianCalendar datumRacuna;
	
	protected int brojArtikala = 0;
	
	static int brojacRacuna=0;
	
	public Racun3(int brojArtikala) {
		brojacRacuna= brojacRacuna+1;
		brojRacuna = brojacRacuna;
		
		nazivArtikla = new String[brojArtikala];
		jedinicnaCena = new double[brojArtikala];
		kolicina = new int[brojArtikala];
		
		datumRacuna = new GregorianCalendar();
		
		nacinPlacanja = NacinPlacanja.GOTOVINA;		
	}
	
	public void dodajArtikal(String naziv, double jedCena, int kol) {
		nazivArtikla[brojArtikala] = naziv;
		jedinicnaCena[brojArtikala] = jedCena;
		kolicina[brojArtikala] = kol;
		brojArtikala++;
	}
	
	
	protected double izracunajUkupanIznos() {
		double iznos = 0; // jedinicnaCena1 * kolicina1 + jedinicnaCena2 * kolicina2 + jedinicnaCena3 * kolicina3;
		for(int i=0; i<nazivArtikla.length; i++) {
			iznos = iznos + jedinicnaCena[i] * kolicina[i];
		}
		return iznos;
	}
	
	public double izracunajKusur(double uplacenIznos) {
		return uplacenIznos - izracunajUkupanIznos();
	}
	
	protected double izracunajProsecnuCenuArtikla() {
		double prosCena =  0 ; // (jedinicnaCena1 + jedinicnaCena2 + jedinicnaCena3) / 3.0;
		
		for(int i=0; i< jedinicnaCena.length; i++) {
			prosCena = prosCena + jedinicnaCena[i];
		}
		
		return prosCena / jedinicnaCena.length;
	}
	
	protected double izracunajUkupanPorez() {
		double porez = izracunajUkupanIznos() / 1.2;
		return porez;
	}
	
	public boolean daLiJeBesplatnaIsporuka() {
		double iznos = izracunajUkupanIznos();
		
		if (iznos > 3000) {
			return true;
		} else {
			return false;
		}
		
		// return iznos>3000;
	}
	
	public boolean nagradnaIgra() {
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
	
	public GregorianCalendar getDatum() {
		return datumRacuna;
	}
	

	static void prikaziRacun(Racun3 racun) {
		System.out.println("Broj racuna: "+racun.brojRacuna);
		System.out.println("Datum:" + racun.datumRacuna.getTime());
		System.out.println("ARTIKLI");
		for(int i=0; i<racun.nazivArtikla.length; i++) {
			System.out.println((i+1)+": "+racun.nazivArtikla[i] + " | Jed. Cena: "+racun.jedinicnaCena[i] + " | Kol: "+racun.kolicina[i] );
		}
			
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
	
	static String stringOdRacuna(Racun3 racun) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Broj racuna: "+racun.brojRacuna).append(System.lineSeparator());
		sb.append("Datum:").append(racun.datumRacuna.getTime()).append(System.lineSeparator());
		sb.append("ARTIKLI").append(System.lineSeparator());
		for(int i=0; i<racun.nazivArtikla.length; i++) {
			sb.append((i+1)+": "+racun.nazivArtikla[i] + " | Jed. Cena: "+racun.jedinicnaCena[i] + " | Kol: "+racun.kolicina[i] ).append(System.lineSeparator());
		}
			
		sb.append("Nacin placanja: "+racun.nacinPlacanja).append(System.lineSeparator());	
		
		double iznos = racun.izracunajUkupanIznos();
		sb.append("Ukupan iznos: "+iznos).append(System.lineSeparator());
		
		double kusur = racun.izracunajKusur(5000);
		sb.append("Uplaceno 1000 din, kusur je "+kusur);		
		
		//double prosecnaCena = racun.izracunajProsecnuCenuArtikla();
		sb.append("Prosecna cena artikla: "+ racun.izracunajProsecnuCenuArtikla() ).append(System.lineSeparator());
		sb.append("Ukupan porez: "+racun.izracunajUkupanPorez()).append(System.lineSeparator());
		
		if (racun.daLiJeBesplatnaIsporuka()) {		
			sb.append("Besplatna isporuka").append(System.lineSeparator());
		} else {
			sb.append("Nije besplatna isporuka").append(System.lineSeparator());
		}
		
		if (racun.nagradnaIgra()) {
			sb.append("Cestitamo dobili ste nagradu!").append(System.lineSeparator());
		}		

		sb.append("------------------------------------------------------------").append(System.lineSeparator());
		
		return sb.toString();
	}	

	static String htmlRacun(Racun3 racun) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<b>Broj racuna: "+racun.brojRacuna).append("</b>").append(System.lineSeparator());
		sb.append("Datum:").append(racun.datumRacuna.getTime()).append(System.lineSeparator());
		sb.append("ARTIKLI").append(System.lineSeparator());
		for(int i=0; i<racun.nazivArtikla.length; i++) {
			sb.append((i+1)+": "+racun.nazivArtikla[i] + " | Jed. Cena: "+racun.jedinicnaCena[i] + " | Kol: "+racun.kolicina[i] ).append(System.lineSeparator());
		}
			
		sb.append("Nacin placanja: "+racun.nacinPlacanja).append(System.lineSeparator());	
		
		double iznos = racun.izracunajUkupanIznos();
		sb.append("Ukupan iznos: "+iznos).append(System.lineSeparator());
		
		double kusur = racun.izracunajKusur(5000);
		sb.append("Uplaceno 1000 din, kusur je "+kusur);		
		
		//double prosecnaCena = racun.izracunajProsecnuCenuArtikla();
		sb.append("Prosecna cena artikla: "+ racun.izracunajProsecnuCenuArtikla() ).append(System.lineSeparator());
		sb.append("Ukupan porez: "+racun.izracunajUkupanPorez()).append(System.lineSeparator());
		
		if (racun.daLiJeBesplatnaIsporuka()) {		
			sb.append("Besplatna isporuka").append(System.lineSeparator());
		} else {
			sb.append("Nije besplatna isporuka").append(System.lineSeparator());
		}
		
		if (racun.nagradnaIgra()) {
			sb.append("Cestitamo dobili ste nagradu!").append(System.lineSeparator());
		}		

		sb.append("------------------------------------------------------------").append(System.lineSeparator());
		
		return sb.toString();
	}	
	
	
	static Racun3 kreirajRacun(String[] naziv, double cena[], int[] kolicina) {
		Racun3 noviRacun = new Racun3(4);
			
		noviRacun.nazivArtikla = naziv;
		noviRacun.jedinicnaCena = cena;
		noviRacun.kolicina = kolicina;
		
		return noviRacun;		
	}
	
	
}
