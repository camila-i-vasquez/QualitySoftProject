	/**
	 * compareTo compares this object to the other object, a second contact 
	 * passes in as other returns 0 if they are equal returns < 0 if object <
	 * other returns > 0 if object > other
	 */ 
	 
	public int compareTo(Contact newContact) { 
		
		if (lastName.compareToIgnoreCase(newContact.getLastName()) == 0) { 
			return firstName.compareToIgnoreCase(newContact.getLastName());
		}   else {
			return lastName.compareToIgnoreCase(newContact.getLastName());
		}
	}
