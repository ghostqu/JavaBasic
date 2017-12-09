import java.util.*;

public class HashMapTest {
	public static void main(String[] arg) {
		Map<String, Double> map = new HashMap<>();
		map.put("AAPL", 140.5);
		map.put("IBM", 128.13);
		map.put("MSFT", 67.89);
		double val = map.get("AAPL") + 1;
		map.put("AAPL", val);
		//map.put("AAPL", map.get("AAPL") + 1);
		for(Map.Entry<String, Double> e : map.entrySet()) {
			System.out.println(e.getKey() + "," + e.getValue());
		}
	}
}
