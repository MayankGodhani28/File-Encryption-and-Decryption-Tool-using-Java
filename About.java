package final_project;

import java.awt.*;
import javax.swing.*;

public class About extends JFrame {
	public About() {
		
		Container c = this.getContentPane();
		JTextArea text = new JTextArea();
		c.add(text);
		
		text.setText("\n    1. Name of this project is encryption and decryption of file.\r\n"
				+ "\n    2. This project is made in java lenguage.\r\n"
				+ "\n    3. This project is works on java swing and java awt.\r\n"
				+ "\n    4. This project get file from user and make a byte array form input file and encrypt all the element by input          key, after encryption file will not open in any way.\r\n"
				+ "\n    5. To open the file we have to decrypt the file by same key.\r\n"
				+ "\n    6. User can encrypt the file multiple time too.\r\n");
		text.setEditable(false);
		text.setLineWrap(true);
		text.setFont(new Font("Serif",Font.BOLD,20));
		text.setBackground(Color.black);
		text.setForeground(Color.white);
		//frame.setVisible(true);
	}
}
