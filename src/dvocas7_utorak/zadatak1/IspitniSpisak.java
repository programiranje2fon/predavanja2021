package dvocas7_utorak.zadatak1;

public class IspitniSpisak {
	
	private String nazivPredmeta;
	
	private Student[] studenti;

	public IspitniSpisak(String nazivPredmeta, int brojStudenata) {
		this.setNazivPredmeta(nazivPredmeta);
		
		if (brojStudenata > 0)
			studenti = new Student[brojStudenata];//inicij. niza/init objekta new Student()
		else {
			studenti = new Student[100];
			System.out.println("Greska, inicijalizovan na 100");
		}
	}
	
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		if (nazivPredmeta == null || nazivPredmeta.isEmpty())
			System.out.println("Greska");
		else
			this.nazivPredmeta = nazivPredmeta;
	}
	
	public void ispisi() {
		System.out.println("Naziv predmeta: "+nazivPredmeta);
		
		for(int i=0; i<studenti.length; i++)
			if (studenti[i]!=null)
				System.out.println( studenti[i] );
		
		//for(Student s: studenti)
		//	System.out.println( s );
	}
	
	public boolean daLiPostoji(Student student) {
		for(int i=0;i<studenti.length;i++)
			if (studenti[i]!= null && studenti[i].equals(student))
				return true;
			
		
		return false;
	}
	
	public void unesiStudenta(Student student) {
		if (daLiPostoji(student)==true) {
			System.out.println("Taj student je vec unet");
			return;
		}
		
		for(int i=0;i<studenti.length;i++)
			if (studenti[i]==null) {
				studenti[i] = student;
				return;
			}
		
		System.out.println("Nema mesta, niz je pun");
	}
	
	public double izracunajProsek() {
		double suma = 0;
		int brojStudenata = 0;
		
		for(int i=0; i<studenti.length;i++)
			if (studenti[i]!=null && studenti[i].getOcena()>5) {
				suma = suma + studenti[i].getOcena();
				brojStudenata++;
			}
		
		return suma/brojStudenata;		
	}
	
	public double izracunajProlaznost() {
		int brojPolozili = 0;
		int brojStudenata = 0;
		
		for(int i=0;i<studenti.length;i++)
			if (studenti[i]!=null) {
				brojStudenata++;
				if (studenti[i].getOcena()>5)
					brojPolozili++;
			}
		
		return (100.0*brojPolozili)/brojStudenata;
	}

	public int pronadjiNajvisuOcenu() {
		int max = 5;
		
		for (int i=0;i<studenti.length;i++)
			if (studenti[i]!=null && studenti[i].getOcena()>max)
				max = studenti[i].getOcena();
		
		return max;
	}
	
}
