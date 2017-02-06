package thirdclass;

public class MyClass {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("Initial location: " + myCar.reportLocation());
		
		myCar.move(5);
		System.out.println("New location: " + myCar.reportLocation());
		System.out.println("New Location in KM: " + myCar.reportLocationInKM());
		
		System.out.println("Is the car away from its initial location? " + myCar.isAway());
		
		myCar.move(-5);
		System.out.println("New location: " + myCar.reportLocation());
		System.out.println("Is the car away from its initial location? " + myCar.isAway());

		System.out.println(myCar.honk());
		
		myCar.changeGear(6);
		System.out.println(myCar.reportGear());
		
		
	}

}
