package dvocas3_utorak.zadatak2;

public class Ispisivac {
	//for 	while 	do-while 	for-each
	static void ispisiZdravo() {
		for (int i=1; i<=5; i++) {
			System.out.println("Zdravo");
		}
	}
	
	static void ispisiPoruku(String poruka) {
		for (int i=1; i<=10; i++)
			System.out.println(poruka);
	}
	
	static void ispisiPoruku(String poruka, int brojPuta) {
		for (int i=1; i<=brojPuta; i++)
			System.out.println(poruka);
	}
	
	static void ispisiBrojeveOd1Do20() {
		System.out.println("START");
		
		for(int i=1; i<=20; i++) {
			if (i==18) continue;
			System.out.println(i);
		}
		
		System.out.println("STOP");
	}
	
	static void vremeDupliranja(double iznos, double kamata) {
		double dupliranIznos = iznos * 2;
		
		while (iznos < dupliranIznos) {
			iznos = iznos * (100+kamata)/100;
			System.out.println(iznos);
		}
	}

}
