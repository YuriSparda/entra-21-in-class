package herança1;

public class cachorro extends animal {
	public String raça;

	public cachorro(String especie, boolean homePet, double peso, String raça) {
		super(especie, homePet, peso);
		this.raça = raça;
		this.especie = especie;
		this.homePet = homePet;
		this.peso = peso;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public boolean isHomePet() {
		return homePet;
	}
	public void setHomePet(boolean homePet) {
		this.homePet = homePet;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}public String Dog() {
		if (homePet) {
			return "especie " + especie +" da raça " + raça +"\nAnimal pode ser domestico Peso = " +peso; 
			
		}else {
			return "especie " + especie +" da raça " + raça +"\nAnimal não pode ser domestico Peso = " +peso; 
			
		}
	}
	

}