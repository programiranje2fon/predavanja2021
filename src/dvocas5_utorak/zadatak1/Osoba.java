package dvocas5_utorak.zadatak1;

public class Osoba {
	
	String ime = "nepoznato";// 'A'  "rec", "A"
	String prezime = "nepoznato";
	String adresa;
	
	void postaviIme(String ime) {// ""   
		if (ime == null || ime.trim().isEmpty())
			System.out.println("Greska, ime ne sme biti null niti prazno.");
		else
			this.ime = ime.trim();
	}
	
	void postaviPrezime(String prezime) {// " Pera "  trim  - "Pera"
		if (prezime == null || prezime.trim().isEmpty())
			System.out.println("Greska, prezime ne sme biti null niti prazno.");
		else
			this.prezime = prezime.trim();
	}
	
	int prebrojZnakove (String s, char c) {
		int brojac = 0;
		
		for(int i=0; i<s.length(); i++)
			if (s.charAt(i) == c)
				brojac++;
		
		return brojac;
	}
	
	void postaviAdresu(String adresa) {//indexOf  lastIndexOf
		if (adresa == null || adresa.length() < 5 ||
				adresa.indexOf(';') == adresa.lastIndexOf(';'))
			System.out.println("Greska, adresa nije kako treba");
		else
			this.adresa = adresa;
	}
	
	void istaAdresa(String ulica, String broj, String grad) {
		// "Jove Ilica;154;Beograd"  "Jove Ilica;154;BEOGRAD"
		String adresa2 = ulica + ';'+broj+';'+grad;
		
		//equals ili equalsIgnoreCase
		if (adresa.equalsIgnoreCase(adresa2))
			System.out.println("Ista adresa");
		else
			if (adresa.endsWith(grad))
				System.out.println("Isti grad");
			else
				System.out.println("Nije ista adresa");
		
	}
	
	void ispisi() {
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+prezime);
		//System.out.println("Adresa: "+adresa);
		String ulica = adresa.substring(0, adresa.indexOf(';'));
		String broj = adresa.substring(adresa.indexOf(';')+1, adresa.lastIndexOf(';'));
		String grad = adresa.substring(adresa.lastIndexOf(';')+1);
		
		System.out.println("Ulica: "+ulica);
		System.out.println("Broj: "+broj);
		System.out.println("Grad: "+grad);
	}
	

}
