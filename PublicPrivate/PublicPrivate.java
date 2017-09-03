class Dog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }
}

class DogTestDrive {

    public static void main (String [] args) {
        Dog one = new Dog();
        Dog two = new Dog();

        one.setSize(60);
        two.setSize(30);

        System.out.println("Dog one size: " + one.getSize());
        System.out.println("Dog two size: " + two.getSize()); 
		//System.out.println("Dog private size: " + one.size);
		// will not work because size instance variable is private.
    }
}