package herança1;

public class boss extends work {
	public int WorkerQuanty;

	public boss(String name, Double salario, int Tempo, int workerQuanty) {
		super(name, salario, Tempo);
		WorkerQuanty = workerQuanty;
	}

	public int getWorkerQuanty() {
		return WorkerQuanty;
	}

	public void setWorkerQuanty(int workerQuanty) {
		WorkerQuanty = workerQuanty;
	}

	public void setDoubleSalary() {
		this.salario = salario * 2;
	}public String getDates() {
		return "nome : "+ name + " salario : "+ salario + " data de inicio : " + Tempo + " quantidade de subordinados :"+WorkerQuanty;
	}

}
