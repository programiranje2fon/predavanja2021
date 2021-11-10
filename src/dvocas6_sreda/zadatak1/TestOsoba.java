package dvocas6_sreda.zadatak1;

public class TestOsoba {

	public static void main(String[] args) {
//		Osoba nekaOsoba = new Osoba("Jovan", "Jovanovic", "Jove Ilica 128");
	//	nekaOsoba = new Osoba();
		
		// System.out.println(nekaOsoba.ime);
		//nekaOsoba.postaviIme("Milan");
		//nekaOsoba.postaviPrezime("Petrovic");
		//nekaOsoba.postaviAdresu("Ugrinovacka 45");
		
		//System.out.println(nekaOsoba.vratiIme());
		//nekaOsoba.prikazi();
	
		// ----------------------------------------------------------
		
		
		Student nekiStudent = new Student();
		nekiStudent.postaviIme("Sara");
		nekiStudent.postaviPrezime("Petrovic");
		nekiStudent.postaviAdresu("Mike Alasa 45");		
		nekiStudent.postaviFakultet("FON");
		nekiStudent.postaviProsek(9.99);
		
		//nekiStudent.prikazi();
		// System.out.println(nekiStudent);
		
		Osoba nekaOsobaKojaJeStudent = nekiStudent;
		Osoba nekaTrecaOsoba = new Osoba("Jelena", "Savic", "Jove Ilica 135");

		System.out.println(nekaOsobaKojaJeStudent);
		
		if (nekaOsobaKojaJeStudent.equals(nekaTrecaOsoba)) {
			System.out.println("Osobe su iste!");
		} else {
			System.out.println("Osobe nisu uste!");
		}			
		

		
		// ---------------------------------------------------------------
		
		Osoba nekaOsoba = new Osoba("Sava", "Perovic", "Jove Ilica 135");
		Osoba nekaDrugaOsoba = new Osoba("Sava", "Perovic", "Jove Ilica 135");
		//System.out.println(nekaOsoba.toString());
	//	System.out.println(nekaOsoba);
		/*
		if (nekaOsoba.equals(nekaDrugaOsoba)) {
			System.out.println("Osobe su iste!");
		} else {
			System.out.println("Osobe nisu uste!");
		}		
		*/
		
	}

}
