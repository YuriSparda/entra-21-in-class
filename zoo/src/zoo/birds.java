package zoo;

public class birds extends animais {
	private String cor;
	private String food;
	public birds(String raça, String nameID, String porte, String habitat, String country, String cor, String food) {
		super(raça, nameID, porte, habitat, country);
		this.cor = cor;
		this.food = food;
	}
	protected String getCor() {
		return this.cor;
	}
	protected void setCor(String cor) {
		this.cor = cor;
	}
	protected String getFood() {
		return food;
	}
	protected void setFood(String food) {
		this.food = food;
	}

}
