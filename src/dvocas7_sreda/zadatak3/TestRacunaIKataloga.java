package dvocas7_sreda.zadatak3;

import dvocas7_sreda.zadatak1.Artikal;
import dvocas7_sreda.zadatak2.KatalogArtikala;

public class TestRacunaIKataloga {

	public static void main(String[] args) {

		Artikal artikal1 = new Artikal();
		artikal1.setSifra(123);
		artikal1.setNaziv("Kokice");
		artikal1.setOpis("Slane kokice sa zacinima.");
		artikal1.setJedinicnaCena(100);
		artikal1.setKolicina(2);

		Artikal artikal2 = new Artikal();		
		artikal2.setSifra(124);
		artikal2.setNaziv("Koka kola zero");
		artikal2.setOpis("Bez secera.");
		artikal2.setJedinicnaCena(80);
		artikal2.setKolicina(1);		
		
		Artikal artikal3 = new Artikal();		
		artikal3.setSifra(125);
		artikal3.setNaziv("Sladoled");
		artikal3.setOpis("Sa vanilom i cokoladom");
		artikal3.setJedinicnaCena(300);
		artikal3.setKolicina(3);			

		KatalogArtikala katalog = new KatalogArtikala(3);
		katalog.dodaj(artikal1);
		katalog.dodaj(artikal2);
		katalog.dodaj(artikal3);		
		
		
		Artikal artikalZaRacun = katalog.pronadjiArtikal(125);
		Racun4 racun = new Racun4(1);
		racun.dodajArtikal(artikalZaRacun);
		System.out.println(racun);
		

	}

}
