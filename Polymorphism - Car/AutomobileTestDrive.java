class AutomobileTestDrive {
	public static void main (String args[]) {
		Automobile[] a = new Automobile[4];
		
		a[0] = new Sedan();
		a[1] = new Coupe();
		a[2] = new Pickup();
		a[3] = new SUV();
		
		a[0].setcolor("Black");
		System.out.println(a[0].getcolor());
	}
}

abstract class Automobile {
	String color;
	String style;
	int load;
	int hp;
	int doors;
	
	public String getstyle() {
		return style;
	}
	
	public void setcolor(String c) {
		color = c;
	}
	
	public String getcolor() {
		return color;
	}
	
	/*
	public void Turn(String dir) {
		if (dir.equals("right")) {
			System.out.println(style + " is turning right.");
		} else {
			System.out.println(style + " is turning left.");
		}
	}
	*/
	
	abstract void accel(int time);
	abstract void tow();
	abstract void honk();
}

abstract class Car extends Automobile {
	public void honk() {
		System.out.println("Beep beep.");
	}
	public void tow() {
		System.out.println("tow with hitch.");
	}
}

abstract class Truck extends Automobile {
	public void honk() {
		System.out.println("AHOOGA");
	}
	public void tow() {
		System.out.println("tow with flatbed.");
	}
}

class Sedan extends Car {
	public Sedan() {
		super();
		style = "Sedan";
	}
	
	public void accel(int time) {
		int speed = time * 15;
		System.out.println("Speed is " + speed + " mph.");
	}
}

class Coupe extends Car {
	public void accel(int time) {
		int speed = time * 20;
		System.out.println("Speed is " + speed + " mph.");
	}
}

class Pickup extends Truck {
	public void accel(int time) {
		int speed = time * 5;
		System.out.println("Speed is " + speed + " mph.");
	}
}

class SUV extends Truck {
	public void accel(int time) {
		int speed = time * 10;
		System.out.println("Speed is " + speed + " mph.");
	}
}