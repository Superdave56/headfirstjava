// make a new class with a main function
// create a new method for the class
// create a reference variable and a new object for it
// create an instance variable from that object
// create an array
// create new objects for elements in that array and create instance variables
// access the instance variables and give them a value
// loop through the array and invoke the method

class Car {
	String model;
	
	public static void main (String [] args) {
		Car vehicle = new Car();
		vehicle.honk();
		vehicle.model = "Honda";
		
		Car[] myCars = new Car[3];
		myCars[0] = new Car();
		myCars[1] = new Car();
		myCars[2] = vehicle;
		
		myCars[0].model = "Lexus";
		myCars[1].model = "Dodge";
		
		int x = 0;
		while (x < myCars.length) {
			myCars[x].honk();
			x = x + 1;
		}
		
	}
	
	public void honk() {
		System.out.println(model + " is the model of the car.");
	}
}