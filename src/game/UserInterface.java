package game;

import java.awt.BorderLayout;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
		ImageIcon[] images = new ImageIcon[2];
		images[0] = new ImageIcon("Images/daemon.gif");
		images[1] = new ImageIcon("Images/linuxPenguin.jpeg");
		JLabel label = new JLabel(images[0]);
		panel.add(label, BorderLayout.CENTER);
		JButton button = new JButton("Change Image");
		panel.add(button, BorderLayout.SOUTH);
		window.add(panel, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea(10, 20);
		JScrollPane display = new JScrollPane(textArea);
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(display, BorderLayout.CENTER);
		window.add(panel, BorderLayout.CENTER);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		label = new JLabel("Input 1");
		panel.add(label, BorderLayout.WEST);
		JTextField input = new JTextField(15);
		input.addActionListener(new CommandListener(textArea));
		panel.add(input, BorderLayout.CENTER);
		window.add(panel, BorderLayout.SOUTH);
		
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public void print(String arg){
		textArea.append(arg + "\n");
	}

}
