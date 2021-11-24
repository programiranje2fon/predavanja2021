package dvocas8_sreda.zadatak1;

public class Automobil extends MotornoVozilo {

	@Override
	public double izracunajCenuRegistracije() {
		double cenaRegistracije = 6000 + getKubikaza() * 8 + getSnaga() *2;
		return cenaRegistracije;
	}

}
