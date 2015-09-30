package game;


public class Item {
	private Room location;
	private String name;
	private String description;
	private boolean isKey;

	///Getters and Setters///
	
	public Room getLocation() {
		return location;
	}
	
	public Item(String n, String d){
		name = n;
		description = d;
	}

	public void setLocation(Room l) {
		location = l;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String d) {
		description = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public boolean isKey() {
		return isKey;
	}

	public void setKey(boolean b) {
		isKey = b;
	}
	
	public String toString() {
		return this.name;
	}

}
