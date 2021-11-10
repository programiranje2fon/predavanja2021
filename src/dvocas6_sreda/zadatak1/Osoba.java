package dvocas6_sreda.zadatak1;

public class Osoba extends Object {

	protected String ime, prezime, adresa;
	
	
	public Osoba() {
		
	}
	
	public Osoba(String imeOsobe, String prezimeOsobe, String adresaOsobe) {
		ime = imeOsobe;
		prezime = prezimeOsobe;
		adresa = adresaOsobe;
	}
	
	public void postaviIme(String novoIme) {
		if (novoIme != null && !novoIme.isEmpty()) {
			ime = novoIme;
		} else {
			System.out.println("Greska ime ne sme biti null ili prazan string!");
		}
	}
	
	public void postaviPrezime(String novoPrezime) {
		if (novoPrezime != null && !novoPrezime.isEmpty()) {
			prezime = novoPrezime;
		} else {
			System.out.println("Greska prezime ne sme biti null ili prazan string!");
		}
	}
		
	public void postaviAdresu(String novaAdresa) {
		if (novaAdresa != null && novaAdresa.length()>5 ) {
			adresa = novaAdresa;
		} else {
			System.out.println("Greska adresa ne sme biti null ili prazan string!");
		}
	}
	
	
	public String vratiIme() {
		return ime;
	}
	
	public String vratiPrezime() {
		return prezime;
	}	
	
	public String vratiAdresu() {
		return adresa;
	}
	
	public void prikazi() {
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+prezime);
		System.out.println("Adresa: "+adresa);
	}

	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", adresa=" + adresa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresa == null) ? 0 : adresa.hashCode());
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Osoba drugaOsoba = (Osoba)obj;
		
		if (ime.equals(drugaOsoba.ime) && (prezime.equals(drugaOsoba.prezime) && (adresa.equals(drugaOsoba.adresa)))) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
}
