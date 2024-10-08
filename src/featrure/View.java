package featrure;

import java.util.Scanner;

import misc.CRUDList;
import main.Main;

public class View {
	
	Scanner scan = new Scanner(System.in);
	
	boolean done;
	
	int input;

	public View() {
		if (CRUDList.sizeBookList() <= 0) {
			System.out.println("No data");
		} else {
			do {
				done = false;
				try {
					do {
						System.out.println("View");
						System.out.println("1. View All");
						System.out.println("2. View Book");
						System.out.println("3. View Author");
						System.out.println("4. Exit");
						input = scan.nextInt();
						switch(input) {
						case 1:
							CRUDList.displayAllBookList();
							break;
						case 2:
							CRUDList.displayBookBookList();
							break;
						case 3:
							CRUDList.displayAuthorBookList();
							break;
						case 4:
							new Main();
							break;
						}
					} while (input != 4);
				} catch (Exception e) {
					done = true;
					scan.next();
				}
			} while (done);
		}
	}

}
