package dados;

import java.time.LocalDate;

public class pessoa {

	public String name;
	public String id;
	public endere�o local;
	public LocalDate dataIngr;
	public LocalDate dataNasc;

	public pessoa(String name, String id, endere�o local, LocalDate dataIngr, LocalDate dataNasc) {
		super();
		this.name = name + " duke licia";
		this.id = id;
		this.local = local;
		this.dataIngr = dataIngr;
		this.dataNasc = dataNasc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public endere�o getLocal() {
		return local;
	}

	public void setLocal(endere�o local) {
		local.check();
	}

	public LocalDate getDataIngr() {
		return dataIngr;
	}

	public void setDataIngr(LocalDate dataIngr) {
		this.dataIngr = dataIngr;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

}
