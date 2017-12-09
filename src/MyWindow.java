import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyWindow extends JFrame{
	public MyWindow() {
		JButton b = new JButton();
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("hello");
				
			}
			
		});
		C c = new C();
		JButton b1 = new JButton();
		b1.addActionListener(c);
	}
}
class C implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	
}
