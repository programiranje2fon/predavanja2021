package dvocas10_sreda.zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UcitavanjeSaTastature {

	public static void main(String[] args) {
		System.out.println("Neki string"); // standardni izlazni stream - monitor
		// System.in // tastatura
		// System.err // standardni strim za greske
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Unesite neki tekst: ");
			String nekiTekst = br.readLine();
			System.out.println("Ucitani tekst: "+nekiTekst);
			
			System.out.print("Unesite ceo broj: ");
			String ceoBrojStr = br.readLine();
			int ceoBroj = Integer.parseInt(ceoBrojStr);
			System.out.println("Kvadrat unetog broja: "+ (ceoBroj*ceoBroj));
			
			System.out.print("Unesite decimalni broj: ");
			String decBrojStr = br.readLine();
			double decBroj = Double.parseDouble(decBrojStr);
			System.out.println("Kvadrat unetog broja: "+ (decBroj*decBroj));			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException nex) {
			System.out.println("Uneta vrednost nije broj");
		}
		
		
	}

}
