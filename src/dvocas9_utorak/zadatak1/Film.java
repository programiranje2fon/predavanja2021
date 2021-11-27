package dvocas9_utorak.zadatak1;

public class Film {
	
	private String naslov;
	private String reziser;
	private int godina;
	
	public String getNaslov() {
		return naslov;
	}
	
	public void setNaslov(String naslov) throws Exception {
		if (naslov == null || naslov.isEmpty())
			throw new Exception("Greska, naslov ne sme biti null ili prazan");
		
		this.naslov = naslov;
	}
	
	public String getReziser() {
		return reziser;
	}
	
	public void setReziser(String reziser) {
		if (reziser == null)
			throw new NullPointerException("Reziser ne sme biti null");
		
		if (reziser.isEmpty())
			throw new RuntimeException("Greska, morate uneti ime i prezime rezisera");
		
		this.reziser = reziser;
	}
	
	public int getGodina() {
		return godina;
	}
	
	public void setGodina(int godina) {
		if (godina < 1892)
			throw new RuntimeException("Godina mora biti 1892. ili kasnija");
		
		this.godina = godina;
	}

	@Override
	public String toString() {
		return "Film [naslov=" + naslov + ", reziser=" + reziser + ", godina=" + godina + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + godina;
		result = prime * result + ((naslov == null) ? 0 : naslov.hashCode());
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
		Film other = (Film) obj;
		if (godina != other.godina)
			return false;
		if (naslov == null) {
			if (other.naslov != null)
				return false;
		} else if (!naslov.equals(other.naslov))
			return false;
		return true;
	}

}
