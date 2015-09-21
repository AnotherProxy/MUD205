package game;

public class GameCharacter {
	private int[] stats = new int[10];
	private int mHealth = 20;
	private int cHealth = 20;
	private Item[] inventory = new Item[40];
	private int location;
	private boolean isPlayer;
	private String name =new String();
	private GameController controller = new GameController();
	
	public int[] getStats(){
		return stats;
	}
	
	public Item[] getInventory(){
		return inventory;
	}
	
	public int getLocation(){
		return location;
	}
	
	public GameController getController(){
		return controller;
	}
	
	public String getName(){
		return name;
	}
	
	public void setStat(int index, int value){
		stats[index] = value;
	}
	
	public void setController(GameController c){
		controller = c;
	}
	
	public GameCharacter(String n, boolean pc){
		name=n;
		isPlayer=pc;
	}
	
	public void setLocation(int i){
		location=i;
	}

}
