package TestAnswer;

public class FinalTest3 {
	public static void main(String[] arg) {
		String a = "abc";
		String b = new String("abc");
		String c = "ab" + "c";
		String d = "a";
		d += "bc";
		String e = "abcd";
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(c == d);
		System.out.println(d == e);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));
		System.out.println(d.equals(e));
		Integer p = 1;
		Integer q = 0 + 1;
		Integer r = 2 - 1;
		System.out.println(p == q);
		System.out.println(q == r);
		System.out.println(p.equals(q));
		System.out.println(q.equals(r));
	}
}
