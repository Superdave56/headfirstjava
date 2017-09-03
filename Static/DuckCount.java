class Duck {
	public int size;
	public static int duckCount;
	
	public Duck() {
		duckCount++;
	}
	
}

class DuckTestDrive {
	public static void main(String[] args) {
		Duck one = new Duck();
		System.out.println("Duck Count is " + Duck.duckCount);
		
		one = new Duck();
		System.out.println("Duck Count is " + Duck.duckCount);
	}
}