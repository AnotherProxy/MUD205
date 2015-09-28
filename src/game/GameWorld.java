package game;

public class GameWorld {
	Room[][] map = new Room[5][5];

	private GameCharacter[] characterList = new GameCharacter[3];
	private Item[] itemList = new Item[100];
	
	
	
	
	///Getters and Setters///
	
	public Room[][] getMap() {
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
