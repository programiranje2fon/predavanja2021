package dvocas4_utorak.zadatak1;

public class TestIspitneOcene {

	public static void main(String[] args) {
		IspitneOcene ioc = new IspitneOcene("Programiranje 2", 8);
		//10, 10, 8, 9, 5, 6
		ioc.unesiOcenu(5);
		ioc.unesiOcenu(6);
		ioc.unesiOcenu(9);
		ioc.unesiOcenu(8);
		ioc.unesiOcenu(10);
		ioc.unesiOcenu(10);		
		//for each
		ioc.ispisi();
		
		double prosek = ioc.izracunajProsek();
		System.out.println("Prosek je: " + prosek);
		
		ioc.pronadjiNajvisuOcenu();
		ioc.izracunajProlaznost();
		
	}

}
