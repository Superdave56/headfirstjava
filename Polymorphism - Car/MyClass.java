class MyClass {
	public static void main (String args[]) {

		Cookie a = new Oreo();
		((Oreo)a).twist();
		//a.InterfaceMethod();
	}
}

class Cookie {
	public void dunk(){
		System.out.println("Dunk in milk.");
	}
}

class Oreo extends Cookie {
	public void twist() {
		System.out.println("Twist apart.");
	}
	
	/*
	public void InterfaceMethod() {
		System.out.println("Goodnight world");
	}
	*/
}