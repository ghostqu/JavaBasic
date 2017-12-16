package TestAnswer;

import java.awt.event.*;
import java.util.*;

public class FinalTest5 {
	public static void main(String[] arg) {
		// a
		ActionListener[] a = new ActionListener[3];
		a[0] = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("One");
			}
		};
		a[1] = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Two");
			}
		};
		a[2] = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Three");
			}
		};
		a[2].actionPerformed(null);
		// b
		List<Integer> ls = new ArrayList<>();
		for(int i = 1; i <= 1000; i++) {
			ls.add(i);
		}
		for(int i = 0; i < 500; i++) {
			ls.remove(500);
		}
		ls.add(2000);
		for(Integer e : ls) {
			System.out.print(e + " ");
		}
		// c.1
		Map<String, ActionListener> map = new HashMap<>();
		map.put("A", new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("A");
			}
		});
		map.put("B", new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("B");
			}
		});
		System.out.println();
		//c.2
		ActionListener e = new MyActionListener("A");
		e.actionPerformed(null);
		
	}
	static class MyActionListener implements ActionListener {
		private String s;
		public MyActionListener(String s) {
			this.s = s;
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println(s);
		}
	}
}
