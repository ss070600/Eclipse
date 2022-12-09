package Assignment2;

class Book {
	private String bookName, authorName, publisher;
	private int ISBN;

	Book(String bookName, String authorName, String publisher, int iSBN) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		ISBN = iSBN;
	}

	String getBookName() {
		return bookName;
	}

	void setBookName(String bookName) {
		this.bookName = bookName;
	}

	String getAuthorName() {
		return authorName;
	}

	void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	String getPublisher() {
		return publisher;
	}

	void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	int getISBN() {
		return ISBN;
	}

	void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getBookInfo() {
		return bookName + "[ authorName=" + authorName + ", publisher=" + publisher + ", ISBN=" + ISBN + "]";
	}

}

public class BookTest {

	public static void main(String[] args) {
		String[] names = new String[] { "Science1", "Science2", "History1", "History2", "Physics", "Chemistry", "Math1",
				"Math2", "Moral Science", "English" };
		String[] author = new String[] { "abc", "def", "ghi", "jkl", "mno" };
		String[] publisher = new String[] { "a", "b", "c", "d", "e" };
		int ISBN = 100;

		Book[] arrayBook = new Book[30];

		for (int i = 0; i < 30; i++) {
			arrayBook[i] = new Book(names[i % names.length], author[i % author.length], publisher[i % publisher.length],
					++ISBN);
		}
		for (Book i : arrayBook) {
			System.out.println(i.getBookInfo());
			System.out.println();
		}

	}

}
