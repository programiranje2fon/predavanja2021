package dvocas13_utorak.zadatak1.poslovna_logika;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class Blog {
	
	private List<BlogPost> postovi = new ArrayList<BlogPost>();
	
	public void dodajPost(BlogPost blogpost) {
		postovi.add(blogpost);
	}
	
	public void sacuvajBlogTXT(String putanja) {
		try(
			PrintWriter out = new PrintWriter(new FileWriter(putanja));	){
			
			for(BlogPost bp: postovi)
				out.println( bp );
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void serijalizujBlog(String putanja) {
		try (
				ObjectOutputStream out =
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(putanja))); ){
			
			//varijanta 1 (2 objekta u fajlu klase BlogPost)
			for(BlogPost bp: postovi)
				out.writeObject(bp);
			
			//varijanta 2 (3 objekta u fajlu: ArrayList postovi i 2 BlogPost-a)
			//out.writeObject(postovi);
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void deserijazujBlog() {
		try(
			ObjectInputStream in =
			new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream("src/dvocas11_utorak/zadatak1/blog.dat")));
				){
			//Varijanta 1
			postovi.clear();
			
				while (true) {
					BlogPost bp = (BlogPost)in.readObject();
					postovi.add(bp);
				}
			
			
			//Varijanta 2
			//postovi = (List<BlogPost>)in.readObject();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public List<BlogPost> getPostovi() {
		return postovi;
	}
	
	public void sacuvajBlogJSON(String putanja) throws JsonIOException, IOException {
		Gson gson = new Gson();
		
		FileWriter fajl = new FileWriter(putanja);
		
		gson.toJson(postovi, fajl);
		
		fajl.close();
	}
	

}
