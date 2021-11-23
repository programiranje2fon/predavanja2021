package dvocas8_utorak.zadatak2;

public class MesovitiAutomat implements AutomatZaKafu, AutomatZaCokoladice {
	
	private int kolicinaKafe = 100;
	private int brojCokoladica = 35;
	private int kolicinaNovca = 0;
	
	public void napraviKafu(int novac) {
		if (novac >= 50 && kolicinaKafe > 0) {
			kolicinaKafe--;
			kolicinaNovca = kolicinaNovca + novac;
			System.out.println("Kafa je napravljena");
		}
		else
			System.out.println("Greska, morate uneti bar 50 dinara i mozda nema kafe");
	}
	
	public void izbaciCokoladicu(int novac) {
		if (novac >= 60 && brojCokoladica > 0) {
			brojCokoladica--;
			kolicinaNovca = kolicinaNovca + novac;
			System.out.println("Cokoladica je izbacena");
		}
		else
			System.out.println("Greska, morate uneti bar 60 dinara i mozda nema cokoladica");
		
	}

}
