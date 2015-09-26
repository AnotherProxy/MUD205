package game;

public class GameEventHandler {
	
	public void TerminateWorld(){
		System.exit(0);
	}
	
	public void ChangeRoom(GameCharacter c, Room r1, Room r2){
		c.setLocation(r2.getID());
		System.out.println(r2.getDescription());
	}
	
	public void ExamiineN(Room r){
		System.out.println(r.getNWall());
	}
	
	public void ExamiineS(Room r){
		System.out.println(r.getSWall());
	}
	
	public void ExamiineE(Room r){
		System.out.println(r.getEWall());
	}
	
	public void ExamiineW(Room r){
		System.out.println(r.getWWall());
	}
	
	public void Exit(GameCharacter c, Room r, int d){
		if(r.isExit(d)) ChangeRoom(c, r,r.getExit(d));
		else System.out.println("You can not go that way.");
	}

}
