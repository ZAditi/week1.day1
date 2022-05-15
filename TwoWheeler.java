package week1.day1.assignment;

public class TwoWheeler {

	int noOfWheels = 4;
	short noOfMirrors= 3;
	long chassisNumber= 123456789;
	boolean isPunctured= false;
	String bikeName = "Duke";
	double runningKm= 4500076;
	
	
	public static void main(String[] args) {
	 TwoWheeler bike = new TwoWheeler();
	 System.out.println(bike.noOfWheels);
	 System.out.println(bike.noOfMirrors);
	 System.out.println(bike.chassisNumber);
	 System.out.println(bike.isPunctured);
	 System.out.println(bike.bikeName);
	 System.out.println(bike.runningKm);
	 
	}

}
