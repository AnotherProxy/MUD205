package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CommandListener implements ActionListener {

	private JTextArea out;
	
	public CommandListener(JTextArea out){
		
		this.out = out;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField source = (JTextField) e.getSource();
		String command = source.getText();
		out.append(command);
		source.setText("");
		
	}

}
