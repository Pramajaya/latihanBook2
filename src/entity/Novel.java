package entity;

public class Novel extends Book{
	
	String nCode;

	public Novel(String name, String author, String type, String nCode) {
		super(name, author, type);
		this.nCode = nCode;
	}

	public String getnCode() {
		return nCode;
	}

	public void setnCode(String nCode) {
		this.nCode = nCode;
	}

	@Override
	public void displayAllViewList() {
		System.out.println("Book Code: " + getnCode());
		System.out.println("Book Name: " + getName());
		System.out.println("Book Author Name: " + getAuthor());
	}

	@Override
	public void displayAuthorViewList() {
		System.out.println("Book Author Name: " + getAuthor());
	}

	@Override
	public void displayBookViewList() {
		System.out.print(getnCode() + " - ");
		System.out.println(getName());
	}

}
