
public class FactAndFibo {
	public static int fact(int n) {
		int res = 1;
		for(int i = 1; i <= n; i++) res *= i;
		return res;
	}
	public static int fact2(int n) {
		if(n == 0) return 1;
		return n * fact2(n - 1);
	}
	// find out nth fibo
	public static int fibo(int n) {
		if(n <= 2) return 1;
		int fast = 1;
		int slow = 1;
		for(int i = 2; i < n; i++) {
			int temp = fast;
			fast = fast + slow;
			slow = temp;
		}
		return fast;
	}
	public static int fibo2(int n) {
		if(n <= 1) return n;
		return fibo2(n - 1) + fibo2(n - 2);
	}
}
