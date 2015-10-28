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

	public void initializeWorld(){
		
	}
	
	public void generateTestMap(){
		//TEST ROOM CREATION//
		Room entrance  = new Room("The Entrance", "The entry foyer of Nico's Mom's home. \nBe sure to wipe your feet!",
									{kitchen, livingRoom, diningRoom, den});
//		entrance.setDescription(;
//		Room kitchen = new Room();
//		("The kitchen. \nThe only exit is back the way you came");
//		Room livingRoom= new Room();
//		two.setDescription("The living room. \nThe only exit is back the way you came");
//		Room diningRoom = new Room();
//		three.setDescription("The dining room. \nThe only exit is back the way you came");
//		Room den = new Room();
//		four.setDescription("The den. \nThe only exit is back the way you came");

		Room[] map = {entrance, kitchen, livingRoom, diningRoom, den};
		//TEST ROOM CREATION//
		
		//ITEM POPULATION//
		Item apple = new Item("apple", "an ordinary apple");
		Item carrot = new Item("carrot", "an ordinary carrot");
		Item cheese = new Item("chees", "the greatest object ever created");
		Equipment sword = new Equipment("Iron Sword", "A masterwork Iron Sword... Still pretty weak though", 1, "weapon");
		//entrance.addItem(sword);
		entrance.addItem(apple);
		entrance.addItem(carrot);
		entrance.addItem(cheese);
		//ITEM POPULATION//
		
		
		
		
	}
	


}
