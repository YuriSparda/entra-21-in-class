package exer2;

import java.time.LocalDate;

public class age {

	private  String name;
	private  LocalDate date;
	public age(String name, LocalDate date) {
		super();
		this.name = name;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	

}
