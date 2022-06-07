package zoo;

public class cats extends animais {
	private String pelo;
	private String manchas;
	public cats(String raça, String nameID, String porte, String habitat, String country, String pelo, String manchas) {
		super(raça, nameID, porte, habitat, country);
		this.pelo = pelo;
		this.manchas = manchas;
	}
	protected String getPelo() {
		return pelo;
	}
	protected void setPelo(int num) {
		String exep="oi";
		if (num==1) {
			this.pelo="marrom";
		}else if (num==2) {
			pelo="preto";
		}
	}
	protected String getManchas() {
		return manchas;
	}
	protected void setManchas(String manchas) {
		this.manchas = manchas;
	}
	
	
}
