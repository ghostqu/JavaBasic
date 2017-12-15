import java.io.*;
import java.util.*;

public class FinalPractice {
	public static void main(String[] arg) {
		List<Human> ls = new ArrayList<>();
		ls.add(new Male("Dov", 54));
		ls.add(new Female("Minlin", 24));
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("human.ser")); 
			for(Human e : ls) {
				e.print();
				oos.writeObject(e);
			}
			oos.close();
		} catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		Male a = new Male("Keiven", 34);
		Male b = a.clone();
		System.out.println(a.equals(b));
	}
}

interface Human extends Cloneable{
	public void print();
	public void getName();
	public void setName(String n);
}
class Male implements Human {
	private String name;
	private int age;
	public Male(String n, int a) {
		name = n;
		age = a;
	}
	public Male clone() {
		return new Male(name, age);
	}
	public boolean equals(Male a) {
		return name.equals(a.name) && age == a.age;
	}
	public void print() {
		System.out.println("I am a male, my name is " + name + ", my age is " + age);
	}

	public void getName() {
		System.out.println(name);
	}

	public void setName(String n) {
		name = n;
	}
	
}
class Female implements Human {
	private String name;
	private int age;
	public Female(String n, int a) {
		name = n;
		age = a;
	}
	public Female clone() {
		return new Female(name, age);
	}
	public boolean equals(Female a) {
		return name.equals(a.name) && age == a.age;
	}
	public void print() {
		System.out.println("I am a female, my name is " + name + ", my age is " + age);
	}

	public void getName() {
		System.out.println(name);
	}

	public void setName(String n) {
		name = n;
	}
	
}