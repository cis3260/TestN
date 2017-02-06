package thirdclass;
 
public class Car {
	
	int location = 0;
	int gear = 1;
	
	void move(int delta){
		location += delta;
	}
	
	int reportLocation(){
		return location;
	}
	
	double reportLocationInKM(){
		return location*1.6;
	}
	
	boolean isAway(){
		if (location == 0){
			return false;
		}
		else {
			return true;
		}
	}
	
	void changeGear(int newGear) {
		gear = newGear;
	}
	
	String reportGear(){
		switch (gear) {
		case 1:
			return "The car is in first gear";
		case 2:
			return "The car is in second gear";
		case 3:
			return "The car is in third gear";
		case 4:
			return "The car is in forth gear";
		case 5:
			return "The car is in fifth gear";
		case 6:
			return "The car is in sixth gear";
		default:
			return "Not in 1 to 6 gear!!!";
		}
	}
	
	String honk(){
		return "Honkkkkk!!!!";
	}
	
	
	
}
