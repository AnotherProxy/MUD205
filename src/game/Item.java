package game;


public class Item {
	private int location;
	private String name;
	private String description;
	private boolean isKey;

	///Getters and Setters///
	
	public int getLocation() {
		return location;
	}
	
	public Item(String name, String description){
		this.name = name;
		this.description = description;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isKey() {
		return isKey;
	}

	public void setKey(boolean isKey) {
		this.isKey = isKey;
	}
	
	public String toString() {
		return this.name;
	}

}
