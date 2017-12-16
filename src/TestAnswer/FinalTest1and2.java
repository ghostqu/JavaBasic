package TestAnswer;

import java.io.Serializable;

// java bean rules:
// 1. the attributes(data member) in the class must be private
// 2. must provide the default constructor(Nullary constructor)
// 3. must provide the get and set method(Mutator method)
// 4. can be serializable
public class FinalTest1and2 {
	public static void main(String[] arg) {
		Circle c = new Circle(100, 0, 20);
		System.out.println(c.area());
	}
}

interface IShape extends Serializable {
	public abstract double area();
}

abstract class Shape implements IShape {
	private double x, y;
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {return x;}
	public double getY() {return y;}
	public void setX(double x) {this.x = x;}
	public void setY(double y) {this.y = y;}
}

class Rectangle extends Shape {
	private double w, h;
	public Rectangle(){
		super(0,0);
		w = 0;
		h = 0;
	}
	public Rectangle(double x, double y, double w, double h){
		super(x, y);
		this.w = w;
		this.h = h;
	}
	
	public double area() {
		return w * h;
	}
	public double getW() {return w;}
	public double getH() {return h;}
	public void setW(double w) {this.w = w;}
	public void setH(double h) {this.h = h;}
}

class Circle extends Shape {
	private double r;
	public Circle(){
		super(0, 0);
		r = 0;
	}
	public Circle(double x, double y, double r){
		super(x, y);
		this.r = r;
	}
	
	public double area() {
		return 3.14 * r * r;
	}
	public double getR() {return r;}
	public void setR(double r) {this.r = r;}
}
