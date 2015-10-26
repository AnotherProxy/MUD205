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
		Room entrance  = new Room();
		entrance.setDescription("The entry foyer of Nico's Mom's home. \nBe sure to wipe your feet!");
		Room one = new Room();
		one.setDescription("The kitchen. \nThe only exit is back the way you came");
		Room two = new Room();
		two.setDescription("The living room. \nThe only exit is back the way you came");
		Room three = new Room();
		three.setDescription("The dining room. \nThe only exit is back the way you came");
		Room four = new Room();
		four.setDescription("The den. \nThe only exit is back the way you came");
		entrance.setExit(one, 0);
		entrance.setExit(two, 1);
		entrance.setExit(three, 2);
		entrance.setExit(four, 3);
		one.setExit(entrance, 2);
		two.setExit(entrance, 3);
		three.setExit(entrance, 0);
		four.setExit(entrance, 1);
		map[0] = entrance;
		map[1] = one;
		map[2] = two;
		map[3] = three;
		map[4] = four;
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
