package dvocas7_utorak.zadatak1;

public class Student {
	
	private String ime;// setIme   getIme
	private String prezime;// setPrezime  getPrezime
	private String brojIndeksa;
	private int ocena;
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		if (ime == null || ime.isEmpty())
			System.out.println("Greska, ime ne sme biti null niti prazno");
		else
			this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		if (prezime == null || prezime.isEmpty())
			System.out.println("Greska, prezime ne sme biti null niti prazno");
		else
			this.prezime = prezime;
	}
	
	public String getBrojIndeksa() {
		return brojIndeksa;
	}
	
	public void setBrojIndeksa(String brojIndeksa) {
		if (brojIndeksa == null || brojIndeksa.length()!=9)
			System.out.println("Broj indeksa mora imati 9 znakova");
		else
			this.brojIndeksa = brojIndeksa;
	}
	
	public int getOcena() {
		return ocena;
	}
	
	public void setOcena(int ocena) {
		if (ocena < 5 || ocena > 10)
			System.out.println("Ocena mora biti u rasponu od 5 do 10");
		else
			this.ocena = ocena;
	}

	@Override
	public String toString() {
		return "Student [ime=" + ime + ", prezime=" + prezime + ", brojIndeksa=" + brojIndeksa + ", ocena=" + ocena
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brojIndeksa == null) ? 0 : brojIndeksa.hashCode());
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
		Student other = (Student) obj;
		if (brojIndeksa == null) {
			if (other.brojIndeksa != null)
				return false;
		} else if (!brojIndeksa.equals(other.brojIndeksa))
			return false;
		return true;
	}

	
	
	

}
