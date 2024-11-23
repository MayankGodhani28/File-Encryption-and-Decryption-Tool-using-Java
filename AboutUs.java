package final_project;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	public AboutUs() {
		
		Container c = this.getContentPane();
		JTextArea text = new JTextArea();
		c.add(text);
		
		text.setText("\n   This project is made by student of Maharaja Sayajirao University of baroda ( Computer Science Department)\r\n"
				+ "\r\n"
				+ "   Team member:\r\n"
				+ "   1. Brijesh Sevra\r\n"
				+ "   2. Khushal Savaliya\r\n"
				+ "   3. Mayank Godhani\r\n"
				+ "   4. Rudra Vadhadiya\r\n"
				+ "   5. Brijesh Sevra\r\n"
				+ "");
		text.setEditable(false);
		text.setLineWrap(true);
		text.setFont(new Font("Serif",Font.BOLD,20));
		text.setBackground(Color.black);
		text.setForeground(Color.white);
		//frame.setVisible(true);

	}

}
