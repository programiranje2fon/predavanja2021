package dvocas8_utorak.zadatak2;

public class UtopijskiMesovitiAutomat implements AutomatZaKafu, AutomatZaCokoladice{

	@Override
	public void izbaciCokoladicu(int novac) {
		System.out.println("Cokoladica je besplatna i izbacena");
	}

	@Override
	public void napraviKafu(int novac) {
		System.out.println("Kafa je besplatna, neogranicena i napravljena");
	}

}
