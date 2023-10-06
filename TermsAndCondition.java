package final_project;

import java.awt.*;
import javax.swing.*;

public class TermsAndCondition extends JFrame {
	
	public TermsAndCondition() {
		
		Container c = this.getContentPane();
		JTextArea text = new JTextArea();
		c.add(text);
		
		text.setText( "\n   1. User have to enter key before click on the buttons.\r\n"
				+ "\n   2. User can enter any Integer number as a key.\r\n"
				+ "\n   3. user can not enter 0 as a key;\r\n"
				+ "\n   4. In case of key = 0 file will not encerypt or decrypt.\r\n"
				+ "\n   5. User have to remember the key for decrypt the file.\r\n"
				+ "\n   6. If user forget key then file can not be recover in any way.\r\n"
				+ "\n   7. If user encrypt the file multiple time then user have to decrypt the file by all that key to recover the file.");
		text.setEditable(false);
		text.setLineWrap(true);
		text.setFont(new Font("Serif",Font.BOLD,20));
		text.setBackground(Color.black);
		text.setForeground(Color.white);
		
	}
}