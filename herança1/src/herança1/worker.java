package herança1;

public class worker extends work {
	public Double workTime;
	public int ID;

	public worker(String name, Double salario, int Tempo, Double workTime, int ID) {
		super(name, salario, Tempo);
		this.workTime = workTime;
		this.ID = ID;
	}

	public Double getWorkTime() {
		return workTime;
	}

	public void setWorkTime(Double workTime) {
		this.workTime = workTime;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String dados() {
		return "nome " + name + " Salario " + salario + " data de inicio " + Tempo + "\ntempo de trabalho por dia "
				+ workTime + " id sindicato " + ID;
	}
	public void SyndcateOut() {
		this.ID=0;
		
	}
}
