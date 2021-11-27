package dvocas9_utorak.zadatak1.test;

import dvocas9_utorak.zadatak1.EnciklopedijaFilmova;
import dvocas9_utorak.zadatak1.Film;

public class TestFilm {

	public static void main(String[] args) {
		Film f = new Film();
		
		try {
			f.setNaslov("Blade Runner 2049");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		f.setReziser("Denis Villeneuve");
		f.setGodina(2017);
		
		Film f2 = new Film();
		
		try {
			f2.setNaslov("Blade Runner");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		f2.setReziser("Ridley Scott");
		f2.setGodina(1982);
		
		EnciklopedijaFilmova ef = new EnciklopedijaFilmova();
		
		ef.dodajFilm(f);
		ef.dodajFilm(f2);
		
		ef.ispisi();
		
		ef.pronadjiFilm("Blade");
	}

}
