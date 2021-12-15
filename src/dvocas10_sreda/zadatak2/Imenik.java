package dvocas10_sreda.zadatak2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dvocas10_sreda.zadatak1.Osoba;

public class Imenik {
	
	private List<Osoba> osobe = new ArrayList<>();
	
	public void ucitajOsobu() {

		Scanner scanner = new Scanner(System.in);
		Osoba osoba = new Osoba();

		System.out.print("Unesite ime i prezime osobe:");
		String unos = scanner.nextLine();
		osoba.setImePrezime(unos);

		System.out.print("Unesite adresu:");
		unos = scanner.nextLine();
		osoba.setAdresa(unos);

		System.out.print("Unesite telefon:");
		int telefon = scanner.nextInt();
		osoba.setTelefon(telefon);

		if (!osobe.contains(osoba)) {
			osobe.add(osoba);
		} else {
			throw new RuntimeException("Osoba vec postoji u imeniku!");
		}

	}
	
	public void pronadjiOsobu() {
		Scanner scanner = new Scanner(System.in);

		String kljucnaRec = scanner.next();

		for (Osoba osoba : osobe) {
			if (osoba.getImePrezime().toLowerCase().contains(kljucnaRec.toLowerCase())) {
				System.out.println(osoba);
			}
		}		
	}
	
	public void ispisi() {
		for(Osoba osb : osobe) {
			System.out.println(osb);
		}		
	}
	
	
	
	
	

}
