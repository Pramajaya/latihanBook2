package entity;

public class Textbook extends Book{
	
	String tbCode;

	public Textbook(String name, String author, String type, String tbCode) {
		super(name, author, type);
		this.tbCode = tbCode;
	}

	public String getTbCode() {
		return tbCode;
	}

	public void setTbCode(String tbCode) {
		this.tbCode = tbCode;
	}

	@Override
	public void displayAllViewList() {
		System.out.println("Book Code: " + getTbCode());
		System.out.println("Book Name: " + getName());
		System.out.println("Book Author Name: " + getAuthor());
	}

	@Override
	public void displayAuthorViewList() {
		System.out.println("Book Author Name: " + getAuthor());
	}

	@Override
	public void displayBookViewList() {
		System.out.print(getTbCode() + " - ");
		System.out.println(getName());
	}
	
}
