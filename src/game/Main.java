package game;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	
	private static GameWorld world = new GameWorld();
	private static GameEventHandler tom = new GameEventHandler();
	private static Scanner input = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		world.generateTestMap();
		System.out.println("Welcome to Nico's mom's house!");
		System.out.println("What is your name?");
		String n = new String(input.next());
		GameCharacter player = new GameCharacter(n, true);
		player.setLocation(world.getMap()[0]);
		System.out.println("Hello, " + player.getName());
		System.out.println(player.getLocation().getDescription());
		
		
		
		while (true) {
			player.getController().parseInput(input.nextLine(), tom, player);
			//System.out.println(input.next());
		}
		
		
	}

}
