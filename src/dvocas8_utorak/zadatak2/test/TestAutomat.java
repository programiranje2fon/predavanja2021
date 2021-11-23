package dvocas8_utorak.zadatak2.test;

import dvocas8_utorak.zadatak2.*;

public class TestAutomat {

	public static void main(String[] args) {
		MesovitiAutomat ma = new MesovitiAutomat();
		
		ma.izbaciCokoladicu(55);
		ma.napraviKafu(50);
		
		AutomatZaKafu ak = new UtopijskiMesovitiAutomat();
		ak.napraviKafu(50);
		
		AutomatZaCokoladice ac = new UtopijskiMesovitiAutomat();
		ac.izbaciCokoladicu(60);
		
	}

}
