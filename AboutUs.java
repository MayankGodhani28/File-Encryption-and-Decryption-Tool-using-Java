package final_project;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	public AboutUs() {
		
		Container c = this.getContentPane();
		JTextArea text = new JTextArea();
		c.add(text);
		
		text.setText("\n   This project is made by student of Maharaja Sayajirao univercity of baroda ( Computer science Department)\r\n"
				+ "\r\n"
				+ "   Team member:\r\n"
				+ "   1. Soham Zadafiya (Team Leader)\r\n"
				+ "   2. Om Mistri\r\n"
				+ "   3. Dhruv Dhanani\r\n"
				+ "   4. Krish Kheni\r\n"
				+ "");
		text.setEditable(false);
		text.setLineWrap(true);
		text.setFont(new Font("Serif",Font.BOLD,20));
		text.setBackground(Color.black);
		text.setForeground(Color.white);
		//frame.setVisible(true);

	}

}
