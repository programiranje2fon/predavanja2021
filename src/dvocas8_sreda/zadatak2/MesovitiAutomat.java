package dvocas8_sreda.zadatak2;

public class MesovitiAutomat implements AutomatZaKafu, AutomatZaCokoladice {

	private int kolicinaKafe = 100;
	private int brojCokoladica = 35;
	private double kolicinaNovca=0;
	
	
	@Override
	public void napraviKafu(int iznosNovca) {
		
		if (kolicinaKafe==0) {
			System.out.println("Nema kafe");
			return;
		}
		
		if (iznosNovca >= 50) {
			kolicinaNovca = kolicinaNovca + iznosNovca;					
			kolicinaKafe--;
			System.out.println("Kafa je napravljena, izvolite.");
		} else {
			System.out.println("Nedovoljno novca");
		}
		
	}	
	
	@Override
	public void izbaciCokoladicu(double iznosNovca) {
		if (brojCokoladica == 0) {
			System.out.println("Nema vise cokoladica");
		}
		
		if (iznosNovca >=60) {
			kolicinaNovca = kolicinaNovca + iznosNovca;
			brojCokoladica--;
			System.out.println("Izvolite cokladicu");
		} else {
			System.out.println("Nedovoljno novca");
		}
		
	}




}
