
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
	
	public static void finalProgram() {
		Scanner input = new Scanner(System.in);
		PrintStream output = System.out;
		ContactList theList = new ContactList();
		Contact nextContact;
		String command;
		String saveFile = "Group4.sav";
		boolean done = false;

		output.println("Welcome to your Contact List");
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
				theList.searchAndPrintContactByName(output, lastName);
			}

			else if (command.equals("4")) {
				theList.saveList(saveFile);
				done = true;
				output.println("Thank you! Good Bye!");
			}

			else {
				output.println("I am sorry! Your input is incorrect. Try again.");
			}

		}
	}
}
