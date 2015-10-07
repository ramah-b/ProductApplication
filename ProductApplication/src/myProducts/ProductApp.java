package myProducts;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String userChoice, quitKeyword = "not quit";

		// temporary variables that will hold user's entries
		String tempCode, tempDesc;
		double tempPrice;

		System.out.println("PRODUCT INPUT APPLICATION\n");

		// user should enter what type of products will be entered and the Prog
		// will validate this entry
		System.out.println("What type of products would you like to enter?");
		do {
			System.out.print("enter 'b' for Books and 's' for Software: ");
			userChoice = keyboard.next();
		} while (!userChoice.equals("b") && !userChoice.equals("s")
				&& !userChoice.equals("B") && !userChoice.equals("S"));

		// if the user chooses Books
		if (userChoice.equals("b") || userChoice.equals("B")) {
			System.out
					.println("Enter books details. To Quit enter 'y' or 'Y'.");

			String tempAuthor;
			ArrayList<Book> bookArray = new ArrayList<Book>();

			int i = 0;

			while (!quitKeyword.equals("y") && !quitKeyword.equals("Y")) {

				Book tempBook = new Book();

				System.out.println("\nBook# " + (i + 1));

				System.out.print("code: ");
				tempCode = keyboard.next();
				tempBook.setCode(tempCode);

				System.out.print("description: ");
				tempDesc = keyboard.next();
				tempBook.setDescription(tempDesc);

				System.out.print("price: ");
				tempPrice = keyboard.nextDouble();
				tempBook.setPrice(tempPrice);

				System.out.print("author: ");
				tempAuthor = keyboard.next();
				tempBook.setAuthor(tempAuthor);

				// add the entered book to the Array of Book Objects
				bookArray.add(i, tempBook);

				i++;

				System.out.print("\nQuit? ");
				quitKeyword = keyboard.next();

			}

			// Print the Book Objects
			System.out.println("\nThe number of books enteries were: "
					+ Product.getCount());
			System.out
					.println("Would you like a Simple or Detailed print of the products?");

			do {
				System.out.print("Enter 's' for Simple, 'd' for detailed: ");
				userChoice = keyboard.next();
			} while (!userChoice.equals("s") && !userChoice.equals("S")
					&& !userChoice.equals("d") && !userChoice.equals("D"));

			System.out.println("The entries are: ");
			if (userChoice.equals("s") || userChoice.equals("S")) {
				for (int j = 0; j < bookArray.size(); j++) {
					System.out.println("\nBook# " + (j + 1));
					System.out.println(bookArray.get(j).toString("s"));
				}
			} else {
				for (int j = 0; j < bookArray.size(); j++) {
					System.out.println("\nBook# " + (j + 1));
					System.out.println(bookArray.get(j).toString("d"));
				}

			}

		}

		// if the user chooses Software
		else if (userChoice.equals("s") || userChoice.equals("S")) {
			System.out.println("Enter software details. To Quit enter 'quit'.");

			String tempVersion;
			ArrayList<Software> softwareArray = new ArrayList<Software>();

			int i = 0;

			while (!quitKeyword.equals("y") && !quitKeyword.equals("Y")) {

				Software tempSoftware = new Software();

				System.out.println("\nSoftware# " + (i + 1));

				System.out.print("code: ");
				tempCode = keyboard.next();
				tempSoftware.setCode(tempCode);

				System.out.print("description: ");
				tempDesc = keyboard.next();
				tempSoftware.setDescription(tempDesc);

				System.out.print("price: ");
				tempPrice = keyboard.nextDouble();
				tempSoftware.setPrice(tempPrice);

				System.out.print("version: ");
				tempVersion = keyboard.next();
				tempSoftware.setVersion(tempVersion);

				// add the entered software to the Array of Software Objects
				softwareArray.add(i, tempSoftware);

				System.out.print("\nQuit? ");
				quitKeyword = keyboard.next();

				i++;
			}

			// Print the Software Objects
			System.out.println("\nThe number of Software enteries were: "
					+ Product.getCount());

			System.out
					.println("Would you like a Simple or Detailed print of the products?");

			do {
				System.out.print("Enter 's' for Simple, 'd' for detailed: ");
				userChoice = keyboard.next();
			} while (!userChoice.equals("s") && !userChoice.equals("S")
					&& !userChoice.equals("d") && !userChoice.equals("D"));

			System.out.println("The entries are: ");

			if (userChoice.equals("s") || userChoice.equals("S")) {
				for (int j = 0; j < softwareArray.size(); j++) {
					System.out.println("\nSoftware# " + (j + 1));
					System.out.println(softwareArray.get(j).toString("s"));
				}
			} else {
				for (int j = 0; j < softwareArray.size(); j++) {
					System.out.println("\nSoftware# " + (j + 1));
					System.out.println(softwareArray.get(j).toString("d"));
				}

			}
		}

		System.out.println("Finished Product Entries");
		keyboard.close();

	}

}
