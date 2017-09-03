class Final {
	public final int x = 2;
	
	public Final() {
		// x = 3;
	}
	
	public final void hello() {
		System.out.println("Hello world");
	}
}

class FinalEx extends Final {
	public void goodbye() {
		System.out.println("Goodbye world");
	}
	
	/* Can't override a final method
	public void hello() {
		System.out.println("Hi world");
	}
	*/
}

class FinalTestDrive {
	public static void main(String[] args) {
		Final one = new Final();
		FinalEx two = new FinalEx();
		
		two.hello();
	}
}