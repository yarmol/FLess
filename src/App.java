import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		JTextField formDescrPath = new JTextField(25);
		formDescrPath.setSize(50, 200);
	//	formDescrPath.setColumns(5);
		
		JFrame mainFrame = new JFrame();
		
		JPanel pan = new JPanel();
		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton but1 = new JButton("Click me");
		but1.setSize(50, 100);
		pan.add(but1);
		pan.add(formDescrPath);
		//String fileName = "";
		ActionListener buttonEvent = (e) ->  {
			 JFileChooser chooser = new JFileChooser();
			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "v7 form file", "frm");
			    chooser.setFileFilter(filter);
			    int returnVal = chooser.showOpenDialog(mainFrame);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			       //System.out.println("You chose to open this file: " +
			       String fileName = chooser.getSelectedFile().getAbsolutePath();
			       System.out.println("You chose to open this file: " +fileName);
			       formDescrPath.setText(fileName);
			       
			       try {
					Parser p = new Parser(fileName);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    }
		}; 
		
		//if (!fileName.isEmpty()) {
		//	
		//}
			
		

		
		
		but1.addActionListener(buttonEvent);
		
		
		
		
		mainFrame.setSize(500,500);
		mainFrame.setContentPane(pan);
		mainFrame.setVisible(true);
		
		
	}

}
