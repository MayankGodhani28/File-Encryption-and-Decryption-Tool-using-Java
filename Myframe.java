package final_project;

import final_project.About;
import final_project.AboutUs;
import final_project.TermsAndCondition;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.net.URL;

public class Myframe extends JFrame implements ActionListener{
	
    Container c;
    JButton button,encrypt,decrypt,about,aboutus,tc;
    JTextField textfield;
    JLabel label,label1;
    JTextArea t1,t2;
    Cursor cur;
    
    static  JFileChooser fileChooser;
  	static File file ;
  	
  	
    public Myframe(){
    	
        c = this.getContentPane();
        c.setLayout(null);
        Font font = new Font("Roboto",Font.BOLD,20);

        URL url1 = this.getClass().getResource("image1.jpeg");
        URL url2 = this.getClass().getResource("finalimage.png");
     
        ImageIcon icon = new ImageIcon(url1);
    
        label = new JLabel(icon);
        label.setBounds(10,10,icon.getIconWidth(),icon.getIconHeight());
        label.setFont(font);
     
      
        ImageIcon icon1 = new ImageIcon(url2);

        label1 = new JLabel(icon1);
        label1.setBounds(-285,70,icon.getIconWidth(),icon.getIconHeight());
        label1.setFont(font);
  
    

        textfield = new JTextField();
        textfield.setBounds(282,450,120,27);
        textfield.setFont(font);
        textfield.setForeground(Color.white);
        textfield.setBackground(Color.BLACK);
        c.add(textfield);
            

        Font f = new Font("Roboto",Font.BOLD,20);
        Font f1 = new Font("Arial",Font.BOLD,15);
        
        t1 = new JTextArea();
        t1.setText("NOTE :  PLEASE  READ  THE  TERMS  AND  CONDITIONS  CAREFULLY  BEFORE  RUN  THE  PROGRAM.");
        t1.setBounds(150,700,850,30);
        t1.setFont(f1);
        t1.setForeground(Color.green);
        t1.setBackground(Color.BLACK);
        t1.setEditable(false);
        c.add(t1);
        
        t2 = new JTextArea("ENTER KEY");
        t2.setBounds(160,450,140,30);
        t2.setForeground(Color.WHITE);
        t2.setBackground(Color.BLACK);
        t2.setFont(f);
        t2.setEditable(false);
        c.add(t2);
        
        c.setBackground(Color.black);


        encrypt = new JButton();
        encrypt.setText("ENCRYPT");
        encrypt.setBounds(130,490,150,30);
        encrypt.setFont(f);
        encrypt.setForeground(Color.white);
        encrypt.setBackground(Color.black);
        c.add(encrypt);
        encrypt.addActionListener(this);

        decrypt = new JButton();
        decrypt.setText("DECRYPT");
        decrypt.setBounds(330,490,150,30);
        decrypt.setFont(f);
        decrypt.setForeground(Color.white);
        decrypt.setBackground(Color.black);
        c.add(decrypt);
        decrypt.addActionListener(this);

       about = new JButton();
       about.setText("About");
       about.setBounds(150,730,180,20);
       about.setFont(f1);
       about.setForeground(Color.cyan);
       about.setBackground(Color.black);
       c.add(about);
       about.addActionListener(this);

       aboutus = new JButton();
       aboutus.setText("About us");
       aboutus.setBounds(500,730,180,20);
       aboutus.setFont(f1);
       aboutus.setForeground(Color.CYAN);
       aboutus.setBackground(Color.black);
       c.add(aboutus);
       aboutus.addActionListener(this);

       tc = new JButton();
       tc.setText("Term and Condition");
       tc.setBounds(800,730,180,20);
       tc.setFont(f1);
       tc.setForeground(Color.CYAN);
       tc.setBackground(Color.BLACK);
       c.add(tc);
       tc.addActionListener(this);

      
       c.add(label1);
       c.add(label);

    }
    
    
    public void actionPerformed(ActionEvent e){
    
         if(e.getSource()==encrypt || e.getSource()==decrypt){
            System.out.println("button clicked");
            String text= textfield.getText();
            try {
            	int temp = Integer.parseInt(text);
            	 operator(temp);
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Please enter Integer number only");
			}
            
         }
        
         if(e.getSource()==about){
        	 About ab = new About();
        	 ab.setBounds(200, 100, 950, 600);
        	 ab.setTitle("ABOUT");
        	 ab.setResizable(false);
        	 ab.setVisible(true);
         }
         
         if(e.getSource()==aboutus){
        	 AboutUs as = new AboutUs();
        	 as.setBounds(200, 100, 950, 600);
        	 as.setTitle("ABOUT US");
        	 as.setResizable(false);
        	 as.setVisible(true);
         }
         
         if(e.getSource()==tc){
        	 TermsAndCondition tc = new TermsAndCondition();
        	 tc.setBounds(200, 100, 950, 600);
        	 tc.setTitle("TERM AND CONDITION");
        	 tc.setResizable(false);
        	 tc.setVisible(true);
         }

    }
  
    
    
    public static void operator(int key){

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
    
   
        try
        {
            FileInputStream fis = new FileInputStream(file);

            byte []data = new byte[fis.available()];
            fis.read(data);
            
            // data[0] = (byte)(data[0]^key);
             int i = 0;
            for(byte b : data) {
            	data[i] = (byte)(b^key);
            	i++;
            }
            
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "done");
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
