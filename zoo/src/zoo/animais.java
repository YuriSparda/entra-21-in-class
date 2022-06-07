package zoo;

public class animais {
	protected String raça;
	protected String nameID;
	protected String porte;
	protected String habitat;
	protected String country;
	public animais(String raça, String nameID, String porte, String habitat, String country) {
		super();
		this.raça = raça;
		this.nameID = nameID;
		this.porte = porte;
		this.habitat = habitat;
		this.country = country;
	}
	protected String getRaça() {
		return raça;
	}
	protected void setRaça(String raça) {
		this.raça = raça;
	}
	protected String getNameID() {
		return nameID;
	}
	protected void setNameID(String nameID) {
		this.nameID = nameID;
	}
	protected String getPorte() {
		return porte;
	}
	protected void setPorte(String porte) {
		this.porte = porte;
	}
	protected String getHabitat() {
		return habitat;
	}
	protected void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	protected String getCountry() {
		return country;
	}
	protected void setCountry(String country) {
		this.country = country;
	}

}
