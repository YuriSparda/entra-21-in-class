package herança3;

public class notebook extends computer {
	private double peso;

	public notebook(int ram, int storage, boolean keyBoard, double peso) {
		super(ram, storage, keyBoard);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public boolean isKeyBoard() {
		return keyBoard;
	}

	public void setKeyBoard(boolean keyBoard) {
		this.keyBoard = keyBoard;
	}

	public Boolean ehPesado() {
		if (peso >= 3) {
			return true;
		} else {
			return false;
		}
	}

	public String tecla() {
		if (keyBoard) {
			return "Sim";
		} else {
			return "Não";
		}
	}
}
