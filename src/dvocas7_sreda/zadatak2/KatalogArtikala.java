package dvocas7_sreda.zadatak2;

import java.util.Arrays;

import dvocas7_sreda.zadatak1.Artikal;

public class KatalogArtikala {
	
	private Artikal[] artikli;
	
	public KatalogArtikala(int brojArtikala) {
		artikli = new Artikal[brojArtikala]; // kreiranje niza objekata
	}
	
	public void dodaj(Artikal artikal) {
		
		boolean ubacen = false;
		for(int i=0; i<=artikli.length; i++) {
			if (artikli[i] == null) {
				artikli[i] = artikal;
				ubacen = true;
				break;
			}
		}
		
		if (!ubacen) {
			System.out.println("Artikal nije ubacen, katalog je pun!");
		}
				
	}
	
	
	public void izbaci(int sifra) {
		boolean izbacen = false;
		for(int i=0; i<artikli.length; i++) {
			if (artikli[i] !=null && artikli[i].getSifra() == sifra) {
				artikli[i] = null;
				izbacen = true;
				break;
			}			
		}
		
		if (!izbacen) {
			System.out.println("Nije pronadjen artikal sa zadatom sifrom!");
		}
		
	}
	
	public Artikal pronadjiArtikal(int sifra) {
		for(int i=0; i<artikli.length; i++) {
			if (artikli[i] !=null && artikli[i].getSifra() == sifra) {
				return artikli[i];
			}
		}
		
		System.out.println("Nije pronadjen artikal sa zadatom sifrom!");
		
		return null;	
	}
	
	public Artikal pronadjiArtikal(String kljucnaRec) {

		for(int i=0; i<artikli.length; i++) {
			if (artikli[i] !=null && 
					(artikli[i].getNaziv().toLowerCase().contains(kljucnaRec.toLowerCase()) ||
					 artikli[i].getOpis().toLowerCase().contains(kljucnaRec.toLowerCase()))) {
				return artikli[i];
			}
		}
		
		return null;
		
	}
	
	public void prikazi() {
		for(Artikal artikal : artikli) {
			System.out.println(artikal);
		}
	}

	public String toString() {
		//return Arrays.toString(artikli);
		StringBuilder sb = new StringBuilder();
		for(Artikal artikal : artikli) {
			if (artikal != null) {
				sb.append(artikal).append(System.lineSeparator());
			}
		}
		return sb.toString();
				
	}
	

}
