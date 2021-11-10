package dvocas6_sreda.zadatak1;

public class Student extends Osoba {
	private String fakultet;
	private double prosek;
	
	
	public void postaviFakultet(String novifakultet) {
		if (novifakultet !=null && !novifakultet.isEmpty()) {
			fakultet= novifakultet;
		} else {
			System.out.println("Greska: fakultet ne sme biti null ili prazan string!");
		}
	}
	
	public String vratiFakultet() {
		return fakultet;
	}
	
	public void postaviProsek(double noviProsek) {
		if (noviProsek >= 6 && noviProsek <=10) {
			prosek = noviProsek;
		} else {
			System.out.println("Prosek mora biti izmedju 6 i 10!");
		}
	}
	
	public void prikazi() {
		System.out.println("Ime: "+vratiIme());
		System.out.println("Prezime: "+vratiPrezime());
		System.out.println("Adresa: "+vratiAdresu());
		System.out.println("Fakultet: "+fakultet);
		System.out.println("Prosek: "+prosek);
	}

	@Override
	public String toString() {
		return "Student [fakultet=" + fakultet + ", prosek=" + prosek + ", ime="+vratiIme()+", prezime="+vratiPrezime()+", adresa="+vratiAdresu()+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fakultet == null) ? 0 : fakultet.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prosek);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		if (fakultet == null) {
			if (other.fakultet != null)
				return false;
		} else if (!fakultet.equals(other.fakultet))
			return false;
		if (Double.doubleToLongBits(prosek) != Double.doubleToLongBits(other.prosek))
			return false;
		return true;
	}	
	
	
	
	
	
}
