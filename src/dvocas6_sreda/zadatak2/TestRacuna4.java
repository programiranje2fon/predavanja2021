package dvocas6_sreda.zadatak2;

import dvocas3_sreda.zadatak1.NacinPlacanja;
import dvocas5_sreda.zadatak2.Racun3;

public class TestRacuna4 {

	public static void main(String[] args) {
		
	
		Racun3 noviRacun = new RacunZaFirmu(3, "Comtrade");
		
		noviRacun.dodajArtikal("Knjiga", 1000, 3);
		noviRacun.dodajArtikal("Sveska", 200, 2);
		noviRacun.dodajArtikal("Olovka", 300, 3);
	

		System.out.println(noviRacun);
		

				
	}

}
