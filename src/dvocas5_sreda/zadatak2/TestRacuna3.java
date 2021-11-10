package dvocas5_sreda.zadatak2;

import dvocas3_sreda.zadatak1.NacinPlacanja;

public class TestRacuna3 {

	public static void main(String[] args) {
		
		String[] nazivi = new String[] {"Knjiga", "Sveska", "Olovka", "Baterije", "Punjac"};
		double[] cene = new double[] {100, 200, 300, 400, 500};
		int[] kolicine = new int[] {1, 2 ,3, 2, 1};

		Racun3 racun = Racun3.kreirajRacun(nazivi, cene, kolicine);
		System.out.println(Racun3.stringOdRacuna(racun));
		
		kolicine = new int[] {2, 6 ,7, 3, 9};		
		
		Racun3 noviRacun = new Racun3(3);
		
		noviRacun.dodajArtikal("Knjiga", 1000, 3);
		noviRacun.dodajArtikal("Sveska", 200, 2);
		noviRacun.dodajArtikal("Olovka", 300, 3);
	
/*		
		noviRacun.setNazivArtikla(nazivi);
		noviRacun.setJedinicnaCena(cene);
		noviRacun.setKolicina(kolicine);
		*/
		
		//Racun3.prikaziRacun(noviRacun);
		System.out.println(Racun3.stringOdRacuna(noviRacun));
		
		//System.out.println(Racun3.htmlRacun(racun));
		
				
	}

}
