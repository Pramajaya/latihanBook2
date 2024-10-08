package featrure;

import java.util.Random;
import java.util.Scanner;

import entity.Comic;
import misc.CRUDList;
import entity.Novel;
import entity.Textbook;

public class Create {

	Scanner scan = new Scanner(System.in);
	Random rand = new Random();

	boolean done;

	String bookName;
	String authorName;
	String bookType;
	String bookCode;

	public Create() {
		do {
			done = false;
			try {
				do {
					System.out.print("Book Name: ");
					bookName = scan.nextLine();
				} while (!(bookName.length() >= 4));
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);

		do {
			done = false;
			try {
				do {
					System.out.print("Author Name: ");
					authorName = scan.nextLine();
				} while (!(authorName.length() >= 4));
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);

		do {
			done = false;
			try {
				do {
					System.out.print("Book Type: ");
					bookType = scan.nextLine();

					if (bookType.equals("Comic")) {
						do {
							bookCode = "CO" + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9);

						} while (!(bookCode.contains(bookCode)));
						
						CRUDList.addBookList(new Comic(bookName, authorName, bookType, bookCode));
						
					} else if (bookType.equals("Novel")) {
						do {
							bookCode = "NO" + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9);

						} while (!(bookCode.contains(bookCode)));
						
						CRUDList.addBookList(new Novel(bookName, authorName, bookType, bookCode));

					} else if (bookType.equals("Textbook")) {
						do {
							bookCode = "TB" + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9);
							
						} while (!(bookCode.contains(bookCode)));
						
						CRUDList.addBookList(new Textbook(bookName, authorName, bookType, bookCode));
					}

				} while (!(bookType.equals("Comic") || bookType.equals("Novel") || bookType.equals("Textbook")));
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);

	}

}
