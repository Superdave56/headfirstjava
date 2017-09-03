public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame1() {
		p1 = new Player(); //create three Player objects and assign them
		p2 = new Player(); //  to the instance variables.
		p3 = new Player();
		
		int guessp1 = 0; //declare three variables to hold Player guesses
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false; //declare three variables to hold true
		boolean p2isRight = false; //  or false based on guess.
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10); //make a target number for players to guess
		System.out.println("I'm thinking of a number between 1 and 9...");
		
		while(true) {
			System.out.println("Starting Game 1");
			System.out.println("Number to guess is " + targetNumber);
			
			p1.guess(); //call each player's guess() method
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number; //get each player's guess by accessing the number
			guessp2 = p2.number; //  variable of each player.
			guessp3 = p3.number;
			
			System.out.println("Player 1 guessed " + guessp1);
			System.out.println("Player 2 guessed " + guessp2);
			System.out.println("Player 3 guessed " + guessp3);
			
			if (guessp1 == targetNumber) { //if a player's guess is right, set that player's
				p1isRight = true;		   //  variable to true.
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) { //Execute if player one, two, or three is right.
				System.out.println("We have a winner!");
				System.out.println("Player 1 guessed " + guessp1 + " which is " + p1isRight);
				System.out.println("Player 2 guessed " + guessp2 + " which is " + p2isRight);
				System.out.println("Player 3 guessed " + guessp3 + " which is " + p3isRight);
				System.out.println("Game 1 is over.");
				break; //break the loop since game is over.
				
			} else { //repeat the loop until someone guesses right.
				System.out.println("Players will have to try again.");
			}
		}
	}
/*
	public void startGame2() {
		p1 = new Player(); //create three Player objects and assign them
		p2 = new Player(); //  to the instance variables.
		p3 = new Player();
		
		int guessp1 = 0; //declare three variables to hold Player guesses
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false; //declare three variables to hold true
		boolean p2isRight = false; //  or false based on guess.
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10); //make a target number for players to guess
		System.out.println("I'm thinking of a number between 1 and 9...");
		
		while(true) {
			System.out.println("Starting Game 2");
			System.out.println("Number to guess is " + targetNumber);
			
			p1.guess(); //call each player's guess() method
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number; //get each player's guess by accessing the number
			guessp2 = p2.number; //  variable of each player.
			guessp3 = p3.number;
			
			System.out.println("Player 1 guessed " + guessp1);
			System.out.println("Player 2 guessed " + guessp2);
			System.out.println("Player 3 guessed " + guessp3);
			
			if (guessp1 == targetNumber) { //if a player's guess is right, set that player's
				p1isRight = true;		   //  variable to true.
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) { //Execute if player one, two, or three is right.
				System.out.println("We have a winner!");
				System.out.println("Player 1 guessed " + guessp1 + " which is " + p1isRight);
				System.out.println("Player 2 guessed " + guessp2 + " which is " + p2isRight);
				System.out.println("Player 3 guessed " + guessp3 + " which is " + p3isRight);
				System.out.println("Game 2 is over.");
				break; //break the loop since game is over.
				
			} else { //repeat the loop until someone guesses right.
				System.out.println("Players will have to try again.");
			}
		}
	}
*/
}