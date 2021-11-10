package dvocas5_utorak.zadatak1;

public class TestOsoba {

	public static void main(String[] args) {
		Osoba os = new Osoba();
		
		os.postaviIme("Pera");
		os.postaviPrezime("Peric");
		os.postaviAdresu("Jove Ilica;154;Beograd");
		
		os.ispisi();
		os.istaAdresa("Vojislava Ilica", "154", "Beograd");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Jove Ilica");
		sb.append(";154;");
		sb.append("Beograd");
		sb.reverse();
		String s = sb.toString();
		
		System.out.println(s);
		
	}

}
