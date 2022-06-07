package herança2;

public class cilindro extends circulo {
	public Double altura;

	public cilindro(String cor, Double raio, Double altura) {
		super(cor, raio);
		this.altura = altura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getVolume() {

		return (Math.PI * (raio * raio)) * altura;
	}

	public String dados() {
		double result = (Math.PI * (raio * raio)) * altura;
		return "cilindro de cor " + cor + " tem " + altura + " de altura e o raio é " + raio
				+ " \ncom isso o volume total desse cilindro é igual a " + String.format("%.4f", result);

	}
}
