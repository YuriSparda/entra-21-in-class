package dados;

public class endereço {
	public String rua;
	public String numero;
	public String cep;

	public endereço(String rua, String numero, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String check() {
		return " rua " + rua + " numero da casa : " + numero + " cep : " + cep;
	}

}
