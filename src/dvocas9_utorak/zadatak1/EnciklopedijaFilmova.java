package dvocas9_utorak.zadatak1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnciklopedijaFilmova {
	
	private List<Film>  filmovi = new ArrayList<Film>();//LinkedList
	
	public void dodajFilm(Film noviFilm) {
		if (filmovi.contains(noviFilm))
			throw new RuntimeException("Isti film vec postoji u listi");
		
		filmovi.add(noviFilm);		
	}
	
	public void obrisiFilm(Film film) {
		filmovi.remove(film);
	}
	
	public void ispisi() {
		//System.out.println( filmovi );
		
		//for each
		//for(Film f: filmovi)
			//System.out.println( f );
		
		//for
		//for(int i=0; i<filmovi.size(); i++)
		//	System.out.println( filmovi.get(i)  );
		
		//iterator
		Iterator<Film> it = filmovi.iterator();
		
		while (it.hasNext()) {
			Film f = it.next();
			System.out.println( f );
		}
	}
	
	public void pronadjiFilm(String deoNaslova) {
		//for each
		//for(Film f: filmovi)
		//	if (f.getNaslov().contains(deoNaslova))
		//		System.out.println( f );
		
		//for
		//for(int i = 0; i<filmovi.size(); i++)
		//	if (filmovi.get(i).getNaslov().contains(deoNaslova))
		//		System.out.println(filmovi.get(i));
		
		//Iterator
		Iterator<Film> it = filmovi.iterator();
		
		while (it.hasNext()) {
			Film f = it.next();
			if (f.getNaslov().contains(deoNaslova))
						System.out.println( f );
		}
		
	}
	
	

}
