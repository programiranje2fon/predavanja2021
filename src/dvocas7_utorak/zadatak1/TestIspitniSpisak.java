package dvocas7_utorak.zadatak1;

public class TestIspitniSpisak {

	public static void main(String[] args) {
		IspitniSpisak is = new IspitniSpisak("Programiranje 2", 8);
		
		Student s1 = new Student();
		s1.setIme("Pera");
		s1.setPrezime("Peric");
		s1.setBrojIndeksa("0084/2020");
		s1.setOcena(8);
		
		is.unesiStudenta(s1);
		
		Student s2 = new Student();
		s2.setIme("Mika");
		s2.setPrezime("Mikic");
		s2.setBrojIndeksa("1019/2020");
		s2.setOcena(10);
		
		is.unesiStudenta(s2);

		Student s3 = new Student();
		s3.setIme("Zika");
		s3.setPrezime("Zikic");
		s3.setBrojIndeksa("0332/2020");
		s3.setOcena(6);
		
		is.unesiStudenta(s3);

		is.ispisi();
		
		System.out.println("Najvisa ocena je: "+ is.pronadjiNajvisuOcenu() );
		System.out.println("Prosek je: "+is.izracunajProsek());
		System.out.println("Prolaznost je: "+is.izracunajProlaznost()+" %");
	}

}
