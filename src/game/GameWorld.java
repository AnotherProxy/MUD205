package game;

public class GameWorld {
	private Room[] map = new Room[5];
	private GameCharacter[] characterList = new GameCharacter[3];
	private Item[] itemList = new Item[100];
	
	
	
	
	///Getters and Setters///
	
	public Room[] getMap() {
		return map;
	}
	
	public GameCharacter[] getCharacterList(){
		return characterList;
	}
	
	public Item[] getItemList(){
		return itemList;
	}

	public void InitializeWorld(){
		
		
	}
	


}
