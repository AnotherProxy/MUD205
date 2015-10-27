package game;

import java.awt.BorderLayout;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class UserInterface {
	
	private JTextArea textArea = new JTextArea(10, 20);
	private JTextArea consoleOut = new JTextArea(10, 20);
	
	public UserInterface(){
		
		//Application Window Construction
		JFrame window = new JFrame();
		window.setSize(900, 900);
		window.setLayout(new BorderLayout());
		window.setTitle("Howdy Bitch");
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		

		
	}
	
	public void print(String arg){
		textArea.append(arg + "\n");
	}

}
