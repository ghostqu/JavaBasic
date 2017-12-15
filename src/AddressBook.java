import java.io.*;

public class AddressBook implements Serializable, Cloneable{
	private String fName, lName, email, pNumber;
	public AddressBook(String f, String l, String e, String p) {
		fName = f;
		lName = l;
		email = e;
		pNumber = p;
	}
	public AddressBook clone() {
		return new AddressBook(fName, lName, email, pNumber);
	}
	public boolean equals(AddressBook a) {
		return fName.equals(a.fName) &&
			   lName.equals(a.lName) &&
			   email.equals(a.email) &&
			   pNumber.equals(a.pNumber);
	}
	public static void main(String[] args) {
		AddressBook p = new AddressBook("Dong", "Ding", "whoCares@stevens.edu", "201-000-0000");
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("addrbook.ser"));
			oos.writeObject(p);
			oos.close();
		} catch (IOException e) {
			System.out.println("Can not write file!");
		}
		AddressBook p2 = p.clone();
		System.out.println(p2.equals(p));
	}

}
