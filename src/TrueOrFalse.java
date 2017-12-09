
public class TrueOrFalse {
	public static void main(String[] arg) {
		// rules 
		// 1.you can not instantiate an interface or an abstract class
		// so new Y() is illegal because Y is an interface. 
		// remember just do not use new on interface and abstract class
		// 2.you can declare any type (include interface and abstract class) as a pointer.
		// like Y y2; is legal you just DECLARE it not INSTANTIATE it
		// 3.if you did not write a constructor java will create a default no parameter constructor
		// but if you write a constructor whatever if has parameter or not, the default constructor 
		// will NOT EXIST.
		// 4.in java the child class know its parent, but parent do not know who is their children.
		// so, you can use parent class as a pointer point to the child class (like Y y1 = new Z()
		// if you do so, you can NOT call the method only exis in the child class. for example you can not
		// call y1.l(), but you can call y1.f() because it exist in parent class)
		// but you can not use child class point to the parent class(Z z = new Y() <-ILLEGAL)
		Z z1 = new Z(); // legal classical way
		Y y1 = new Z(); // legal rule 4
		Z z2 = new Y(); // illegal rule 4, Y is the parent
		F f1 = new F(1);// legal rule 3
		F f2 = new Z(2);// illegal no relationship with Z and F
		F f3 = new F(); // illegal rule 3
		Z z3 = new F(3);// illegal no relationship with Z and F 
		Y y2;           // legal rule 2
		Y y3 = new Y(); // illegal rule 1
		X x1;           // legal rule 2
		Y x2 = new X(); // illegal rule 1
		X x3 = new Y(); // illegal rule 1 and rule 4
		Z z4;           // legal rule 2
	}
}

interface Y {
	public void f();
}

abstract class X implements Y {
	private int x;
	public X() {this.x = x;}
}

class Z extends X {
	public void f() { }
	public void l() { }
}
class F implements Y {
	private int y;
	public F(int y) {this.y = y;}
	public String toString() {
		return "F" + y;
	}
	public void f() {
		System.out.println("test");
	}
}