package dvocas4_sreda.zadatak2;

import dvocas3_sreda.zadatak1.NacinPlacanja;

public class TestRacuna2 {

	public static void main(String[] args) {
		
		String[] nazivi = new String[] {"Knjiga", "Sveska", "Olovka", "Baterije", "Punjac"};
		double[] cene = new double[] {100, 200, 300, 400, 500};
		int[] kolicine = new int[] {1, 2 ,3, 2, 1};

		Racun2 racun = Racun2.kreirajRacun(nazivi, cene, kolicine);
		Racun2.prikaziRacun(racun);
		
		//
		

		kolicine = new int[] {2, 6 ,7, 3, 9};		
		
		Racun2 noviRacun = new Racun2(5);
			
		/*
		noviRacun.nazivArtikla = nazivi;
		noviRacun.jedinicnaCena = cene;
		noviRacun.kolicina = kolicine;	
		*/
		
		noviRacun.setNazivArtikla(nazivi);
		noviRacun.setJedinicnaCena(cene);
		noviRacun.setKolicina(kolicine);
		
		Racun2.prikaziRacun(noviRacun);		
		
				
	}

}
