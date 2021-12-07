package dvocas10_utorak.zadatak2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dvocas10_utorak.zadatak1.Osoba;

import java.io.*;

public class Imenik {

	private List<Osoba> osobe = new ArrayList<Osoba>();

	public void ucitajOsobu() {
		boolean unet = false;

		while (unet == false) {
			try {
				Scanner sc = new Scanner(System.in);
				Osoba o = new Osoba();
				
				//// Pera Peric Jove Ilica 154 05323231
				//System.out.print("Unesite sve podatke o osobi u jednom redu: ");
				//String imePrezime = sc.next()+ ' ' + sc.next();
				//String adresa = sc.next()+' '+sc.next()+' '+sc.next();
				//int telefon = sc.nextInt();
				
				System.out.print("Unesite ime i prezime: ");
				String imePrezime = sc.nextLine();
				o.setImePrezime(imePrezime);
				
				System.out.print("Unesite adresu: ");
				String adresa = sc.nextLine();
				o.setAdresa(adresa);
				
				System.out.print("Unesite telefonski broj: ");
				int telefon = sc.nextInt();// nextDouble
				o.setTelefon(telefon);

				unet = true;

				if (osobe.contains(o))
					throw new RuntimeException("Osoba vec postoji u listi");

				osobe.add(o);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void pronadjiOsobu() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite deo imena ili prezimena: ");
		String deo = sc.nextLine();

		for (Osoba o : osobe)
			if (o.getImePrezime().contains(deo))
				System.out.println(o);
	}

	public void ispisi() {
		for (Osoba o : osobe)
			System.out.println(o);
	}

}
