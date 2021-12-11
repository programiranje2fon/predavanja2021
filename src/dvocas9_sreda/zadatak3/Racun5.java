package dvocas9_sreda.zadatak3;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import dvocas3_sreda.zadatak1.NacinPlacanja;
import dvocas7_sreda.zadatak1.Artikal;

public class Racun5 {
		
	
	protected int brojRacuna;
	private List<Artikal> stavkeRacuna;
	
	protected NacinPlacanja nacinPlacanja;
	protected GregorianCalendar datumRacuna;
	
	protected int brojArtikala = 0;
	
	static int brojacRacuna=0;
	
	public Racun5() {
		brojacRacuna= brojacRacuna+1;
		brojRacuna = brojacRacuna;
		
		/**
		nazivArtikla = new String[brojArtikala];
		jedinicnaCena = new double[brojArtikala];
		kol/icina = new int[brojArtikala];
		*/
		
		stavkeRacuna = new ArrayList<>();
		
		datumRacuna = new GregorianCalendar();
		
		nacinPlacanja = NacinPlacanja.GOTOVINA;		
	}
	
	public void dodajArtikal(String naziv, double jedCena, int kol) {
		Artikal noviArtikal = new Artikal(naziv, jedCena, kol);

		stavkeRacuna.add(noviArtikal);
		brojArtikala++;
		
		/*
		for(int i=0; i<stavkeRacuna.length; i++) {
			if (stavkeRacuna[i]==null) {
				stavkeRacuna[i] = noviArtikal;
				brojArtikala++;
			}
		}*/
		
	}
	
	public void dodajArtikal(Artikal noviArtikal) {
		stavkeRacuna.add(noviArtikal);
		brojArtikala++;
		/**
		if (brojArtikala == stavkeRacuna.length) {
			System.out.println("Niz je pun!");
			return;
		}

		for(int i=0; i<stavkeRacuna.length; i++) {
			if (stavkeRacuna[i]==null) {
				stavkeRacuna[i] = noviArtikal;
				brojArtikala++;
			}
		}
		*/
		
	}		
	
	
	protected double izracunajUkupanIznos() {
		double ukupanIznos = 0; // jedinicnaCena1 * kolicina1 + jedinicnaCena2 * kolicina2 + jedinicnaCena3 * kolicina3;
		for(int i=0; i<stavkeRacuna.size(); i++) {
			if (stavkeRacuna.get(i) != null) {
				ukupanIznos = ukupanIznos + stavkeRacuna.get(i).izracunajIznos();
			}
		}
		return ukupanIznos;
	}
	
	public double izracunajKusur(double uplacenIznos) {
		return uplacenIznos - izracunajUkupanIznos();
	}
	
	protected double izracunajProsecnuCenuArtikla() {
		double suma =  0 ; // (jedinicnaCena1 + jedinicnaCena2 + jedinicnaCena3) / 3.0;
		
		for(int i=0; i< stavkeRacuna.size(); i++) {
			if (stavkeRacuna.get(i) != null) {
				suma = suma + stavkeRacuna.get(i).getJedinicnaCena();
			}
		}
		
		return suma / brojArtikala;
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
	
	
	
	
/**	
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
	
*/
	public GregorianCalendar getDatum() {
		return datumRacuna;
	}
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Broj racuna: "+brojRacuna).append(System.lineSeparator());
		sb.append("Datum:").append(datumRacuna.getTime()).append(System.lineSeparator());
		sb.append("ARTIKLI").append(System.lineSeparator());
		for(int i=0; i<stavkeRacuna.size(); i++) {
			if (stavkeRacuna.get(i) != null) {
				sb.append((i+1)+": "+stavkeRacuna.get(i).getNaziv() + 
							" | Jed. Cena: "+stavkeRacuna.get(i).getJedinicnaCena() +
							" | Kol: "+stavkeRacuna.get(i).getKolicina() ).append(System.lineSeparator());
			}
		}
			
		sb.append("Nacin placanja: "+nacinPlacanja).append(System.lineSeparator());	
		
		double iznos = izracunajUkupanIznos();
		sb.append("Ukupan iznos: "+iznos).append(System.lineSeparator());
		
		double kusur = izracunajKusur(5000);
		sb.append("Uplaceno 1000 din, kusur je "+kusur);		
		
		//double prosecnaCena = racun.izracunajProsecnuCenuArtikla();
		sb.append("Prosecna cena artikla: "+ izracunajProsecnuCenuArtikla() ).append(System.lineSeparator());
		sb.append("Ukupan porez: "+izracunajUkupanPorez()).append(System.lineSeparator());
		
		if (daLiJeBesplatnaIsporuka()) {		
			sb.append("Besplatna isporuka").append(System.lineSeparator());
		} else {
			sb.append("Nije besplatna isporuka").append(System.lineSeparator());
		}
		
		if (nagradnaIgra()) {
			sb.append("Cestitamo dobili ste nagradu!").append(System.lineSeparator());
		}		

		sb.append("------------------------------------------------------------").append(System.lineSeparator());
		
		return sb.toString();
	}



	
	
}
