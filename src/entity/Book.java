package entity;

public abstract class Book {

	String name;
	String author;
	String type;
	public Book(String name, String author, String type) {
		super();
		this.name = name;
		this.author = author;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public abstract void displayAllViewList();
	public abstract void displayAuthorViewList();
	public abstract void displayBookViewList();

}
