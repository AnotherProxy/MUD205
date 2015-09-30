package game;

import java.util.ArrayList;

public class GameCharacter {
	private int[] stats = new int[10];
	private int mHealth = 20; //max health
	private int cHealth = 20;//current health
	private ArrayList<Item> inventory = new ArrayList<Item>(40); 
	private int xCoord; //location data
	private int yCoord; //location data
	private Room location;
	private boolean isPlayer; //is player
	private String name;
	//private Item[] inventory = new Item[16];
	private GameController controller = new GameController();
	
	public GameCharacter(String n, boolean pc){
		name=n;
		setPlayer(pc);
	}
	/*
	public void pickUp(Item item) {
		inventory.add(item);
	}
	
	public void drop(Item item){
		
	if (item.isKey() == false) {
		int indexOfToBeRemoved = inventory.indexOf(item);
		inventory.remove(indexOfToBeRemoved);
		}
	else {
		System.out.println("It seems important, maybe you should hold on to it?");
		}
	
	}
	*/
	
	///NOTE THIS DOES NOT CHECK IF THE ROOMS LOOT TABLE IS FULL
	public void pickUp(Item i){
		
		inventory.add(i);
	}
	
	public void putDown(Item i){
		int locationOfI = inventory.indexOf(i);
		inventory.remove(locationOfI);
	}
	
	
	///Getters and Setters///
	
	public Room getLocation(){
		return location;
	}
	
	public int[] getStats(){
		return stats;
	}
	
	public ArrayList<Item> getInventory(){
		return inventory;
	}
	
	/*
	 public String getLocation(){
		return ""+xCoord+","+yCoord; //
	}
	*/
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
	
	public void setLocation(Room r){
		location = r;
	}
	
	/*
	public void setLocation(int x, int y){
		xCoord = x;
		yCoord = y;
		
	}
	*/

	public String toString() {
		return name;
	}

	public boolean isPlayer() {
		return isPlayer;
	}

	public void setPlayer(boolean isPlayer) {
		this.isPlayer = isPlayer;
	}

	public int getmHealth() {
		return mHealth;
	}

	public void setmHealth(int mHealth) {
		this.mHealth = mHealth;
	}

	public int getcHealth() {
		return cHealth;
	}

	public void setcHealth(int cHealth) {
		this.cHealth = cHealth;
	}
}
