package dvocas4_utorak.zadatak1;

public class IspitneOcene2 {
	
	String nazivPredmeta;
	
	int[] ocene;
	int brojac = 0;

	IspitneOcene2(String nazivPredmeta, int brojStudenata){
		this.nazivPredmeta = nazivPredmeta;
		
		if (brojStudenata > 0)
			ocene = new int[ brojStudenata ];
		else {
			ocene = new int[100];
			System.out.println("Greska, niz je inicijalizovan na 100 ocena");
		}	
	}
	
	IspitneOcene2(String nazivPredmeta){
		this.nazivPredmeta = nazivPredmeta;
		
		ocene = new int[100];
	}
	
	void ispisi() {
		System.out.println("Naziv predmeta: " + nazivPredmeta);
		
		//ovde se sada ide od 0 do brojaca, a ne do length,
		//pa for-each petlja nema smisla, samo for petlja
		for (int i=0; i<brojac; i++)
			System.out.println( ocene[i] );
	}
	
	void unesiOcenu(int ocena) {
		if (ocena <5 || ocena > 10) {
			System.out.println("Ocena mora biti u rasponu od 5 do 10");
			return;
		}
		
		//Petlja uopste vise nije potrebna ako se uvede brojac
		/*for (int i=0; i<ocene.length; i++)
			if (ocene[i] == 0) {
				ocene[i] = ocena;
				return;
			}*/
		
		if (brojac >= ocene.length) {
			System.out.println("Greska, niz je pun");
			return;
		}
		
		//prvo naredno slobodno ima indeks koji je jednak vrednosti
		//brojaca. Ako je brojac 0 (nema unetih ocena), slobodno mesto
		//je ocene[brojac] tj. ocene[0] i td.
		ocene[brojac] = ocena;
		brojac++;
	}
	
	double izracunajProsek() {
		double suma = 0;
		int brojStudenata = 0;
		
		//ovde se sada ide od 0 do brojaca, a ne do length,
		//pa for-each petlja nema smisla, samo for petlja
		for (int i = 0; i<ocene.length; i++)
			if (ocene[i] > 5) {
				suma = suma + ocene[i];
				brojStudenata++;
			}		
		return suma / brojStudenata;
	}
	
	void pronadjiNajvisuOcenu() {
		int max = ocene[0];

		//ovde se sada ide od 1 do brojaca, a ne do length,
		//pa for-each petlja nema smisla, samo for petlja		
		for(int i=1; i<brojac;i++)
			if (ocene[i] > max)
				max = ocene[i];
				
		
		System.out.println("Najveca ocena je: " + max);
	}
	
	void izracunajProlaznost() {
		int brojPolozili = 0;
		//Nema potrebe prebrojavati studente koji su polagali,
		//dovoljno je koristiti brojac
		//int ukupnoPolagali = 0;
		
		for (int i=0; i<brojac; i++) 
			if (ocene[i] > 5) brojPolozili++;			

		
		double prolaznost = brojPolozili *100.0 / brojac;
		
		System.out.println("Prolaznost na ispitu je :" + prolaznost+ " %");
			
	}
}
