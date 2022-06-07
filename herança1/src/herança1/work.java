package herança1;

public class work {
	
	public Double salario;
	public int Tempo;
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public int getTempo() {
		return Tempo;
	}

	public void setTempo(int tempo) {
		Tempo = tempo;
	}

	public work(String name, Double salario, int Tempo) {
		this.name = name;
		this.salario = salario;
		this.Tempo = Tempo;
	}

}
