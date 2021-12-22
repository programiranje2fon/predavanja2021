package dvocas11_sreda.zadatak1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class RadSaSerijalizacijom {

	public static void main(String[] args) {
		BlogPost post = new BlogPost();
		post.setDatum(new GregorianCalendar());
		post.setNaslov("Novi kurs iz Jave");
		post.setSadrzaj("Ovaj blog post sadrzi najnoviji kurs iz Jave.");
		
		upisiSerijalizacijom(post, "blog_posts.bin" );
		
		BlogPost ucitaniPost = ucitajIzFajlaDeserijalizacijom("blog_posts.bin");
		System.out.println("UCITANI POST:");
		System.out.println(ucitaniPost);
	}
	
	
	static void upisiSerijalizacijom(BlogPost post, String imeFajla) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(imeFajla));
			out.writeObject(post);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}	

	static BlogPost ucitajIzFajlaDeserijalizacijom(String imeFajla) {
		
		// try with resurces
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(imeFajla));) {
			
			BlogPost post = (BlogPost)in.readObject();
			return post;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}



}
