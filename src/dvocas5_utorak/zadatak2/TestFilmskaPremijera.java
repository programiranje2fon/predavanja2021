package dvocas5_utorak.zadatak2;

import java.util.GregorianCalendar;

public class TestFilmskaPremijera {

	public static void main(String[] args) {
		FilmskaPremijera fp = new FilmskaPremijera();
		
		fp.postaviNaziv("Addams family 2");
		
		GregorianCalendar datumAmerika = new GregorianCalendar();
		datumAmerika.set(2021, 10, 15);
		
		GregorianCalendar datumSvet = new GregorianCalendar();
		datumSvet.set(2021, 10, 16);

		fp.postaviPremijere(datumAmerika, datumSvet);
		
		fp.ispisi();
		
		fp.pomeriPremijere();
		
		fp.ispisi();
	}

}
