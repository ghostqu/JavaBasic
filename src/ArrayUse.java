
public class ArrayUse {
	//get the square sum of one array
	public static int squareSum(int[] A) {
		int sum = 0;
		/* best way
		for(int e : A) {
			sum += e * e;
		}
		*/
		for(int i = 0; i < A.length; i++) {
			sum += A[i] * A[i];
		}
		return sum;
	}
}
