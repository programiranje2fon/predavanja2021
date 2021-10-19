package dvocas3_utorak.zadatak1;

public class Menjacnica {
	//double 0.0    int   0   char  boolean false  String null 
	
	double prodajniKurs;
	double kupovniKurs;
	double srednjiKurs;
	Valuta valuta;
	
	Menjacnica(Valuta valuta, double prodajniKurs, double kupovniKurs){
		postaviProdajniKurs(prodajniKurs);
		postaviKupovniKurs(kupovniKurs);
		postaviValutu(valuta);
		izracunajSrednjiKurs();
	}
	
	void postaviProdajniKurs (double pk) {
		if (pk > 0)
			prodajniKurs = pk;
		else
			System.out.println("Prodajni kurs mora biti veci od nule");
	}
	
	void postaviKupovniKurs (double kupovniKurs) {
		if (kupovniKurs > 0)
			this.kupovniKurs = kupovniKurs;
		else
			System.out.println("Kupovni kurs mora biti veci od nule");
	}
	
	void postaviValutu (Valuta v) {
		if (v != null)
			valuta = v;
		else
			System.out.println("Valuta ne sme biti null");
	}
	
	// 5.0 / 2.0 = 2.5   5 / 2 = 2   25 / 30 * 100 = 0
	void izracunajSrednjiKurs() {//+ - * / %  i=i*3 i*=3  += -= /= %=   ++  --
		if (prodajniKurs > 0 && kupovniKurs > 0)
			srednjiKurs = (prodajniKurs + kupovniKurs) / 2;
		else
			System.out.println("Oba kursa moraju biti veca od nule");
	}
	
	double zameniZaDinare(double iznos) {
		return iznos * kupovniKurs;
	}
	
	double zameniZaStranuValutu(double iznos) {
		return iznos * prodajniKurs;
	}
	
	void ispisi() {
		System.out.println("Valuta: "+valuta);
		System.out.println("Kupovni kurs: "+kupovniKurs);
		System.out.println("Prodajni kurs: "+prodajniKurs);
		System.out.println("Srednji kurs: "+srednjiKurs);
	}

}
