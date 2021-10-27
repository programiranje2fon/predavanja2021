package dvocas4_sreda.zadatak1;

public class PrimeriNizova {

	public static void main(String[] args) {
		
		// kreiranje niza
		int[] nizCelihBrojeva = new int[10];
		int[] nekiNiz2 = {1, 2, 3, 4, 5, 6, 7, 8};
		
		
		// inicijalizacija niza
		for(int i=0; i < nizCelihBrojeva.length; i++) {  // iteracija niza - prolazak kroz sve elemente niza
			nizCelihBrojeva[i] = i+1; // dodeljivanje vrednosti elementu niza
		}
		
		ispisiNiz(nizCelihBrojeva);
		System.out.println("Drugi niz:");
		ispisiNiz(nekiNiz2);
		
		
		System.out.println("Niz decimalnih:");
		double[] nizDecimalnih = new double[5];
		
		for(int i=0; i < nizDecimalnih.length; i++) {  // iteracija niza - prolazak kroz sve elemente niza
			nizDecimalnih[i] = (i+1) / 100.0; // dodeljivanje vrednosti elementu niza
		}		
		
		ispisiNiz(nizDecimalnih);
		
		
		// ubacivanje u niz
		boolean[] sedista = new boolean[15];
		
		for(int i=0; i<sedista.length; i++) {
			sedista[i] = true; // slobodna mesta imaju vrednost true
		}
		
		// studenti zauzimaju metsa
		sedista[0]= false;
		sedista[4]= false;
		sedista[7]= false;
		sedista[9]= false;
		
		// ubaciti studenta na prvo slobodno mesto
		for(int i=0; i<sedista.length; i++) {
			if (sedista[i]==true) {
				sedista[i] = false;
				break;
			}
		}
		
		System.out.println("Sedista:");
		ispisiNiz(sedista);
		
		
		// izbacivanje 10. elementa iz niza (shiftovanje niza u levo)
		for(int i=0; i<nizCelihBrojeva.length-1; i++) {
			nizCelihBrojeva[i] = nizCelihBrojeva[i+1];
		}
		
		nizCelihBrojeva[9] = -1;		
		ispisiNiz(nizCelihBrojeva);
		
		
		// pretraga niza da li sadrzi zadatu vrednost
		int zadatiBroj =17;
		boolean nadjen = false;
		for(int i=0; i<nizCelihBrojeva.length; i++) { // prodji kroz sve elemente niza
			if (nizCelihBrojeva[i] == zadatiBroj) { // da li je tekuci element niza jedna zadatom broju?
				nadjen= true;	// ako jeste postavi zastavicu nadjen na true
				System.out.println("Zadati broj je nadjen");
				break;	// ako si ga nasao prekini prolazak kroz niz
			}
		}
		
		// ako nije nadjen ispisi poruku
		if (!nadjen) {
			System.out.println("Zadati broj nije nadjen");
		}
		
		// niz stringove
		String[] nizImena =  {"Pera", "Mika", "Jana", "Ana", "Laza"}; // new String[5];
		
		System.out.println("Imena u nizu:");
		for(int i=0; i<nizImena.length; i++) {
			System.out.println(nizImena[i]);
		}
		

	}
	
	static void ispisiNiz(int[] niz) {
		for(int i=0; i<niz.length; i++) { // iteracija niza - prolazak kroz sve elemente niza
			System.out.println("element niza na poziciji  "+i+" : "+niz[i]); // citanje elemenata niza
		}
		
	}
	
	static void ispisiNiz(double[] niz) {
		for(int i=0; i<niz.length; i++) { // iteracija niza - prolazak kroz sve elemente niza
			System.out.println("element niza na poziciji  "+i+" : "+niz[i]); // citanje elemenata niza
		}		
	}
	
	static void ispisiNiz(boolean[] niz) {
		for(int i=0; i<niz.length; i++) { // iteracija niza - prolazak kroz sve elemente niza
			System.out.println("element niza na poziciji  "+i+" : "+niz[i]); // citanje elemenata niza
		}		
	}		

}
