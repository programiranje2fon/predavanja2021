package dvocas12_utorak.zadatak1.poslovna_logika;

public class Osoba {
	
	private String imePrezime;
	
	private String adresa;
	
	private int telefon;
	
	public String getImePrezime() {
		return imePrezime;
	}
	
	public void setImePrezime(String imePrezime) {
		if (imePrezime == null || imePrezime.isEmpty())
			throw new RuntimeException("Morate uneti ime i prezime");
		
		this.imePrezime = imePrezime;
	}
	
	public String getAdresa() {
		return adresa;
	}
	
	public void setAdresa(String adresa) {
		if (adresa == null || adresa.isEmpty())
			throw new RuntimeException("Morate uneti adresu");

		this.adresa = adresa;
	}
	
	public int getTelefon() {
		return telefon;
	}
	
	public void setTelefon(int telefon) {
		if (telefon <= 0)
			throw new RuntimeException("Telefon mora biti veci od nule");
		
		this.telefon = telefon;
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
		} else if (!imePrezime.equals(other.imePrezime))
			return false;
		return true;
	}
	
	

}
