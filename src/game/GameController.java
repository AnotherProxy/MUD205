package game;

import java.util.Scanner;

public class GameController {
	
	String firstWord;
	String secondWord;
	
	public void parseInput(String input, GameEventHandler e, GameCharacter c){

		Scanner sC = new Scanner(input);
		
		firstWord = sC.next();
		
		if (firstWord.toLowerCase().equals("exit")) e.terminateWorld();
		
		else if (firstWord.toLowerCase().equals("go")) {
			secondWord = sC.next();
			if (secondWord.toLowerCase().equals("north")) e.goNorth(c);
			else if (secondWord.toLowerCase().equals("south")) e.goSouth(c);
			else if (secondWord.toLowerCase().equals("east")) e.goEast(c);
			else if (secondWord.toLowerCase().equals("west")) e.goWest(c);
		}
		
		else {System.out.println("SPEAK UP SONNY I CANT HEAR YOU");}
		
		
		
	}
	
	public String look(Room room){
		return room.getDescription();
	}

}
