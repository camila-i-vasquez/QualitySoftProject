

public void searchAndPrintContactByName(PrintStream out, String name) {
		int index = 0;
		
		while (myContactList.size() > index) {
			if (myContactList.get(index).getLastName().equals(name)){
				System.out.println(myContactList.get(index));
				myContactList.match=True;
			}
			if (!myContactList.get(index).getLastName().equals(name)) 
				System.out.println("Sorry there is no match to the last name.")	;
			index++;	
		}
	}
