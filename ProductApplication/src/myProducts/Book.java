package myProducts;

public class Book extends Product {

	private String author;

	public Book() {
		super();
		this.author = "";

	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString(String detail) {
		if (detail.equals("d")) {
			return super.toString() + "Author:      " + author + "\n";

		} else {
			return super.toString() + "\n";
		}
	}
}
