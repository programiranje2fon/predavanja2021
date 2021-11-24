package dvocas8_sreda.zadatak2;

public class TestAutomat {

	public static void main(String[] args) {
		// MesovitiAutomat automat1 = new MesovitiAutomat();
		// AutomatZaKafu automat1 = new AutomatZaKafu();
		AutomatZaCokoladice automat1 = new MesovitiAutomat();
		
		//automat1.napraviKafu(100);
		automat1.izbaciCokoladicu(80);
		
		AutomatZaCokoladice automat2 = new BesplatniMesovitiAutomat();
		automat2.izbaciCokoladicu(70);

	}

}
