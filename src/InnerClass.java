
public class InnerClass {
	private int x = 11; // can be visited by inner class
	private class InnerOne {
		private int y = 22; // can not be visited by outer class 
		public void f() {
			System.out.println(y);
			System.out.println(x);
		}
	}
	public class InnerTwo {
		private int z = 33;
		private void g() {
			System.out.println(z);
		}
	}
	public void h() {
		System.out.println(x);
		//System.out.println(z);
	}
	public void k() {
		InnerOne one = new InnerOne(); // can new by outer class
		one.f();
		InnerTwo two = new InnerTwo();
		two.g();
		
	}
	public static void main(String[] arg) {
		InnerClass A = new InnerClass();
		A.h();
		A.k();
		//InnerTwo B = new InnerTwo(); // can not new outside outer class 
	}
}
