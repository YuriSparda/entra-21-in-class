package herança1;

public class worker extends work {
	public Double workTime;
	public String ID;

	public worker(String name, Double salario, int tempo, Double workTime, String ID) {
		super(name, salario, tempo);
		this.workTime = workTime;
		this.ID = ID;
	}

	public Double getWorkTime() {
		return workTime;
	}

	public void setWorkTime(Double workTime) {
		this.workTime = workTime;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

}
