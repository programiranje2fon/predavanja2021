package dvocas11_utorak.zadatak1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
	
	public void serijalizujBlog() {
		try (
				ObjectOutputStream out =
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("src/dvocas11_utorak/zadatak1/blog.dat"))); ){
			
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
	

}
