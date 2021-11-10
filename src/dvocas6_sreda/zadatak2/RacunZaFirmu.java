package dvocas6_sreda.zadatak2;

import dvocas5_sreda.zadatak2.Racun3;

public class RacunZaFirmu extends Racun3 {
	
	private String nazivFirme;

	public RacunZaFirmu(int brojArtikala, String nekiNazivFirme) {
		super(brojArtikala);
		nazivFirme = nekiNazivFirme;
	}

	@Override
	public String toString() {
	StringBuilder sb = new StringBuilder();
		
		sb.append("Broj racuna: "+brojRacuna).append(System.lineSeparator());
		sb.append("Datum:").append(datumRacuna.getTime()).append(System.lineSeparator());
		sb.append("Naziv firme: ").append(nazivFirme).append(System.lineSeparator());
		
		sb.append("ARTIKLI").append(System.lineSeparator());
		for(int i=0; i<nazivArtikla.length; i++) {
			sb.append((i+1)+": "+nazivArtikla[i] + " | Jed. Cena: "+jedinicnaCena[i] + " | Kol: "+kolicina[i] ).append(System.lineSeparator());
		}
			
		sb.append("Nacin placanja: "+nacinPlacanja).append(System.lineSeparator());	
		
		double iznos = izracunajUkupanIznos();
		sb.append("Ukupan iznos: "+iznos).append(System.lineSeparator());
		
		double kusur = izracunajKusur(5000);
		sb.append("Uplaceno 1000 din, kusur je "+kusur);		
		
		//double prosecnaCena = racun.izracunajProsecnuCenuArtikla();
		sb.append("Prosecna cena artikla: "+ izracunajProsecnuCenuArtikla() ).append(System.lineSeparator());
		sb.append("Ukupan porez: "+izracunajUkupanPorez()).append(System.lineSeparator());
		
		if (daLiJeBesplatnaIsporuka()) {		
			sb.append("Besplatna isporuka").append(System.lineSeparator());
		} else {
			sb.append("Nije besplatna isporuka").append(System.lineSeparator());
		}
		
		if (nagradnaIgra()) {
			sb.append("Cestitamo dobili ste nagradu!").append(System.lineSeparator());
		}		
		
		sb.append("------------------------------------------------------------").append(System.lineSeparator());
		
		return sb.toString();
	}	
	
	
	
	
	
}
