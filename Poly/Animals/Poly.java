class Poly {
	public static void main(String args[]) {
		Animal[] a = new Animal[3];
		
		a [0] = new Animal();
		a [1] = new Canine();
		a [2] = new Feline();
		
		//a[0].eat();
		//a[1].eat();
		//a[2].eat();
		
		a[0].setWeight(32,18,"fat");
		System.out.println(a[0].getWeight());
	}
}

class Animal {
	String Color = "Animal brown";
	String Eyes = "Animal green";
	private int Weight;

	public void eat() {
		System.out.println("Eating like an animal.");
	}

	public void setWeight(int w) {
		Weight = w;
	}
	
	public void setWeight(int w, int e) {
		Weight = w + e;
	}
	
	public void setWeight(int w, int e, String i) {
		Weight = w + e + 100;
	}
	
	public int getWeight() {
		return Weight;
	}
	
	public void getColor() {
	}
	
	public void getEyes() {
	}
}

class Canine extends Animal {
	String Color = "Canine white";
	String Eyes = "Canine blue";
	
	public void eat() {
		System.out.println("Eating like a canine.");
	}
	
	public void getColor() {
		System.out.println(Color);
	}
	
	public void getEyes() {
		System.out.println(Eyes);
	}

}

class Feline extends Animal {
	public void eat() {
		System.out.println("Eating like a feline.");
	}
	
}