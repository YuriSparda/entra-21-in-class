package heran�a1;

public class cachorro extends animal {
	public String ra�a;

	public cachorro(String especie, boolean homePet, double peso, String ra�a) {
		super(especie, homePet, peso);
		this.ra�a = ra�a;
		this.especie = especie;
		this.homePet = homePet;
		this.peso = peso;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
			return "especie " + especie +" da ra�a " + ra�a +"\nAnimal pode ser domestico Peso = " +peso; 
			
		}else {
			return "especie " + especie +" da ra�a " + ra�a +"\nAnimal n�o pode ser domestico Peso = " +peso; 
			
		}
	}
	

}