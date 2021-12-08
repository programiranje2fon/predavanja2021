package dvocas10_utorak.zadatak1;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Imenik {
	
	private List<Osoba> osobe = new ArrayList<Osoba>();
	
	public void ucitajOsobu() {
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
			System.out.print("Unesite ime i prezime: ");
			String imePrezime = br.readLine();
			
			System.out.print("Unesite adresu: ");
			String adresa = br.readLine();
			
			System.out.print("Unesite telefonski broj: ");
			int telefon = Integer.parseInt(br.readLine());// "12"  12 Double.parseDouble Integer.parseInt Boolean.parseBoolean
			
			Osoba o = new Osoba();
			o.setImePrezime(imePrezime);
			o.setAdresa(adresa);
			o.setTelefon(telefon);
			
			if (osobe.contains(o))
				throw new RuntimeException("Osoba vec postoji u listi");
			
			osobe.add(o);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void pronadjiOsobu() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Unesite deo imena ili prezimena: ");
			String deo = br.readLine();
			
			for(Osoba o: osobe)
				if (o.getImePrezime().contains(deo))
					System.out.println(o);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ispisi() {
		for(Osoba o: osobe)
			System.out.println(o);
	}
	
}
