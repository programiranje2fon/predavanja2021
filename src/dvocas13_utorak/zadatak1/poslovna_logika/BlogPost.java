package dvocas13_utorak.zadatak1.poslovna_logika;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class BlogPost implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4867438187882667143L;

	private String naslov;
	
	private String sadrzaj;
	
	private GregorianCalendar datum;
	
	public BlogPost() {
		datum = new GregorianCalendar();
	}
	
	public BlogPost(String putanja) {
		try (
				BufferedReader br = new BufferedReader(new FileReader(putanja));
				) {
			
			//Scanner sc = Scanner(new File(putanja));
			
			naslov = br.readLine();
			sadrzaj = "";
			
			while(true) {
				String red = br.readLine();
				if (red == null)
					break;
				else
					sadrzaj = sadrzaj + red + "\n";
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		datum = new GregorianCalendar();
	}
	

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		if (naslov == null || naslov.isEmpty())
			throw new NullPointerException("Naslov ne sme biti null");
		
		this.naslov = naslov;
	}

	public String getSadrzaj() {
		return sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		if (sadrzaj == null || sadrzaj.isEmpty())
			throw new NullPointerException("Sadrzaj ne sme biti null");

		this.sadrzaj = sadrzaj;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if (datum == null)
			throw new NullPointerException("Datum ne sme biti null");

		this.datum = datum;
	}

	@Override
	public String toString() {
		return datum.getTime()+ "\n" + "\n" +naslov + "\n" + "\n" + sadrzaj+ "\n";
	}
	
	
	
	

}
