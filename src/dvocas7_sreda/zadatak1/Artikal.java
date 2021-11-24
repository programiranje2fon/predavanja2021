package dvocas7_sreda.zadatak1;

public class Artikal {
	private int sifra = -1;
	private String naziv ="nepoznat";
	private String opis = "";
	private double jedinicnaCena = -1;
	private int kolicina = -1;
	
	public Artikal() {
		
	}

	public Artikal(String naziv, double jedCena, int kol) {
		this.naziv = naziv;
		this.jedinicnaCena = jedCena;
		this.kolicina = kol;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public double getJedinicnaCena() {
		return jedinicnaCena;
	}

	public void setJedinicnaCena(double jedinicnaCena) {
		this.jedinicnaCena = jedinicnaCena;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	@Override
	public String toString() {
		return "Artikal [sifra=" + sifra + ", naziv=" + naziv + ", opis=" + opis + ", jedinicnaCena=" + jedinicnaCena
				+ ", kolicina=" + kolicina + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(jedinicnaCena);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + kolicina;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result + sifra;
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
		Artikal other = (Artikal) obj;
		if (Double.doubleToLongBits(jedinicnaCena) != Double.doubleToLongBits(other.jedinicnaCena))
			return false;
		if (kolicina != other.kolicina)
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (opis == null) {
			if (other.opis != null)
				return false;
		} else if (!opis.equals(other.opis))
			return false;
		if (sifra != other.sifra)
			return false;
		return true;
	}

	public double izracunajIznos() {
		return jedinicnaCena * kolicina;
	}
	
	
	
	
	
	

}
