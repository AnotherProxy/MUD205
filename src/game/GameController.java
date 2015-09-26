package game;

public class GameController {
	
	public void parseInput(String input, GameEventHandler e){
	
		if (input.equals("exit")) game.Exit.exit();
		
	}
	
	public String look(Room room){
		return room.getDescription();
	}

}
