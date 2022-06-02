
public class infos {
	public int ID;
	private String Name;
	private int quantity;
	public infos( int ID, String Name, int quantity) {
		this.ID = ID;
		this.Name = Name;
		this.quantity=quantity;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
		

}
