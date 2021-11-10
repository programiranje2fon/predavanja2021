package dvocas6_utorak.zadatak1;

public class TestOsoba {

	public static void main(String[] args) {
		Osoba o = new Osoba();
		
		o.postaviIme("Pera");
		o.postaviPrezime("Peric");
		o.postaviAdresu("Jove Ilica 154 Beograd");
		
		//o.ime = null;
		//o.prezime = "";
		//o.adresa = "dfs";
		
		//o.ispisi();
		System.out.println(o);
		
		Student s = new Student();
		s.postaviIme("Mika");
		s.postaviPrezime("Mikic");
		s.postaviAdresu("Vojvode Stepe 112");
		s.postaviFakultet("FON");
		s.postaviProsek(8.5);
		
		//s.ispisi();
		System.out.println(s);
		
		Osoba o2 = new Student();
		o2.postaviIme("Zika");
		o2.postaviPrezime("Zikic");
		o2.postaviAdresu("Humska 12");
		//o2.postaviProsek(8.5);
		
		System.out.println( o2 );
		
		Student s2 = (Student) o2;
		
		s2.postaviFakultet("ETF");
		s2.postaviProsek(9.02);
		
		System.out.println( s2 );
		
		Osoba o3 = new Osoba();
		
		o3.postaviIme("Pera");
		o3.postaviPrezime("Mikic");
		
		if ( o.equals(o3) )
			System.out.println("Ista osoba");
		else
			System.out.println("Nije ista osoba");
	}

}
