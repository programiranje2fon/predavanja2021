package dvocas11_sreda.zadatak1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class RadSaTekstualnimFajlovima {

	public static void main(String[] args) {

		String nekiTekst = "Juce je padao sneg. Puno stabala je bilo slomljeno.";
		
		upisiUTekstualniFajl(nekiTekst);
		
		
		String ucitaniTekst = ucitajTekstIzFajla("nas_tekstualni _fajl.txt");
		System.out.println("Ucitani tekst: "+ ucitaniTekst);

	}

	private static String ucitajTekstIzFajla(String imeFajla) {
		StringBuilder tekst = new StringBuilder();

		try {
			BufferedReader br = new BufferedReader(new FileReader(imeFajla));
			String red = null;
						
			do {
				red = br.readLine();
				if (red != null) 
					tekst.append(red).append("\r\n");
			} while(red != null);
			
		} catch (FileNotFoundException e) {
			System.out.println("Nepostojeci fajl:" + imeFajla);
		} catch (IOException e) {
			System.out.println("Greska prilikom citanja fajla!");
		}
		
		return tekst.toString();
	}

	static void upisiUTekstualniFajl(String nekiTekst) {
	
		try {
			PrintWriter pw = new PrintWriter(new File("nas_tekstualni _fajl.txt"));
			pw.println(nekiTekst);
			pw.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

}
