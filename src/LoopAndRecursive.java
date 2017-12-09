
public class LoopAndRecursive {
	//compute the x^0/0! + x^2/2! + x^4/4! + x^6/6! + x^n/n!
	public static double cal(int x, int n) {
		double sum = 1;
		int fact = 1;
		int power = 1;
		for(int i = 1; i <= n; i++) {
			fact *= i;
			power *= x;
			if(i % 2 == 0) sum += power * 1.0 / fact;
		}
		return sum;
	}
}
