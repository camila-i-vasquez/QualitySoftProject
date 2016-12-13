	/**
	 * compareTo compares this object to the other object, a second contact 
	 * passes in as other returns 0 if they are equal returns < 0 if object <
	 * other returns > 0 if object > other
	 */ 
	 
	public int compareTo(Contact newContact) { 
		
		if (lastName.compareToIgnoreCase(newContact.getLastName()) == 0) { 
			return firstName.compareToIgnoreCase(newContact.getFirstName());
		}   else {
			return lastName.compareToIgnoreCase(newContact.getLastName());
		}
	}

	private String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	/*
	 * Test if two objects are equal, if they are return true, if they are not
	 * return false.
	 */
	public boolean equals(Contact newContact) {
		if (!this.firstName.equals(newContact.getFirstName())) return false;
		if (!this.lastName.equals(newContact.getLastName())) return false;
		if (!this.streetAddress.equals(newContact.getStreetAddress())) return false;
		if (!this.emailAddress.equals(newContact.getEmailAddress())) return false;
		if (!this.phoneNumber.equals(newContact.getPhoneNumber())) return false;
		if (!this.notes.equals(newContact.getNotes())) return false;
		return true;

	}
