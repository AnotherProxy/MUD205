package game;

public class GameController {
	
	public void parseInput(String input, GameEventHandler e, GameCharacter c){
	
		if (input.toLowerCase().equals("exit")) e.terminateWorld();
		else if (input.toLowerCase().equals("go north")) e.goNorth(c);
		else if (input.toLowerCase().equals("go south")) e.goSouth(c);
		else if (input.toLowerCase().equals("go east")) e.goEast(c);
		else if (input.toLowerCase().equals("go west")) e.goWest(c);
		else if (input.toLowerCase().equals("pick up carrot"));
		else if (input.toLowerCase().equals("pick up cheese"));
		else if (input.toLowerCase().equals("pick up apple"));
		else System.out.println("That is not a valid command.");
		
	}
	
	public String look(Room room){
		return room.getDescription();
	}

}
