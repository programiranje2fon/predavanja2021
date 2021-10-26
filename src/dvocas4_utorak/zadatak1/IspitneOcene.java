package dvocas4_utorak.zadatak1;

public class IspitneOcene {
	
	String nazivPredmeta;
	
	int[] ocene;

	IspitneOcene(String nazivPredmeta, int brojStudenata){
		this.nazivPredmeta = nazivPredmeta;
		
		if (brojStudenata > 0)
			ocene = new int[ brojStudenata ];
		else {
			ocene = new int[100];
			System.out.println("Greska, niz je inicijalizovan na 100 ocena");
		}	
	}
	
	IspitneOcene(String nazivPredmeta){
		this.nazivPredmeta = nazivPredmeta;
		
		ocene = new int[100];
	}
	
	void ispisi() {
		System.out.println("Naziv predmeta: " + nazivPredmeta);
		
		//for (int i=0; i<ocene.length; i++)
		//	System.out.println( ocene[i] );
		
		for(int ocena : ocene)
			System.out.println( ocena );
	}
	
	void unesiOcenu(int ocena) {
		if (ocena <5 || ocena > 10) {
			System.out.println("Ocena mora biti u rasponu od 5 do 10");
			return;
		}
		
		for (int i=0; i<ocene.length; i++)
			if (ocene[i] == 0) {
				ocene[i] = ocena;
				return;
			}
		
		System.out.println("Greska, niz je pun");
	}
	
	double izracunajProsek() {
		double suma = 0;
		int brojStudenata = 0;
		/*
		for (int i = 0; i<ocene.length; i++)
			if (ocene[i] > 5) {
				suma = suma + ocene[i];
				brojStudenata++;
			}*/
		
		for(int ocena : ocene)
			if (ocena > 5) {
				suma = suma + ocena;
				brojStudenata++;
			}
		
		return suma / brojStudenata;
	}
	
	void pronadjiNajvisuOcenu() {
		int max = ocene[0];
		
		for(int i=1; i<ocene.length;i++)
			if (ocene[i] > max)
				max = ocene[i];
				
		
		System.out.println("Najveca ocena je: " + max);
	}
	
	void izracunajProlaznost() {
		int brojPolozili = 0;
		int ukupnoPolagali = 0;
		
		for (int i=0; i<ocene.length; i++) {
			if (ocene[i] > 0) ukupnoPolagali++;
			if (ocene[i] > 5) brojPolozili++;			
		}
		
		double prolaznost = brojPolozili *100.0 / ukupnoPolagali;
		
		System.out.println("Prolaznost na ispitu je :" + prolaznost+ " %");
			
	}
}
