import java.util.*;
import java.io.*;

public class GiftSelector {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		String file = "giftList.txt";
		File list = new File(file);
		Scanner input = new Scanner(list);
		PrintWriter output = new PrintWriter(list);
		String choice = "";
		String addEdit = "";
		String gift = "";
		Person person = new Person();

		System.out.println("Gift Magic v1.0 - by Dakota Flath");

		do {

			System.out.println("Add person to list, select a gift, or exit? (\"add\", \"select\", or \"exit\"):");
			choice = scan.next();

			if (choice.equalsIgnoreCase("add")) {

				while (true) {

					System.out.println("'Create' an entry, 'edit' an existing entry, or go 'back'?");
					addEdit = scan.next();

					if (addEdit.equalsIgnoreCase("create")) {

						System.out.println("Enter name: ");
						String name = scan.next();
						person.setPerson(name);

						for (int i = 0; i < person.getList().length(); i++) {
							output.append(person.getList().charAt(i));
						}

						output.append(':');
						output.flush();
						System.out.println("Add gifts (one per line, type 'done' when finished): ");

						while (true) {
							gift = scan.nextLine();

							if (gift.equalsIgnoreCase("done") == true) { 
								output.append('\n');	
								break; 
							}

							for (int i = 0; i < gift.length(); i++) {
								output.append(gift.charAt(i));
							}
							output.append('\n');
							output.flush();
						}

					}

					else if (addEdit.equalsIgnoreCase("edit")) {
						System.out.println("edited!");
					}

					else if (addEdit.equalsIgnoreCase("back")) {
						break;
					}

 					else {
						System.out.println("Invalid input, please choose \"create\",\"edit\", or \"back\".");
					}

				} //addEdit while-loop
			} //if choice is add

			else if (choice.equalsIgnoreCase("select")) {
				System.out.println("selected");
			} //if choice is select

			else if (choice.equalsIgnoreCase("exit")) {
				break;
			} //if choice is exit

			else {
				System.out.println("Invalid input, please choose \"add\",\"select\", or \"exit\".");
			} // if choice is else

		} while (choice.toLowerCase().charAt(0) != 'e'); //first while-loop
	
	output.close();

	} //main
} //class
