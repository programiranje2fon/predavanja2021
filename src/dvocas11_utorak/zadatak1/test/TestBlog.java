package dvocas11_utorak.zadatak1.test;

import dvocas11_utorak.zadatak1.Blog;
import dvocas11_utorak.zadatak1.BlogPost;

public class TestBlog {

	public static void main(String[] args) {
		/*BlogPost bp = new BlogPost();
		
		bp.setNaslov("Prvi post");
		bp.setSadrzaj("Danas je lep dan.\nNapolju je sneg.");
		
		System.out.println( bp );
		
		BlogPost bp2 = new BlogPost("src/dvocas11_utorak/zadatak1/post.txt");
		
		System.out.println(bp2);*/
		
		Blog b = new Blog();
		
		//b.dodajPost(bp);
		//b.dodajPost(bp2);
		
		//b.serijalizujBlog();
		
		b.deserijazujBlog();
		b.sacuvajBlogTXT("src/dvocas11_utorak/zadatak1/ceo_blog.txt");
		
	}

}
