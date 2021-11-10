package dvocas5_utorak.zadatak2;

import java.util.GregorianCalendar;

public class FilmskaPremijera {
	
	private String nazivFilma;
	
	GregorianCalendar datumPremijereAmerika = new GregorianCalendar();
	GregorianCalendar datumPremijereSvet = new GregorianCalendar(2022, 2, 21);
	
	void postaviPremijere(GregorianCalendar datumPremijereAmerika,
							GregorianCalendar datumPremijereSvet) {
		GregorianCalendar sada = new GregorianCalendar();
		// before after
		if (datumPremijereAmerika == null || datumPremijereSvet == null ||
			datumPremijereAmerika.before(sada) || datumPremijereSvet.before(sada))
			System.out.println("Greska, datumi nisu ok");
		else {
			this.datumPremijereAmerika = datumPremijereAmerika;
			this.datumPremijereSvet = datumPremijereSvet;
		}
			
	}
	
	void ispisi() {
		System.out.println("Naziv filma: "+ nazivFilma);
		
		int dan = datumPremijereAmerika.get( GregorianCalendar.DAY_OF_MONTH );
		int mesec = datumPremijereAmerika.get( GregorianCalendar.MONTH )+1;
		int godina = datumPremijereAmerika.get(GregorianCalendar.YEAR);
		
		System.out.println("Datum premijere Amerika: "+dan+"/"+mesec+"/"+godina);

		dan = datumPremijereSvet.get( GregorianCalendar.DAY_OF_MONTH );
		mesec = datumPremijereSvet.get( GregorianCalendar.MONTH )+1;
		godina = datumPremijereSvet.get(GregorianCalendar.YEAR);
		
		System.out.println("Datum premijere Svet: "+dan+"/"+mesec+"/"+godina);
	}
	
	void pomeriPremijere() {
		int godina = datumPremijereAmerika.get(GregorianCalendar.YEAR)+1;
		datumPremijereAmerika.set(GregorianCalendar.YEAR, godina);
		
		godina = datumPremijereSvet.get(GregorianCalendar.YEAR)+1;
		datumPremijereSvet.set(GregorianCalendar.YEAR, godina);
	}
	
	void postaviNaziv(String nazivFilma) {
		if (nazivFilma==null || nazivFilma.isEmpty())
			System.out.println("Greska");
		else
			this.nazivFilma = nazivFilma;
	}

}
