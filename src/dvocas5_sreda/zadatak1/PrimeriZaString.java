package dvocas5_sreda.zadatak1;

public class PrimeriZaString {

	public static void main(String[] args) {
		char znak ='A';
		
		System.out.println(znak);
		
		char[] nizZnakova = {'n', 'i', 'z', ' ', 'z', 'n', 'a', 'k', 'o', 'v', 'a'};
		for(int i=0; i<nizZnakova.length; i++) {
			System.out.print(nizZnakova[i]+", ");
		}
		
		System.out.println();
		
		String nekiString = "Danas je lep i suncan dan";
		String nekiString2 = new String("Danas je suncan dan ali duva vetar");
		System.out.println(nekiString);
		
		
		String nekiStringVelikimSlovima = nekiString2.toUpperCase();
		System.out.println(nekiString2);
		System.out.println(nekiStringVelikimSlovima);
		
		nekiString = nekiString + " " + nekiString2;
		System.out.println(nekiString);
		
		
		System.out.println("Duzina stringa: "+nekiString.length()); // duzina stringa / broj znakova
		
		String prazanString = "";
		System.out.println("Da li je prazan: "+prazanString.isEmpty()); // da li je string prazan
		
		System.out.println("Cetvrto slovo u stringu: "+nekiString.charAt(4)); // karakter na zadatoj poziciji
		
		String[] nizReci = nekiString.split(" "); // deljenje stringa na delove
		for(int i=0; i<nizReci.length; i++) {
			System.out.println(nizReci[i]);
		}
		
		System.out.println("pocetak stringa: "+nekiString.substring(0, 5)); // deo stringa
		
		// odsceanje viska belih mesta
		String saBelimMestima = "   pocinje i zavrsava se sa 3 bela mesta   ";
		System.out.println(saBelimMestima.trim().length());
		
		System.out.println("Pocinje sa dan: " + nekiString.startsWith("Dan"));
		System.out.println("Zavrsaca se sa vetar: " + nekiString.endsWith("vetar"));
		
		// dokumentacija klase string
		//https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		
		/*
		 // zauzimanje cele memorije pomocu konkatenacije stringova
		while(true) {
			nekiString = nekiString + nekiString;
			System.out.println("Slobodna memorija: "+Runtime.getRuntime().freeMemory());
		}
		*/
		
		// https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
		StringBuilder sb = new StringBuilder();
		sb.append(" string 1 ");
		sb.append(" string 2 ");
		sb.append(" string 3 ");
		System.out.println(sb.toString());
		
		
		
		
	}

}
