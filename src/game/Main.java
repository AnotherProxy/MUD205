package game;

import java.util.ArrayList;
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
		
		
		
		ArrayList<Item> inventory = new ArrayList<Item>(40);
		
		Item tango = new Item("Tango", "Ballroom dance");
		Item bango = new Item("bango", "Ballsroom pants");
		Item im = new Item("Meeseeks", "Howdy");
		Item alex = new Item("RIP", "LOL");
		
		inventory.add(alex);
		inventory.add(bango);
		inventory.add(im);
		inventory.add(tango);
		
		int indexOfToBeRemoved = inventory.indexOf(tango);
		inventory.remove(indexOfToBeRemoved);
		
		System.out.println(inventory);
		
		
	}

}
