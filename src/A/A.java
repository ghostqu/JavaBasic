package A;

public class A {
	public static void fun() {
		E e = new E(13);
		F f = new F();
	} 
	public static void main(String[] arg) {
		fun();
		E e = new E(12);
		F f = new F();
		e.f();
		e.g();
		f.f();
		f.h();
		System.gc();
	}
}

interface B {
	//difference all public 
	public void f();
}

interface C extends B{
	public void g();
}

abstract class D implements B{
	private int d;
	public D() {
		d = 3;
		System.out.println('d');
	}
	public void h() {
		System.out.println(d);
	}
}

class E implements C{
	private int x;
	public E(int x) {
		this.x = x;
		System.out.println(x);
	}
	public void f() {
		System.out.println('f');
	}
	public void g() {
		System.out.println('g');
	}
	public void finalize(){
		System.out.println('e');
	}
}

class F extends D{
	public void f() {
		System.out.println("f2");
	}
	public void finalize(){
		System.out.println("ff");
	}
}