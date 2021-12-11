package dvocas9_sreda.zadatak2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrimerListe {

	public static void main(String[] args) {
	//	ArrayList<String> lista1 = new ArrayList<>();
		List<String> lista1 = new LinkedList<>();
		
		lista1.add("Pera");
//		lista1.add(1);
		//lista1.add(true);
//		lista1.add(3.23);
		//lista1.add('e');
		lista1.add("Mile");
		lista1.add("Mira");
		lista1.add("Sanja");
		
		//lista1.remove("Sanja");
		//lista1.remove(2);
				
		
		// iteracija / prolazak kroz sve elemente liste
		for(String ime : lista1) {
			System.out.println(ime);
		}
		
		for(int i=0; i<lista1.size(); i++) {
			System.out.println(lista1.get(i));
		}
		
		Iterator<String> iterator = lista1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		// koji je index zadate vrednosti
		System.out.println("Mile je na poziciji: "+lista1.indexOf("Mile"));
		
		// da li lista sadrzi vrednost
		if (lista1.contains("Mira")) {
			System.out.println("Lista sadrzi ime Mira");
		}
		
		// pristup elementu na zadatoj poziciji
		System.out.println(lista1.get(3));
		
		// ispis cele liste kao stringa
		System.out.println(lista1);
		

	}

}
