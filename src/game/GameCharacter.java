package game;

import java.util.ArrayList;

public class GameCharacter {
	private int[] stats = new int[10];
	private int mHealth = 20;
	private int cHealth = 20;
	//private Item[] inventory = new Item[40];
	private ArrayList<Item> inventory = new ArrayList<Item>(40);
	private int location;
	private boolean isPlayer;
	private String name =new String();
	private GameController controller = new GameController();
	
	public GameCharacter(String n, boolean pc){
		name=n;
		isPlayer=pc;
	}
	
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
	
	///Getters and Setters///
	
	public int[] getStats(){
		return stats;
	}
	
	public ArrayList<Item> getInventory(){
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
	
	public void setLocation(int i){
		location=i;
	}

	public String toString() {
		return name;
	}
}
