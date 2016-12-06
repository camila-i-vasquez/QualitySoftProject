
/**
 * Contact
 * This manages the data structure for an individual contact. This skeleton includes a readContact
 * method to keep all the details of how many fields are in a contact in one place, and does not 
 * currently therefore need constructors or set Methods which could be added if needed. Only one 
 * get Method is currently needed for the last name.
 * EToolis
 */
import java.io.PrintStream;
import java.util.Scanner;

public class Contact implements Comparable<Contact> {
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String emailAddress;
	private String phoneNumber;
	private String notes;

	private static final String FIRST_NAME_PROMPT = "First Name: ";
	private static final String LAST_NAME_PROMPT = "Last Name: ";
	private static final String STREET_ADDRESS_PROMPT = "Street Address: ";
	private static final String EMAIL_ADDRESS_PROMPT = "Email Address: ";
	private static final String PHONE_NUMBER_PROMPT = "Phone Number: ";
	private static final String NOTES_PROMPT = "Notes: ";

	/**
	 * Read a contact from in using the prompt strings, printed to out,
	 * populating all the private variables. Doing the read inside this class
	 * will make the program more malleable and easier to extend, keeps prompts
	 * and everything else in one place.
	 EToolis
	 */
	public void readContact(PrintStream output, Scanner input) {
		output.print(FIRST_NAME_PROMPT);
		firstName = input.nextLine();
		output.print(LAST_NAME_PROMPT);
		lastName = input.nextLine();
		output.print(STREET_ADDRESS_PROMPT);
		streetAddress = input.nextLine();
		output.print(EMAIL_ADDRESS_PROMPT);
		emailAddress = input.nextLine();
		output.print(PHONE_NUMBER_PROMPT);
		phoneNumber = input.nextLine();
		output.print(NOTES_PROMPT);
		notes = input.nextLine();
		output.println();
		
	}

	/**
	 * Return a string for displaying the contact for when you want to either
	 * print or display an individual contact.
	 *C Vasquez
	 */
	public String toString() {
		
		return "Name:           " + firstName  + lastName + "\n" + STREET_ADDRESS_PROMPT + " "
				 + streetAddress + "\n" + EMAIL_ADDRESS_PROMPT + " " + emailAddress + "\n" + 
				PHONE_NUMBER_PROMPT +"  " + phoneNumber + "\n" + 
				NOTES_PROMPT +"         " + notes + " \n";
	
	}

	/**
	 * Check that the contact is valid, For Use Case 1 - "If the user leaves the
	 * last name blank, then the person will not be entered into the contact
	 * list." If user does not input a last name, validContact will return false
	 * otherwise validContact will return true. This will be expanded for Use
	 * Case 1a. E Toolis
	 */
	public boolean isValidContact() {
		if (lastName.equals("")) return false; 
		else return true;
		

	}

	/**
	 * basic method, just return lastName. This will be used for sorting and
	 * finding by last name.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * compareTo compares this object to the other object, a second contact will
	 * be passed in as other returns 0 if they are equal returns < 0 if object <
	 * other returns > 0 if object > other
	 */
	public int compareTo(Contact other) {
		return 99;
	}

	/**
	 * Test if two objects are equal, if they are return true, if they are not
	 * return false.
	 */
	public boolean equals(Contact other) {

		return true;

	}
}
