
public class MountainBike extends Bicycle {
	
	public String price = "100 yuan";
	
	public void printStates(){
		super.printStates();
		System.out.println("price: " + price);
	}
	
	public static void main(String[] args){
		MountainBike mountainBike = new MountainBike();
		mountainBike.printStates();
	}
}
