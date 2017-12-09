import java.io.*;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// will read information from a file
		// format:
		// Cat Alice 15.9 5
		// Dog Steve 8.8 7
		// Cat CarMen 7.2 6
		// use some data structure to make sure we can find an animal by the name quickly
		try {
			File f = new File("Animals.txt");
			Scanner sc = new Scanner(f);
			String s;
			while((s = sc.nextLine()) != null) {
				String[] animals = s.split(" ");
				String type = animals[0];
				String name = animals[1];
				double weight = Double.parseDouble(animals[2]);
				int age = Integer.parseInt(animals[3]);
			}
		} catch(Exception e) {
			System.out.println("Error");
		}

	}

}

abstract class Animals {
	private String name;
	private double weight;
	private int age;
}

class Dog {
	public String print() {
		// return I am a dog, my name is... my age is.
	}
}

class Cat {
	public String print() {
		// return I am a cat, my name is... my age is.
	}
}