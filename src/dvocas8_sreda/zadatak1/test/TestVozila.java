package dvocas8_sreda.zadatak1.test;

import dvocas8_sreda.zadatak1.Automobil;
import dvocas8_sreda.zadatak1.Motocikl;
import dvocas8_sreda.zadatak1.MotornoVozilo;

public class TestVozila {

	public static void main(String[] args) {

		// ne mogu se kreirati objekti apstraktne klase
		//	MotornoVozilo vozilo1 = new MotornoVozilo();

		
		MotornoVozilo automobil = new Automobil();
		automobil.setMarkaModel("Ford Focus");
		automobil.setSnaga(70);
		automobil.setKubikaza(1799);
		automobil.setRegistarskaOznaka("BG123JK");
		System.out.println(automobil);
		System.out.println("Cena registracije:"+automobil.izracunajCenuRegistracije());
		
		MotornoVozilo motocikl = new Motocikl();
		motocikl.setMarkaModel("Suzuki GS 750");
		motocikl.setSnaga(100);
		motocikl.setKubikaza(749);
		motocikl.setRegistarskaOznaka("NS987tt");
		System.out.println(motocikl);		
		System.out.println("Cena registracije:"+motocikl.izracunajCenuRegistracije());
		
				
		MotornoVozilo[] nizVozila = new MotornoVozilo[3];
		nizVozila[0] = automobil;
		nizVozila[1] = motocikl;
		
		double ukupanIznos = izracunajUkupnuRegistraciju(nizVozila);
		System.out.println("Ukupan iznos registracije: "+ukupanIznos);

	}
	
	public static double izracunajUkupnuRegistraciju(MotornoVozilo[] vozila) {
		double ukupanIznos = 0;
		for(MotornoVozilo vozilo : vozila) {
			if (vozilo!=null) {
				ukupanIznos = ukupanIznos + vozilo.izracunajCenuRegistracije();
			}
		}
		return ukupanIznos;
	}
	
	

}
