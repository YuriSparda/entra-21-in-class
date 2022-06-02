package herança1;

public class boss extends work {
	public int WorkerQuanty;

	public boss(String name, Double salario, int tempo, int workerQuanty) {
		super(name, salario, tempo);
		WorkerQuanty = workerQuanty;
	}

	public int getWorkerQuanty() {
		return WorkerQuanty;
	}

	public void setWorkerQuanty(int workerQuanty) {
		WorkerQuanty = workerQuanty;
	}

}
