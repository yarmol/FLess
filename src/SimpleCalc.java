import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;


public class SimpleCalc  {
	
	
	
	SimpleCalc(){
		
		JFrame mainFrame = new JFrame();
		JPanel mainPanel 		= new JPanel();
		JPanel buttonPanel 	 	= new JPanel();
		JPanel monitorPanel 	 = new JPanel();
		Model model 	 = Model.getModel();
		
		//set layout
		GridLayout buttonGrid = new GridLayout(4,4);
		buttonPanel.setLayout(buttonGrid);
		
			
		//monitor element
		JTextField monitor = new JTextField();
		monitor.setSize(50, 200);
		monitor.setColumns(25);
		
		monitorPanel.add(monitor);
		
		BorderLayout mainLayout = new BorderLayout();
		mainLayout.addLayoutComponent(monitorPanel, BorderLayout.NORTH);
		mainLayout.addLayoutComponent(buttonPanel, BorderLayout.CENTER);
		mainPanel.setLayout(mainLayout);
	
		//defining buttons 
		String simpleButtonOps = "1234567890./*-+=";
		ArrayList<String> s = new ArrayList<>();
		String[] buttonOps = new String[simpleButtonOps.length()];
		int i = 0;
		for (char ch : simpleButtonOps.toCharArray()) {
			buttonOps[i] = String.valueOf(ch);
			++i;
		}
		
	 	
		CalcBuilder cb = new CalcBuilder(buttonOps,buttonPanel);
		mainFrame.setContentPane(mainPanel);
		mainFrame.setVisible(true);
	
	}
	
}
