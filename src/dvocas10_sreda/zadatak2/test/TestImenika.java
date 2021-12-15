package dvocas10_sreda.zadatak2.test;

import java.util.Scanner;

import dvocas10_sreda.zadatak2.Imenik;

public class TestImenika {

	public static void main(String[] args) {
		Imenik imenik = new Imenik();
				
		Scanner scanner = new Scanner(System.in);
		int opcija = 0;
		
		do {
			System.out.println("Izaberite opciju unosom broja");
			System.out.println("1 - Unos osobe u imenik");
			System.out.println("2 - Pretraga imenika");
			System.out.println("3 - Ispis celog imenika");
			System.out.println("4 - Izlaz iz programa");
			
			opcija = scanner.nextInt();	
			
			if (opcija == 1) {
				imenik.ucitajOsobu();
			} else if (opcija == 2) {
				imenik.pronadjiOsobu();
			} else if (opcija == 3) {	
				imenik.ispisi();
			}
						
		} while(opcija != 4);
		
		System.out.println("Dovidjenja!");
	}

}
