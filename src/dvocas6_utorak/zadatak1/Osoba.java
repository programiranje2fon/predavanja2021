package dvocas6_utorak.zadatak1;

public class Osoba {
	
	public Osoba(String ime, String prezime, String adresa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
	}

	public Osoba() {
		super();
	}
	
	

	private String ime = "nepoznato";
	private String prezime = "nepoznato";
	private String adresa = "nepoznato";
	
	public void postaviIme(String ime) {
		if (ime == null || ime.length()==0)
			System.out.println("Greska");
		else
			this.ime = ime;
	}
	
	public void postaviPrezime(String prezime) {
		if (prezime == null || prezime.length()==0)
			System.out.println("Greska");
		else
			this.prezime = prezime;
	}
	
	public void postaviAdresu(String adresa) {
		if (adresa == null || adresa.length()<5)
			System.out.println("GRESKA");
		else
			this.adresa = adresa;
	}
	
	/*public void ispisi() {
		System.out.println("Ime: "+ime+ " Prezime: "+prezime+" Adresa: " + adresa);
	}*/
	
	//Rucno napisana metoda toString
	/*
	  public String toString() {
		return "Ime: "+ime+ " Prezime: "+prezime+" Adresa: " + adresa;
	}*/
	
	public String vratiIme() {
		return ime;
	}
	
	public String vratiPrezime() {
		return prezime;
	}
	
	public String vratiAdresu() {
		return adresa;
	}
	
	//Rucno napisana equals metoda
	/*public boolean equals (Object o) {// s1.equals(s2)  osoba1.equals(osoba2)
		if (!(o instanceof Osoba))
			return false;
		
		Osoba o2 = (Osoba)o;
		
		if (this.ime.equals(o2.ime) && this.prezime.equals(o2.prezime))
			return true;
		else
			return false;		
	}*/

	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Ime=" + ime + ", prezime=" + prezime + ", adresa=" + adresa;
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
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}
	
	

}
