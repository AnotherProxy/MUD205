package game;

public class Room {
	private int id;
	private boolean visited;
	private String name;
	private String description = new String("");
	private Room[] exits = new Room[4];  //Create Related Functions Setters And Getters
	
	public boolean isExit(int d){
		if(exits[d] != null) return true;
		else return false;
	}
	
	public Room(String n, String d, Room[] e){
		name = n;
		description = d;
		exits = e;
	}
	
	///Getters and Setters///
	
	public int getID(){
		return id;
	}
	
	public Room getExit(int i){
		return exits[i];
	}
	
	public Room[] getExitList(){
		return exits;
	}
	
	public boolean getVisited(){
		return visited;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setID(int x){
		id=x;
	}
	
	public void setVisited(boolean x){
		visited=x;
	}
	
	public void setDescription(String x){
		description=x;
	}

	public String toString(){ 
		return "You are in" + this.name;
	}

}
