class VariableOutside {
	//int y = 1;
	
	public void go(int y) {
		int x = 0;
		int z = x + y;
		System.out.println(z);
	}
}

class VariableOutsideTest {
	public static void main (String[] args) {
		VariableOutside vo = new VariableOutside();
		vo.go(1);
	}
}