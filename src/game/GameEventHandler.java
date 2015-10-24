package game;

public class GameEventHandler {
	
	public void terminateWorld(){
		System.exit(0);
	}
	
	//ITEM MANAGEMENT
	
	public void pickUp(GameCharacter c, Item i){
		if (c.getLocation().hasItem(i)){
			c.pickUp(i);
			c.getLocation().removeItem(i);
		}
	}
	
	public void putDown(GameCharacter c, Item i){
		if (c.getLocation().hasItem(i)){
			c.putDown(i);
			c.getLocation().removeItem(i);
		}
	}
	
	///MOVEMENT
	public String goNorth(GameCharacter c){
		if (c.getLocation().isExit(0)){
			c.setLocation(c.getLocation().getExit(0));
			c.getLocation().setVisited(true);
			return(c.getLocation().getDescription());
		}
		else {
			return("You can not go that way.");
			//System.out.println(c.getLocation().getDescription());
		}
	}
	
	public String goEast(GameCharacter c){
		if (c.getLocation().isExit(1)){
			c.setLocation(c.getLocation().getExit(1));
			c.getLocation().setVisited(true);
			return (c.getLocation().getDescription());
		}
		else {
			return ("You can not go that way.");
			//System.out.println(c.getLocation().getDescription());
		}
	}
	
	public String goSouth(GameCharacter c){
		if (c.getLocation().isExit(2)){
			c.setLocation(c.getLocation().getExit(2));
			c.getLocation().setVisited(true);
			return (c.getLocation().getDescription());
		}
		else {
			return ("You can not go that way.");
			//System.out.println(c.getLocation().getDescription());
		}
	}
	
	public String goWest(GameCharacter c){
		if (c.getLocation().isExit(3)){
			c.setLocation(c.getLocation().getExit(3));
			c.getLocation().setVisited(true);
			return(c.getLocation().getDescription());
		}
		else {
			return("You can not go that way.");
			//System.out.println(c.getLocation().getDescription());
		}
	}
	///MOVEMENT

}
