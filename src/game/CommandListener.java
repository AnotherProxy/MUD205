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
		String s = source.getText();
		out.append(s + "\n");
		source.setText("");
		
		
		String command = null;
		String command2 = null;
		
		
		if (s.contains(" ")){ //if command input (ie 'move north' or 'inventory') contains a space then separate them into two variables
			command = s.substring(0,s.indexOf(' '));		//sets command to be the first word in the command input. (ie in 'move north' move would be command)				
			command2 = s.substring(s.indexOf(' ')+1,s.length());//sets the variable to be command2 (ie 'move north', north would be command2)	
			}
		else{ //if it's a one word input (ie 'inventory' or 'exit' then set command to be the entire input.)
			command = s;
		}
		
		
	}

}
