package headFirst;

import java.util.Set;
import java.util.TreeSet;

public class TreeTest {
	public static void main(String[] args) {
		
		new TreeTest().go();
	}
	
	public void go() {
		
		Book b1 = new Book("How cats works");
		Book b2 = new Book("Remix the song");
		Book b3 = new Book("Finding Emo");
		
		
		Set<Book> tree = new TreeSet<>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		
		for(Book book: tree){
			System.out.println(book.title);
			
		}
		
		
		}
	
	class Book implements Comparable {
		
	    String title;
		public Book(String t) {
			title = t;
		}
		
		public int compareTo(Object b) {
			Book book = (Book) b;
			return (title.compareTo(book.title));
		}
	}

}
