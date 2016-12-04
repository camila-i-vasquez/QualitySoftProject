
/**
 * ContactListApplication
 * Top level of the program, starting with tests and then becoming the
 * main top level of the final program. Includes the main() method.
 */
import java.io.PrintStream;
import java.util.Scanner;

public class ContactListApp {
	public static void main(String args[]) {

		ContactListApp.taskThreeTest();
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
		System.out.println("Testing if validContact functions: " + contactOne.validContact());
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
		/**
		 * create a while loop with an if/else statement inside that asks what
		 * you want to do in console, while giving available prompts, then
		 * depending on what prompt is input it fulfills different tasks. Sample
		 * commands: add, print, find, exit
		 */
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
