package dvocas5_sreda.zadatak1;

import java.util.GregorianCalendar;

public class PrimerZaDatum {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/7/docs/api/java/util/GregorianCalendar.html
		GregorianCalendar trenutniDatum = new GregorianCalendar();
		
		System.out.println(trenutniDatum);
		System.out.println(trenutniDatum.getTime());
		
		GregorianCalendar nekiDatum = new GregorianCalendar(2021, 9, 3, 8, 30, 31);
		System.out.println(nekiDatum.getTime());
		
		int sat = nekiDatum.get(GregorianCalendar.HOUR_OF_DAY); // uzmi sate
		System.out.println("sat: "+sat);
		nekiDatum.set(GregorianCalendar.HOUR_OF_DAY, sat+1); // postavi sate za jedan veci
		System.out.println(nekiDatum.getTime());
		
		
		if (trenutniDatum.after(nekiDatum)) {
			System.out.println("Trenutni datum je posle nekog datuma");
		}
		
		if (trenutniDatum.before(nekiDatum)) {
			System.out.println("Trenutni datum je pre nekog datuma");
		} else {
			System.out.println("Trenutni datum nije pre nekog datuma");
		}

	}

}
