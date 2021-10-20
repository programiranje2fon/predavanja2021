package dvocas3_sreda.zadatak1;

public class TestRacuna {

	public static void main(String[] args) {
		Racun racun = new Racun();
		
		//racun.brojRacuna = 1;
		racun.nacinPlacanja = NacinPlacanja.KARTICA;
		
		racun.nazivArtikla1 = "Plazma keks";
		racun.jedinicnaCena1 = 100.0;
		racun.kolicina1 = 20;
		
		racun.nazivArtikla2 = "Koka kola";
		racun.jedinicnaCena2 = 90;
		racun.kolicina2 = 10;
		
		racun.nazivArtikla3 = "Sladoled";
		racun.jedinicnaCena3 = 200.0;
		racun.kolicina3 = 3;	
		

		Racun.prikaziRacun(racun);

		//------------------------------------------------------------------------------
		
		Racun racun2 = Racun.kreirajRacun("Kikiriki", 30, "Bombone", 50, "Kafa", 150);
		Racun.prikaziRacun(racun2);
		
				
	}

}
