package New;

public class UseVehicle {
	public static void main(String[]args) {
		Bens bens=new Bens();
		System.out.println(bens.price(2500000));
		
		System.out.println(bens.brand()+" "+bens.price()+" "+bens.colour()+" "+bens.isAirBag());
	}

}
