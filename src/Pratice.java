import java.util.*;

public class Pratice {
	public static void main(String[] arg) {
		List<Vehicle> ls = new ArrayList<>();
		ls.add(new Car(1, "NJ66666", red));
		ls.add(new Bus(3, "NB74110", 25));
		ls.add(new Truck(5, "NJ66666", 5));
		for(int i = 0; i < ls.size(); i++) {
			Vehicle v = ls.get(i);
			v.getTime();
			v.payToll();
			System.out.println(v);
		}
	}
}
//Assume you will build a parking lot, there are three types vehicles, Bus, Car, Truck.
//we charge 15 cents for a car, 25 cents for a bus, 50 cents for a truck
//we need to know how long these vehicles will park
//and for a car we need to know its color, how many seats for a bus, how many weights a truck can load
//and you should output the type of these vehicles because I will use a pointer to store them.
//example: a car should output "I am a car"
//finish the code, you can add method in the below code.
interface IVehicle {
	public double payToll(); // this should return the money you should pay
	public double getTime(); // this should return the time you park
	public void print();
}

abstract class Vehicle implements IVehicle {
	private int time;
	private String number;
	public Vehicle(int h, String n) {
		time = h;
		number = n;
	}
} 
/*
class Car {
	
}
class Bus {
}
class Truck {
}
*/
