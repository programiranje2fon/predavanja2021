package dvocas12.sreda.zadatak1.poslovna_logika;

public class Osoba {
	private String imePrezime;
	private String adresa;
	private int telefon;
	
	
	public String getImePrezime() {
		return imePrezime;
	}
	
	public void setImePrezime(String imePrezime) {
		if (imePrezime != null && !imePrezime.isEmpty()) {
			this.imePrezime = imePrezime;
		} else {
			throw new IllegalArgumentException("Ime i  prezime ne sme biti null ili prazan string");
		}
		
	}
	
	public String getAdresa() {
		return adresa;
	}
	
	public void setAdresa(String adresa) {
		if (adresa != null && !adresa.isEmpty()) {
			this.adresa = adresa;
		} else {
			throw new IllegalArgumentException("Adresane sme biti null ili prazan string");
		}
	}
	
	public int getTelefon() {
		return telefon;
	}
	
	public void setTelefon(int telefon) {
		if (telefon >0) {
			this.telefon = telefon;
		} else {
			throw new IllegalArgumentException("Telefon mora biti pozitivan broj");
		}
	}

	@Override
	public String toString() {
		return "Osoba [imePrezime=" + imePrezime + ", adresa=" + adresa + ", telefon=" + telefon + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imePrezime == null) ? 0 : imePrezime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		if (imePrezime == null) {
			if (other.imePrezime != null)
				return false;
		} else if (!imePrezime.equalsIgnoreCase((other.imePrezime)))
			return false;
		return true;
	}
	
	
	
	

}
