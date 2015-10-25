package game;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UserInterface {
	
	private JTextArea oWindow = new JTextArea(10, 20);
	
	public UserInterface(){
		
		//Application Window Construction
		JFrame window = new JFrame();
		window.setSize(900, 900);
		
		// This panel will hold the output display JTextArea object.
		//JTextArea oWindow = new JTextArea(10, 20);
		JScrollPane display = new JScrollPane(oWindow);
		JLabel label = new JLabel("Display");
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(display, BorderLayout.NORTH);
		panel.add(label, BorderLayout.WEST);
		window.add(panel, BorderLayout.CENTER);
		
		// This Panel will hold one of the input JTextField objects.
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		label = new JLabel("Input 1");
		panel.add(label, BorderLayout.NORTH);
		JTextField input = new JTextField(15);
		input.addActionListener(new CommandListener(oWindow));
		panel.add(input, BorderLayout.CENTER);
		window.add(panel, BorderLayout.SOUTH);
		
		// Finish preparing the window and display it.
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public void print(String arg){
		oWindow.append(arg + "\n");
	}

}
