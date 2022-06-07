package dados;

import java.time.LocalDate;

public class funcionario extends pessoa {
	public double cargaH;
	public double salario;

	public funcionario(String name, String id, endereço local, LocalDate dataIngr, LocalDate dataNasc, double cargaH,
			double salario) {
		super(name, id, local, dataIngr, dataNasc);
		this.cargaH = cargaH;
		this.salario = salario;
	}

	public double getCargaH() {
		return cargaH;
	}

	public void setCargaH(double cargaH) {
		this.cargaH = cargaH;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void cargaPlus(double cargaPorc) {
		this.cargaH += ((cargaPorc / 100) * this.cargaH);
	}

	public void cargaLess(double cargaPorc) {
		this.cargaH -= ((cargaPorc / 100) * this.cargaH);
	}

	public void demitir() {
		System.out.println("foi demitido");
		this.name = "se demitiu";
		this.salario = 0.0;
		this.cargaH = 0.0;

	}

}
