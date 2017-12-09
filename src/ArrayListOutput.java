import java.util.*;

public class ArrayListOutput {
	public static void main(String[] arg) {
		List<Integer> ls = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			ls.add(i);
		}
		int sum = 0;
		for(Iterator<Integer> it = ls.listIterator(); it.hasNext(); ) {
			sum += it.next();
		}
		System.out.println(sum);
	}
}
