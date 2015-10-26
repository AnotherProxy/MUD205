package game;



public class Equipment extends Item {
	
	private int d6;
	private int acMod;
	private String equipType;
	
	public Equipment(String n, String d, int attribute1, int attribute2, String type) {
		super(n, d);
		if (type.toLowerCase() == "armor"){
			this.setEquipType("armor");
			this.acMod = attribute1;
		}
		else {
			this.setEquipType("weapon");
			this.d6 = attribute1;
		}
	}



	public int getD6() {
		return d6;
	}

	public void setD6(int d6) {
		this.d6 = d6;
	}

	public int getAcMod() {
		return acMod;
	}

	public void setAcMod(int acMod) {
		this.acMod = acMod;
	}

	public String getEquipType() {
		return equipType;
	}

	public void setEquipType(String equipType) {
		this.equipType = equipType;
	}

	
	///Getters and Setters///
	
	
	
}
