import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class GUITemplate extends JPanel {

	public GUITemplate() {
		super();
		setBackground(Color.white);
		setPreferredSize(new Dimension(500,500));
	}
	
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		// YOUR CODE HERE!
		int init = 50;
		int w_h = 50;
		pen.fillRect(init,init,w_h,w_h);
		helperFiller(init, init, w_h, pen, 0);
	}
	
	// DO YOU NEED A HELPER METHOD?
	public void helperFiller(int x, int y, int w_h, Graphics pen) {		
		pen.fillRect(x - w_h, y - w_h, w_h, w_h);
		if (x - w_h < 0 || y - w_h < 0 || )
			return;
		else
		helperFiller(x - w_h, y - w_h, w_h, pen);
		pen.fillRect(x - w_h, y + w_h, w_h, w_h);
		if (x - w_h < 0 || y + w_h > 450)
			return;
		else
		helperFiller(x - w_h, y + w_h, w_h, pen);
		pen.fillRect(x + w_h, y - w_h, w_h, w_h);
		if (x + w_h > 450 || y - w_h < 0)
			return;
		else
		helperFiller(x + w_h, y - w_h, w_h, pen);
		pen.fillRect(x + w_h, y + w_h, w_h, w_h);
		if (x + w_h > 450 || y + w_h > 450)
			return;
		else 
		helperFiller(x + w_h, y + w_h, w_h, pen);
	}
	
	public static void main(String[] args) {
		GUITemplate panel = new GUITemplate();
	
		JFrame frame = new JFrame("GUI Program");
		frame.getContentPane().add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
