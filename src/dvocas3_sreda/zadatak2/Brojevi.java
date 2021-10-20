package dvocas3_sreda.zadatak2;

public class Brojevi {

	static void ispisiBrojeve(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}
	
	static int suma(int n) {
		int suma = 0;
		int i=1;
		
		while(i<=n) {
			suma = suma + i;
			i++;
		}
		return suma;
	}
	
	static int faktorijel(int n) {		
		int proizvod = 1;
		int i=1;
		
		do {
			proizvod = proizvod * i;
			i++;
		} while(i<=n);
		
		return proizvod;
	}
	
	
	
}
