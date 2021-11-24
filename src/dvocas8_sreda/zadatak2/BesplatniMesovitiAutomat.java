package dvocas8_sreda.zadatak2;

public class BesplatniMesovitiAutomat implements AutomatZaCokoladice, AutomatZaKafu {

	@Override
	public void napraviKafu(int iznosNovca) {
		System.out.println("Kafa je napravljena i besplatna");		
	}

	@Override
	public void izbaciCokoladicu(double iznosNovca) {
		System.out.println("Cokoladica je besplatna i izbacena");
	}

}
