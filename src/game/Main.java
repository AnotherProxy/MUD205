package game;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	
	private static GameWorld world = new GameWorld();
	private static GameEventHandler tom = new GameEventHandler();
	private static Scanner input = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		world.generateTestMap();
		UserInterface ui = new UserInterface();
		ui.print("Welcome to Nico's mom's house!");
		ui.print("What is your name?");
		String n = new String(input.next());
		GameCharacter player = new GameCharacter(n, true);
		player.setLocation(world.getMap()[0]);
		ui.print("Hello, " + player.getName());
		ui.print(player.getLocation().getDescription());
		
		
		
		while (true) {
			player.getController().parseInput(input.nextLine(), tom, player);
			//ui.print(input.next());
		}
		
		
	}

}
