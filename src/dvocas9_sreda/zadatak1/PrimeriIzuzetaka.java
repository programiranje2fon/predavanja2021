package dvocas9_sreda.zadatak1;

public class PrimeriIzuzetaka {

	public static void main(String[] args) {
		String s=null;
		
		
		try {		
			s.toUpperCase();			
			System.out.println(s);
			System.out.println(s.charAt(2));
			
			
			int[] niz = {1, 2, 3, 4, 5, 6};
			System.out.println(niz[0]);
			
		} catch(RuntimeException ex) {
			System.out.println("Doslo je do greske: "+ex.getMessage());
		}
		
		System.out.println("Program i dalje radi");

	}

}
