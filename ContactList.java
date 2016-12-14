
/**
 * ContactList
 * Operations for managing a list of contacts. This includes the key add method
 * plus ways of printing the whole list or just finding and printing matching entries by matching
 * last name. Also includes methods for exporting whole list to disk and importing it back
 * again when program is restarted.
 */
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import java.util.Collections;
import java.util.Comparator;

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
	 * This method will add a new Contact to the list, using the method .add that ArrayList has
	 * @eToolis
	 */
	public void addContact(Contact newPerson) {
		myContactList.add(newPerson);

	}

	/**
	 * Sorts the ArrayList alphabetically by last name then first name case
	 * INsensitive and prints that out using the toString method on each
	 * contact. @cVasquez, @eToolis
	 */

	public void printContactList(PrintStream out) {
		Collections.sort(myContactList, new Comparator<Contact>() {
			@Override
			public int compare(Contact c1, Contact c2) {
				return c1.compareTo(c2);
			}
		});

		int index = 0;
		while (myContactList.size() > index) {
			out.print(myContactList.get(index).toString());
			index++;

		}
	}

	/**
	 * This method uses a while loop to cycle through Contacts in myContactList,
	 * if the user inputed last name matches one of the last names in the list(case INsensitive)
	 * then this will print out that contact. If the last name does not match any of the last names,
	 * then it will print "Sorry there is no match to the last name." @sKyoung
	 */
	public void searchAndPrintContactByName(PrintStream out, String name) {
		int index = 0;
		boolean found = false;
		while (myContactList.size() > index) {
			if (myContactList.get(index).matches(name)) {
				out.print(myContactList.get(index).toString());
				found = true;
			}
			index++;
		}
		if (!found)
			out.println("Sorry there is no match to the last name.\n");

	}

	/**
	 * Saves contacts from program to disk. Using the serialization capabilities
	 * of our Contact object use the java classes above, primarily File,
	 * FileOutputStream, ObjectOutputStream and IOException. Uses try-catch
	 * construct. This returns true if the file is saved successful, otherwise
	 * it returns false. @eToolis
	 */
	public boolean saveList(String fileName) {
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(myContactList);
			oos.close();
			fos.close();
			return true;
		} catch (IOException ioe) {
			System.out.println("Failed to save");
			ioe.printStackTrace();
			return false;
		}
	}

	/**
	 * Loads contacts from disk to launch program using the serialization
	 * capabilities of our Contact object using the java classes above,
	 * primarily File, ObjectInputStream, FileInputStream, IOException, and
	 * FileNotFoundException This returns true if the file is loaded
	 * successfully, otherwise returns false C Vasquez, E Toolis.
	 */
	public boolean loadList(String fileName) {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			myContactList = (List<Contact>) ois.readObject();
			ois.close();
			fis.close();
			return true;
		} catch (FileNotFoundException fnf) {
			return true;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return false;
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
			return false;
		}
	}

}
