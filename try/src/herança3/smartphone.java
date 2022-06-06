package herança3;

public class smartphone extends computer {
	private int selfies;

	public smartphone(int ram, int storage, boolean keyBoard, int selfies) {
		super(ram, storage, keyBoard);
		this.selfies = selfies;
	}

	public int getSelfies() {
		return selfies;
	}

	public void setSelfies(int selfies) {
		this.selfies = selfies;
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

	public void tirarSelfies(int selfies) {
		this.selfies += selfies;
	}

	public String tecla() {
		if (keyBoard) {
			return "Sim";
		} else {
			return "Não";
		}
	}

}
