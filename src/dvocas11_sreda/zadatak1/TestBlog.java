package dvocas11_sreda.zadatak1;

import dvocas11_sreda.zadatak1.Blog;
import dvocas11_sreda.zadatak1.BlogPost;

public class TestBlog {

	public static void main(String[] args) {
		BlogPost bp = new BlogPost();
		
		bp.setNaslov("Prvi post");
		bp.setSadrzaj("Danas je lep dan.\nNapolju je sneg.");
		
		System.out.println( bp );
		
		BlogPost bp2 = new BlogPost("src/dvocas11_utorak/zadatak1/post.txt");
		
		System.out.println(bp2);
		
		Blog blog = new Blog();
		
		blog.dodajPost(bp);
		blog.dodajPost(bp2);

		blog.sacuvajBlogTXT("ceo_blog.txt");
		
		blog.serijalizujBlog("src/dvocas11_utorak/zadatak1/blog.dat");
		blog.deserijazujBlog("src/dvocas11_utorak/zadatak1/blog.dat");
		
		System.out.println("PRIKAZ BLOGA");
		blog.prikazi();
		
		
	}

}
