
/**
 * ContactList
 * Operations for managing a list of contacts. This includes the key add method
 * plus ways of printing the whole list or just finding and printing matching entries by matching
 * last name. Also includes methods for exporting whole list to disk and importing it back
 * again when program is restarted.
 */
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class ContactList implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * suggested implementation; use an ArrayList - because it can automatically
	 * adjust its size and can be serialized to disk and back saving us time on
	 * figuring out how to do that. Other alternatives might be a data structure
	 * that maintains sort order so we don't need to re-sort every time the list
	 * is printed.
	 */
	private List<Contact> myContactList = new ArrayList<Contact>();

	/**
	 * TODO add a new contact to the list, which would use the .add method for
	 * an ArrayList
	 */
	public void addContact(Contact newPerson) {
		myContactList.add(newPerson);
		// @ethan
	}

	/**
	 * TODO first the array needs to be sorted alphabetically by last name, and
	 * then first name case INsensitive, then we can iterate through the sorted
	 * list and print that to out using the toString method on each contact.
	 * 
	 */
	public void printContactList(PrintStream out) {
		int index = 0;
		while (myContactList.size() > index) {
			System.out.println(myContactList.get(index));
			index++;
			//@Camila
		}
	}

	/**
	 * TODO use an Iterator to cycle through Contacts in contact list, if the
	 * last name matches name (case INsensnsitive) then print out the Contact
	 * using its toString method. If not found then print "Could not find"
	 * message.
	 */
	public void printContactByName(PrintStream out, String name) {

	}

	/**
	 * Saves contacts from program to disk. Using the serialization capabilities
	 * of our Contact object use the java classes above, primarily File,
	 * FileOutputStream, ObjectOutputStream and IOException. Will use a
	 * try-catch construct. This returns true if the file is saved successfull, otherwise it 
	 * will return false.
	 */
	public boolean saveList(String filename) {
		return true;

	}

	/**
	 * Loads contacts from disk to launch program using the serialization
	 * capabilities of our Contact object using the java classes above,
	 * primarily File, ObjectInputStream, FileInputStream, IOException, and
	 * FileNotFoundException This should return false if the file is loaded
	 * successfully, otherwise it should return false
	 */
	public boolean loadList(String filename) {
		return true;
	}
}
