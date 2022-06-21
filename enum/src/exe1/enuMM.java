package exe1;

public enum enuMM {
	
	BRASIL(55),CANADÁ(1),MÉXICO(52),CUBA(53);
	
	final int ddd;

	private enuMM(int ddd) {
		this.ddd = ddd;
	}

	public int getDdd() {
		return ddd;
	}
	
	
}
