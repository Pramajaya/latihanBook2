package misc;

import java.util.ArrayList;

import entity.Book;
import entity.Comic;
import entity.Novel;
import entity.Textbook;

public class CRUDList {

	public static ArrayList<Book> bookList = new ArrayList<Book>();

	public static void addBookList(Book book) {
		bookList.add(book);
	}
	
	public static int sizeBookList() {
		return bookList.size();
	}
	
	public static void displayAllBookList() {
		for (Book book : bookList) {
			book.displayAllViewList();
		}
	}
	
	public static void displayAuthorBookList() {
		for (Book book : bookList) {
			book.displayAuthorViewList();
		}
	}
	
	public static void displayBookBookList() {
		for (Book book : bookList) {
			book.displayBookViewList();
		}
	}
	
	public static int getIndexByCodeBookList(String code) {
		for (int i = 0; i < sizeBookList(); i++) {
			Book book = bookList.get(i);
			
			if (book instanceof Comic && ((Comic) book).getcCode().equals(code)) {
				return i;
			}
			
			if (book instanceof Novel && ((Novel) book).getnCode().equals(code)) {
				return i;
			}
			
			if (book instanceof Textbook && ((Textbook) book).getTbCode().equals(code)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void updateBookList(int i, String name) {
		if (i >= 0 && i < sizeBookList() ) {
			Book book = bookList.get(i);
			
			if (book instanceof Comic) {
				Comic comic = (Comic) book;
				comic.setName(name);
				
			} else if (book instanceof Novel) {
				Novel novel = (Novel) book;
				novel.setName(name);
				
			} else if (book instanceof Textbook) {
				Textbook textbook = (Textbook) book;
				textbook.setName(name);
				
			}
		}
	}
	
	public static void deleteBookList(int i) {
		if (i >= 0 && i <= sizeBookList() ) {
			bookList.remove(i);
		}
	}
	
}
