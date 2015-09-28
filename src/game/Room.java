package game;

public class Room {
	private int id;
	private boolean visited;
	private String name;
	private String description = new String("");
	private String nWall = new String("");
	private String sWall = new String("");
	private String eWall = new String("");
	private String wWall = new String("");
	private Room[] exits = new Room[4];  //Create Related Functions Setters And Getters
	
	public boolean isExit(int d){
		if(exits[d] != null) return true;
		else return false;
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
	
	public String getNWall() {
		return nWall;
	}
	
	public String getSWall() {
		return sWall;
	}
	
	public String getEWall() {
		return eWall;
	}
	
	public String getWWall() {
		return wWall;
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
	
	public void setNWall(String x){
		nWall=x;
	}
	
	public void setSWall(String x){
		sWall=x;
	}
	
	public void setEWall(String x){
		eWall=x;
	}
	
	public void setWWall(String x){
		wWall=x;
	}
	
	public String toString(){ 
		return "You are in" + this.name;
	}

}
