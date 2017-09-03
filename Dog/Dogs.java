class Dogs {
	String name;
	int size;
	
	void bark() {
		if (size > 50) {
			System.out.println(name + ": Woof! Woof!");
			}
		else if(size > 20) {
			System.out.println(name + ": Ruff! Ruff!");
			}
		else {
			System.out.println(name + ": Yip! Yip!");
			}
		}
}

class DogsTestDrive {
	public static void main (String[] args) {
	
	Dogs dog1 = new Dogs();
	Dogs dog2 = new Dogs();
	Dogs dog3 = new Dogs();
	
	dog1.name = "Tank";
	dog2.name = "Roscoe";
	dog3.name = "Piper";
	dog1.size = 60;
	dog2.size = 30;
	dog3.size = 5;
	
	dog1.bark();
	dog2.bark();
	dog3.bark();
	}
}