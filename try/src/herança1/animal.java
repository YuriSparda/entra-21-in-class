package herança1;

public class animal {
	protected String especie;
	protected boolean homePet;
	protected double peso;
	public animal(String especie, boolean homePet, double peso) {
		this.especie = especie;
		this.homePet = homePet;
		this.peso = peso;
	}public String petSond() {
		if (especie.equals("Canina")) {
		return "auau" ;
		}else {
			return "error";
		}
		
	}
}

