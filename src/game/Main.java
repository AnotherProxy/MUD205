package game;

import java.util.Scanner;

public class Main {
	
	private GameWorld world = new GameWorld();
	private GameEventHandler tom = new GameEventHandler();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Welcome to Nico's mom's house!");
		System.out.println("What is your name?");
		String n = new String(input.next());
		GameCharacter player = new GameCharacter(n, true);
		System.out.println("Hello, " + player.getName());
		
		
		
		
		
		
		
		

	}

}
