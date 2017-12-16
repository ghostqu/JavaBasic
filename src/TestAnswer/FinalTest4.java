package TestAnswer;

import java.awt.event.*;
import javax.swing.*;

public class FinalTest4 {

}
class MyWindow {
	public MyWindow() {
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
			}
		});
		JButton b2 = new JButton();
		b2.addActionListener(new MyActionListener());
	}
	static class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("hello");
		}
	}
}
/*Because non-static inner classes also have access to 
 *their containing classes data members and methods, 
 *which means you are allocating a Pointer instance 
 *that basically extends the superclass. In the case of 
 *non-static inner classes you are not extending the containing class.
 */