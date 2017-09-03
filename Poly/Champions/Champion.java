class ChampionTestDrive {
	public static void main (String args[]) {
		Champion[] champ = new Champion[8];
		champ[0] = new Champion();
		champ[1] = new Tank();
		champ[2] = new Mage();
		champ[3] = new Marksman();
		
		/*
		champ[0].Attack();
		champ[1].Attack();
		champ[2].Attack();
		champ[3].Attack();
		*/

		champ[0].Dance();
		champ[1].Dance();
		champ[2].Dance();
		
		/*
		System.out.println(champ[1].getAD(10));
		System.out.println(champ[2].getAD(10));
		System.out.println(champ[3].getAD(10));
		*/
	}
}

class Champion {
	String DmgType;
	int TotalHP;
	int TotalMP;
	int TotalAD;
	int TotalAP;
	
	public void Dance() {
		System.out.println("Do the stanky leg.");
	}
	
	public void Attack() {
		System.out.println("Ambiguous form of autoattack.");
	}
	
	public void Ability() {
		System.out.println("Ambiguous form of ability.");
	}
	
	/*
	public int getHP(int base) {
	}
	
	public int getMP(int base) {
	}
	*/
	
	public int getAD(int base) {
	return TotalAD;
	}
	
	public int getAP(int base) {
	return TotalAD;
	}
}

class Tank extends Champion {
	public void Attack() {
		System.out.println("Swing sword.");
	}
	
	public int getAD(int base) {
		TotalAD = base + 100;
		return TotalAD;
	}
	
	public int getAP(int base) {
		TotalAP = base + 10;
		return TotalAD;
	}
}

class Mage extends Champion {
	public void Dance() {
		System.out.println("Twerk twerk twerk.");
	}
	
	public void Attack() {
		System.out.println("Shoot energy.");
	}
	
	public int getAD(int base) {
		TotalAD = base + 10;
		return TotalAD;
	}
	
	public int getAP(int base) {
		TotalAP = base + 100;
		return TotalAD;
	}
}

class Marksman extends Champion {
	public void Attack() {
		System.out.println("Fire projectile.");
	}
	
	public int getAD(int base) {
		TotalAD = base + 200;
		return TotalAD;
	}
	
	public int getAP(int base) {
		TotalAP = base + 10;
		return TotalAD;
	}
}

class Vanguard extends Tank {
}

class Warden extends Tank {
}

class Burst extends Mage {
}

class Battle extends Mage {
}