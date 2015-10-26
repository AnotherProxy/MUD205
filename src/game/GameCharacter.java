package game;

import java.util.ArrayList;

public class GameCharacter {
	
	private Equipment armor;
	private Equipment weapon;
	
	private int armorClass;
	
	private int mHealth = 20; //max health
	private int cHealth = 20;//current health

	private ArrayList<Item> inventory; 

	private Room location;
	
	private boolean isPlayer; //is player
	private String name;
	//private Item[] inventory = new Item[16];
	private GameController controller = new GameController();
	
	public GameCharacter(String n, boolean pc){
		name=n;
		setPlayer(pc);
	}

	
	public void pickUp(Item i){
		if (this.getLocation().hasItem(i))
		{
			inventory.add(i);
			this.getLocation().removeItem(i);
		}
		else
			System.out.println("...I don't see any");
	}
	
	public void putDown(Item i){
		if (i.isKey())
			System.out.println("Maybe you should hold onto that");
		else
			inventory.remove(i);
	}
	
	
	///Getters and Setters///
	
	public Room getLocation(){
		return location;
	}
	
	public ArrayList<Item> getInventory(){
		return inventory;
	}
	
	public GameController getController(){
		return controller;
	}
	
	public String getName(){
		return name;
	}
	
	public void setController(GameController c){
		controller = c;
	}
	
	public void setLocation(Room r){
		location = r;
	}
	

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


	public Equipment getArmor() {
		return armor;
	}


	public void setArmor(Equipment armor) {
		this.armor = armor;
	}


	public Equipment getWeapon() {
		return weapon;
	}


	public void setWeapon(Equipment weapon) {
		this.weapon = weapon;
	}


	public int getArmorClass() {
		return armorClass;
	}


	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
}
