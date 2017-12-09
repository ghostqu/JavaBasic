
public class AnonymousClass {
	public static void main(String[] arg) {
		//since this is the first anonymous class of the AnonymousClass class
		//the name of this anonymous is AnonymousClass$1
		An a = new An(){
			public void f() {
				System.out.println("I am a class");
			}
		};
		System.out.println(a.getClass());
		//since this is the second anonymous class of the AnonymousClass class
		//the name of this anonymous is AnonymousClass$2
		An a1 = new An(){
			public void f() {
				System.out.println("I am a class1");
			}
		};
		System.out.println(a1.getClass());
	}
}

interface An {
	public void f();
}