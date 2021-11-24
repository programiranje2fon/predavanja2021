package dvocas8_sreda.zadatak1;

public class Motocikl extends MotornoVozilo {

	@Override
	public double izracunajCenuRegistracije() {
		double cenaRegistracije = 4000 + getKubikaza() * 4 + getSnaga() *2;
		return cenaRegistracije;
	}


}
