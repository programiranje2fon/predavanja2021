package dvocas10_sreda.zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Imenik {
	
	private List<Osoba> osobe = new ArrayList<>();
	
	public void ucitajOsobu() {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Osoba osoba = new Osoba();

		try {
			System.out.print("Unesite ime i prezime osobe:");
			String unos = br.readLine();
			osoba.setImePrezime(unos);
			
			System.out.print("Unesite adresu:");
			unos = br.readLine();
			osoba.setAdresa(unos);
			
			System.out.print("Unesite telefon:");
			unos = br.readLine();			
			int telefon = Integer.parseInt(unos);
			osoba.setTelefon(telefon);
			
			if (!osobe.contains(osoba)) {
				osobe.add(osoba);
			} else {
				throw new RuntimeException("Osoba vec postoji u imeniku!");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void pronadjiOsobu() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String kljucnaRec = br.readLine();
			
			for(Osoba osoba : osobe) {
				if (osoba.getImePrezime().toLowerCase().contains(kljucnaRec.toLowerCase())) {
					System.out.println(osoba);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void ispisi() {
		for(Osoba osb : osobe) {
			System.out.println(osb);
		}		
	}
	
	
	
	
	

}
