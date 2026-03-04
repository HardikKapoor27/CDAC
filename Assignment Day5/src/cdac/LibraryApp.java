package cdac;

public class LibraryApp {
	
	public static void main(String[] args) {

		BookManagement bm = new BookManagement();

		bm.numberOfBooks();
		Book[] b = bm.getBooks();
		bm.allBookMethods(b);
	}

}
