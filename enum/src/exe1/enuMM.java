package exe1;

public enum enuMM {
	
	BRASIL(55),CANAD�(1),M�XICO(52),CUBA(53);
	
	final int ddd;

	private enuMM(int ddd) {
		this.ddd = ddd;
	}

	public int getDdd() {
		return ddd;
	}
	
	
}
