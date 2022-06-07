package dados;

import java.time.LocalDate;

public class aluno extends pessoa {
	public int ano;
	public LocalDate dataForm;

	public aluno(String name, String id, endereço local, LocalDate dataIngr, LocalDate dataNasc, int ano,
			LocalDate dataForm) {
		super(name, id, local, dataIngr, dataNasc);
		this.ano = ano;
		this.dataForm = dataForm;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public LocalDate getDataForm() {
		return dataForm;
	}

	public void setDataForm(LocalDate dataForm) {
		this.dataForm = dataForm;
	}

	public void sair() {
		this.ano = 0;
	}

}
