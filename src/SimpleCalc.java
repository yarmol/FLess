import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
		//Model model 	 = Model.getModel();
		
		//set layout
		buttonPanel.setLayout(new GridLayout(4,4));
		
			
		//monitor element
		JTextField monitor = new JTextField();
		monitor.setSize(50, 200);
		monitor.setColumns(25);
		
		monitorPanel.add(monitor);
		
		//BorderLayout mainBorderLayout =;
		//mainLayout.addLayoutComponent(monitorPanel, BorderLayout.NORTH);
		//mainLayout.addLayoutComponent(buttonPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout());
	
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
		mainPanel.setSize(500, 500);
		mainPanel.add(monitorPanel, BorderLayout.NORTH);
		mainPanel.add(buttonPanel, BorderLayout.CENTER);
		
		mainFrame.setContentPane(mainPanel);
		mainFrame.setSize(500, 500);
		//mainFrame.setLayout(new FlowLayout());
		mainFrame.setVisible(true);
	
	}
	
}
