package game;

public class Room {
	private int id;
	private boolean visited;
	private Item[] loot = new Item[5];
	private String name;
	private String description = new String("");
	private Room[] exits = new Room[4];  //Create Related Functions Setters And Getters
	
	public boolean isExit(int d){
		if(exits[d] != null) return true;
		else return false;
	}
	
	public Room(){
		//creates empty room
	}
	
	public Room(String n, String d, Room[] e){
		//creates room with a name, description, and exits, contains no exits.
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
	
	public void setExit(Room r, int i){
		exits[i] = r;
	}
	
	public boolean hasItem(Item i){
		for (int j = 0; j < loot.length; j++){
			if (i == loot[j]){
				return true;
			}
		}
		return false;
	}
	
	public void addItem(Item i){
		for (int j = 0; j < loot.length; j++){
			if (loot[j] == null){
				loot[j] = i;
				break;
			}
		}
		System.out.println("You can not drop that, there is no more space.");
	}
	
	public void removeItem(Item i){
		for (int j = 0; j < loot.length; j++){
			if (i == loot[j]){
				loot[j] = null;
				break;
			}
		}
	}

}
