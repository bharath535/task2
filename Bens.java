package New;

public class Bens extends Car {
	public String brand() {
		return "Bens";
	}
	public int price() {
		return  2500000;
	}
	public String price(int price) {
		if(price>200000) {
			return "Luxury Car";
		}
		else {
		return "Normal Car";
		}
	}
	public String colour() {
		return "White";
	}
}
