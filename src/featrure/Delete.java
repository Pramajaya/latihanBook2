package featrure;

import java.util.Scanner;

import misc.CRUDList;

public class Delete {
	
	Scanner scan = new Scanner(System.in);
	
	boolean done;
	
	String code;
	int x;

	public Delete() {
		if (CRUDList.sizeBookList() <= 0) {
			System.out.println("No data");
		} else {
			CRUDList.displayAllBookList();
			
			do {
				done = false;
				try {
					do {
						System.out.print("Input Code: ");
						code = scan.nextLine();
						x = CRUDList.getIndexByCodeBookList(code);
					} while (!(x >= 0 && x <= CRUDList.sizeBookList()));
				} catch (Exception e) {
					done = true;
					scan.next();
				}
			} while (done);
			
			CRUDList.deleteBookList(x);
			System.out.println("Deleted success!");
		}
	}

}
