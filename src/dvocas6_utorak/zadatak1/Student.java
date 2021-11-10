package dvocas6_utorak.zadatak1;

public class Student extends Osoba {
	
	private String fakultet;
	private double prosek;
	
	public void postaviFakultet(String fakultet) {
		if (fakultet == null || fakultet.isEmpty())
			System.out.println("GREska");
		else
			this.fakultet = fakultet;
	}
	
	public String vratiFakultet() {
		return fakultet;
	}

	public void postaviProsek(double prosek) {
		if (prosek < 6 || prosek > 10)
			System.out.println("GREska");
		else
			this.prosek = prosek;
	}
	
	public double vratiProsek() {
		return prosek;
	}

	@Override
	public String toString() {
		return super.toString() + " fakultet=" + fakultet + ", prosek=" + prosek;
	}

	/*public void ispisi() {
		super.ispisi();
		System.out.println("Fakultet: "+fakultet+" Prosek: "+prosek);
	}*/
	
	//Rucno napisan toString
	/*public String toString() {
		return super.toString() + " Fakultet: "+fakultet+" Prosek: "+prosek;
	}*/

	
}
