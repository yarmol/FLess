import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;


public class SimpleCalc  {
	
	
	
	SimpleCalc(){
		
		JFrame mainFrame = new JFrame();
		JPanel buttonPanel 	 	= new JPanel();
		JPanel monitorPanel 	 = new JPanel();
		Model model 	 = Model.getModel();
		
		//set layout
		GridLayout buttonGrid = new GridLayout(4,4);
		buttonPanel.setLayout(buttonGrid);
		
		//defining buttons 
		String simpleButtonOps = "1234567890./*-+";
		ArrayList<String> s = new ArrayList<>();
		String[] buttonOps;
		Arrays.asList(simpleButtonOps.toCharArray()).forEach((ñ) -> buttonOps.add(c));	
	 	
		CalcBuilder cb = new CalcBuilder(buttonOps,buttonPanel);
		mainFrame.setContentPane(buttonPanel);
		mainFrame.setVisible(true);
	
	}
	
}
