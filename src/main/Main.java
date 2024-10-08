package main;

import java.util.Scanner;

import featrure.Create;
import featrure.View;
import featrure.Update;
import featrure.Delete;
import featrure.Exit;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	boolean done;
	
	int input;
	
	public Main() {
		do {
			done = false;
			try {
				do {
					System.out.println("1. Create Book");
					System.out.println("2. View Book");
					System.out.println("3. Update Book");
					System.out.println("4. Delete Book");
					System.out.println("5. Exit");
					System.out.print(">> ");
					input = scan.nextInt();
					switch(input) {
					case 1:
						new Create();
						break;
					case 2:
						new View();
						break;
					case 3:
						new Update();
						break;
					case 4:
						new Delete();
						break;
					case 5:
						new Exit();
						break;
					}
				} while (input != 5);
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);
	}

	public static void main(String[] args) {
		new Main();

	}

}
