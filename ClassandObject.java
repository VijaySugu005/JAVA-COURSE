package Oops;


class Bike{
	
	String bikeName;
	String bikeModel;
	int bikeNo;
	
	
	public void displaybike() {
		
		System.out.println("Bike Name : "+bikeName);
		System.out.println("Bike Moodel : "+bikeModel);
		System.out.println("Bike No : "+bikeNo);
	}
	
	// Method Overloading 
	
	
	public void displaybikedetails(String ownerName) {
		
		System.out.println("Bike Owner Name : "+ownerName);
	}

}
class objectTest{
	
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		
		bike.bikeName="Pulsar 150";
		bike.bikeModel="July 2022";
		bike.bikeNo=258;
		
		bike.displaybike();
		
		bike.displaybikedetails("Vijay");
	}
}
