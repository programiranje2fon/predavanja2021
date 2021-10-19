package dvocas3_utorak.zadatak1;

public class TestMenjacnica {

	public static void main(String[] args) {
		Menjacnica m = new Menjacnica(Valuta.EUR, 118.5, 117.0);
		/*
		m.postaviKupovniKurs(117.0);
		m.postaviProdajniKurs(118.5);
		m.izracunajSrednjiKurs();
		m.postaviValutu("EUR");
		*/
		
		m.ispisi();
				
		double iznos = 100;
		double dinari = m.zameniZaDinare(iznos);
		
		System.out.println("Za "+iznos+" EUR dobija se "+dinari+" dinara");
	}

}
