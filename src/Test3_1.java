import java.io.*;
import java.util.*;

public class Test3_1 {

	public static void main(String[] args) throws FileNotFoundException {
		List<Shape> ls = new ArrayList<>();
		File f = new File("Shape.txt");
		Scanner sc = new Scanner(f);
		String s;
		while(sc.hasNextLine()) {
			s = sc.nextLine();
			String[] shapes = s.split(" ");
			if(shapes[0].equals("Circle")) {
				ls.add(new Circle(Double.parseDouble(shapes[1]),
				       Double.parseDouble(shapes[2]),
					   Double.parseDouble(shapes[3])));
			} else {
				ls.add(new Rect(Double.parseDouble(shapes[1]),
					       Double.parseDouble(shapes[2]),
						   Double.parseDouble(shapes[3]),
						   Double.parseDouble(shapes[4])));
			}
			sc.close();
		}
		for(Shape e : ls) {
			e.isInside(41, 20);
		}
	}

}

abstract class Shape{
	private double x, y;
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {return x;}
	public double getY() {return y;}
	public abstract void isInside(double x, double y);
}
class Circle extends Shape{
	private double r;
	public Circle(double x, double y, double r) {
		super(x, y);
		this.r = r;   
	}
	public void isInside(double a, double b) {
		if((a - getX()) * (a - getX()) + (b - getY()) * (b - getY()) < r * r) {
			System.out.println("the point(" + a + "," + b + ") is in the circle");
		}
	}
}
class Rect extends Shape{
	private double w, h;
	public Rect(double x, double y, double w, double h) {
		super(x, y);
		this.w = w;
		this.h = h;
	}
	public void isInside(double a, double b) {
		if(a <= getX() + w/2 && a >= getX() - w/2 &&
		   a <= getY() + h/2 && a >= getY() - h/2) {
			System.out.println("the point(" + a + "," + b + ") is in the Rect");
		}
	}
}