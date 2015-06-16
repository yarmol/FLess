import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class CalcBuilder  {
	
	class ButtonClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton srcButton = (JButton)e.getSource();
			System.out.println(srcButton.getText());
		}
		
	}
	

	CalcBuilder(String[] arrayOfOps, JPanel destinationPanel) {
		
		for(String buttonDescr : arrayOfOps) {

			JButton b = new JButton();
			b.setSize(50, 50);
			b.setText(buttonDescr);
			b.addActionListener(new ButtonClick());
			destinationPanel.add(b);
		}
		
	}

}
