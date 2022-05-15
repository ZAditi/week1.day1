package week1.day1.assignment;

public class Car {
	
	public void applyBreak() {
		System.out.println("Break Applied");
	}
	
	public void applyGear() {
		System.out.println("Gear Changed");
	}
	
	public void switchonAc() {
		System.out.println("AC Switched On");
	}
	
	public void applyAccelerate() {
		System.out.println("Accelerated");
	}
	
		public static void main(String[] args) {
		Car car1 = new Car();
		car1.applyBreak();
		car1.applyGear();
		car1.switchonAc();
		car1.applyAccelerate();
	}

}
