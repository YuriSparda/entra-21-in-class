package application;

public class about {
	String name;
	String discription;
	double price;
	double off;
	public double Promo() {
		double disconto=off/100;
		double priceOFF=disconto*price;
		double valorFinal=priceOFF-price;
		
		return valorFinal;
	}
}
