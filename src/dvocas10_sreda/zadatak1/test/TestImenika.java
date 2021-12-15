package dvocas10_sreda.zadatak1.test;

import dvocas10_sreda.zadatak1.Imenik;

public class TestImenika {

	public static void main(String[] args) {
		Imenik imenik = new Imenik();
		
		imenik.ucitajOsobu();
		imenik.ucitajOsobu();
		
		imenik.ispisi();
		
		System.out.println("Pronadji osobu:");
		imenik.pronadjiOsobu();
		

	}

}
