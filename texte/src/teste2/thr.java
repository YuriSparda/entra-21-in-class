package teste2;

public class thr extends sec{
	private Double salary;

	public thr(int num, String name, Double salary) {
		super(num, name);
		this.salary = salary;
	}
	public String lista () {
		
		return "name " + name + " age "+ num + " salary " + salary;
		
	}
	public void zerar() {
		this.num = 0;
		this.salary=0.0;
		this.name="zerado";
	}
}
