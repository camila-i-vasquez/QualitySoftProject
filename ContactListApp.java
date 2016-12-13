
/**
 * ContactListApplication
 * Top level of the program, starting with tests and then becoming the
 * main top level of the final program. Includes the main() method.
 */
import java.io.PrintStream;
import java.util.Scanner;

public class ContactListApp {
	public static void main(String args[]) {

		ContactListApp.finalProgram();
	}

	public static void taskTwoTest() {
		/**
		 * This is our initial task run test code to show the skeleton compiles.
		 * The return values of the methods are ignored here.
		 */
		Scanner input = new Scanner(System.in);
		PrintStream output = System.out;
		Contact contactOne = new Contact();
		contactOne.readContact(output, input);
		System.out.println(contactOne.toString());
		System.out.println("Testing if validContact functions: " + contactOne.isValidContact());
		System.out.println(contactOne.getLastName());

		Contact contactTwo = new Contact();
		contactTwo.readContact(output, input);
		System.out.println("Testing if compareTo functions: " + contactOne.compareTo(contactTwo));
		System.out.println("Testing if equals functions: " + contactOne.equals(contactTwo));

		ContactList theList = new ContactList();
		theList.addContact(contactOne);
		theList.printContactList(output);
		theList.printContactByName(output, "Haight");
		String filename = "ContactList.ser";
		System.out.println("Testing if saveList functions: " + theList.saveList(filename));
		System.out.println("Testing if loadList functions: " + theList.loadList(filename));

		output.println("Compiled and ran");
	}
	
	public static void taskThreeTest() {
		Scanner input = new Scanner(System.in);
		PrintStream output = System.out;
		ContactList theList = new ContactList();

		
		Contact contactOne = new Contact();
		contactOne.readContact(output, input);
		theList.addContact(contactOne);
		theList.printContactList(output); //@Camila
		
		Contact contactTwo = new Contact();
		contactTwo.readContact(output, input);
		theList.addContact(contactTwo);
		theList.printContactList(output); //@Camila
		
	}



	public static void finalProgram() {
		Scanner input = new Scanner(System.in);
		PrintStream output = System.out;
		ContactList theList = new ContactList();
		Contact nextContact;
		String command;
		String saveFile = "Group4.sav";
		boolean done = false;

		output.println("Welcome to the matrix");
		theList.loadList(saveFile);

		while (!done) {
			output.print("[1]Add new contact information\n[2]Print the contact list\n"
					+ "[3]Search for a contact by last name\n[4]Quit the program\n\n");
			command = input.nextLine();

			if (command.equals("1")) {
				nextContact = new Contact();
				if (nextContact.readContact(output, input))theList.addContact(nextContact);
				else output.println("Sorry, the contact cannot be added without a last name. \n");

			} else if (command.equals("2")) {
				theList.printContactList(output);
			}

			else if (command.equals("3")) {
				output.print("Who do you want to find? ");
				String lastName = input.nextLine();
				theList.printContactByName(output, lastName);
			}

			else if (command.equals("4")) {
				theList.saveList(saveFile);
			//	done = true;
			}

			else {
				output.println("I am sorry! Your input is incorrect. Try again.");
			}

		}
	}
}

/**
ToString functions!
Testing if validContact functions: true
getLastName functions!
Testing if compareTo functions: 99
Testing if equals functions: true
Testing if saveList functions: true
Testing if loadList functions: true
Compiled and ran
 */
