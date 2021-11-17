package dvocas7_sreda.zadatak2;

import dvocas7_sreda.zadatak1.Artikal;

public class ProbaArtikala {

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
/*		
		System.out.println(artikal1);
		System.out.println(artikal2);
		System.out.println(artikal3);
*/
		KatalogArtikala katalog = new KatalogArtikala(3);
		katalog.dodaj(artikal1);
		katalog.dodaj(artikal2);
		katalog.dodaj(artikal3);

		//katalog.prikazi();
		System.out.println(katalog);
		
		System.out.println("Rezultat pretrage");
		System.out.println("------------------------");
		Artikal rezultat1 = katalog.pronadjiArtikal(124);
		Artikal rezultat2 = katalog.pronadjiArtikal("kokice");
		System.out.println(rezultat1);
		System.out.println(rezultat2);
		
	}

}
