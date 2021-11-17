package dvocas7_sreda.zadatak3;

import dvocas3_sreda.zadatak1.NacinPlacanja;

public class TestRacuna4 {

	public static void main(String[] args) {
		
		Racun4 noviRacun = new Racun4(3);
		
		noviRacun.dodajArtikal("Knjiga", 1000, 3);
		noviRacun.dodajArtikal("Sveska", 200, 2);
		noviRacun.dodajArtikal("Olovka", 300, 3);
	
		System.out.println(noviRacun);
		
				
	}

}
