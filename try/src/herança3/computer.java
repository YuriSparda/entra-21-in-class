package herança3;

public class computer {
	protected int ram;
	protected int storage;
	protected boolean keyBoard;

	public computer(int ram, int storage, boolean keyBoard) {
		super();
		this.ram = ram;
		this.storage = storage;
		this.keyBoard = keyBoard;
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

	public void ramAdd(int ram) {
		this.ram += ram;
	}

	public void storageAdd(int storage) {
		this.storage += storage;
	}

}
