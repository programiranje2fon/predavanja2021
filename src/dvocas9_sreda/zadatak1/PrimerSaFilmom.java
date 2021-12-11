package dvocas9_sreda.zadatak1;

import dvocas9_utorak.zadatak1.Film;

public class PrimerSaFilmom {

	public static void main(String[] args) {
		Film film = new Film();
		
		try {
			film.setNaslov(null);
			film.setReziser("");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		
		System.out.println(film);

	}

}
