package dvocas8_utorak.zadatak1.test;

import dvocas8_utorak.zadatak1.*;

public class TestVozila {

	public static void izracunajUkupnuRegistraciju(MotornoVozilo[] vozila) {
		double suma = 0;
		
		for(MotornoVozilo mv: vozila)
			if (mv != null)
				suma = suma + mv.izracunajRegistraciju();
		
		System.out.println("Suma je: "+suma);
	}
	
		
	public static void main(String[] args) {
		//MotornoVozilo mv; //= new MotornoVozilo(); ne moze se inicijalizovati
		
		Automobil a = new Automobil();
		a.setMarkaModel("Ford Focus");
		a.setSnaga(70);
		a.setKubikaza(1799);
		a.setRegistarskaOznaka("BG123JK");
		
		System.out.println( a );
		System.out.println( a.izracunajRegistraciju() );
		
		Motocikl m = new Motocikl();
		m.setMarkaModel("Suzuki GS 750");
		m.setSnaga(100);
		m.setKubikaza(749);
		m.setRegistarskaOznaka("NS987TT");
		
		System.out.println( m );
		System.out.println( m.izracunajRegistraciju() );
		
		MotornoVozilo[] nizVozila = new MotornoVozilo[2];
		nizVozila[0] = a;
		nizVozila[1] = m;
		
		izracunajUkupnuRegistraciju(nizVozila);
		
		
	}

}
