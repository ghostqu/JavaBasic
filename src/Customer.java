import java.io.Serializable;
import java.util.*;

public class Customer {
	public static void main(String[] arg) {
		List<Customers> ls = new ArrayList<>();
		ls.add(new Depositor("Steven","110",112.5));
		ls.add(new Depositor("Dov","111",114.5));
		ls.add(new Depositor("Alice","113",132.5));
		ls.add(new Borrower("Steven", 1, 2, 2001 ,162.5));
		for(Customers e : ls) {
			e.print();
		}
	}
}

interface Customers extends Cloneable, Serializable {
	public void print();
}

class Depositor implements Customers {
	private String name;
	private String account;
	private double amount;
	public Depositor(String name, String account, double amount) {
		this.name = name;
		this.account = account;
		this.amount = amount;
	}
	public void print() {
		System.out.println("I am a depositor, my name is " + name +
				"I have " + amount + " dollars, My account is"
				+ account);
	}
	public Depositor clone() {
		return new Depositor(name, account, amount);
	}
	public boolean equals(Depositor a) {
		return name.equals(a.getName()) &&
			   account.equals(a.getAccount()) &&
			   amount == a.amount;
	}
	public String getName() {
		return name;
	}
	public String getAccount() {
		return account;
	}
	public double getAmount() {
		return amount;
	}
}
class Borrower implements Customers {
	private String name;
	private double amount;
	private Date date;
	class Date {
		int year;
		int month;
		int day;
		public Date(int y, int m, int d) {
			year = y;
			month = m;
			day = d;
		}
		public Date(Date d) {
			year = d.year;
			month = d.month;
			day = d.day;
		}
		public String toString() {
			return day + "/" + month + "/" + year; 
		}
		public boolean equals(Date d) {
			return year == d.year && 
				   month == d.month &&
				   day == d.day;
		}
	}
	public Borrower(String name, int y, int m, int d, double amount) {
		this.name = name;
		this.amount = amount;
		this.date = new Date(y, m, d);
	}
	public Borrower(String name, Date date, double amount) {
		this.name = name;
		this.amount = amount;
		this.date = new Date(date);
	}
	public void print() {
		System.out.println("I am a depositor, my name is " + name +
				"I have " + amount + " dollars and should pay back before" +
				date);
	}
	public String getName() {
		return name;
	}
	public Date getDate() {
		return date;
	}
	public double getAmount() {
		return amount;
	}
	public boolean equals(Borrower a) {
		return name.equals(a.getName()) &&
			   amount == a.getAmount() &&
			   date.equals(a.getDate());
	}
	public Borrower clone() {
		return new Borrower(name, date, amount);
	}
}