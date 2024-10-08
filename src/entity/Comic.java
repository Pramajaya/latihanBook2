package entity;

public class Comic extends Book {
	
	String cCode;

	public Comic(String name, String author, String type, String cCode) {
		super(name, author, type);
		this.cCode = cCode;
	}

	public String getcCode() {
		return cCode;
	}

	public void setcCode(String cCode) {
		this.cCode = cCode;
	}
	
	@Override
	public void displayAllViewList() {
		System.out.println("Book Code: " + getcCode());
		System.out.println("Book Name: " + getName());
		System.out.println("Book Author Name: " + getAuthor());
	}

	@Override
	public void displayAuthorViewList() {
		System.out.println("Book Author Name: " + getAuthor());
	}

	@Override
	public void displayBookViewList() {
		System.out.print(getcCode() + " - ");
		System.out.println(getName());
	}

}
