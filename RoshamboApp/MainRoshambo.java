package RoshamboApp;

import java.util.Scanner;

import RoshamboPackage.Human;
import RoshamboPackage.Player2;
import RoshamboPackage.RockPlayer;

public class MainRoshambo {

	public static void main(String[] args) {

		String inputMove = "";
		Scanner scan1 = new Scanner(System.in);
		String choice = "y";
		
	
		System.out.println("Welcome to rock Paper scissors");
		System.out.println("Enter your name");
		String name = scan1.nextLine();

		
		while (choice.equalsIgnoreCase("y")) {
			
		System.out.println("Would you like to play the Sharks or the Jets? (j/ s)");
		String opponent = scan1.nextLine();

			System.out.println("Choose Rock, Paper, or Scissors (rock/paper/scissors)");
			
			Human hu = new Human();
			String h = hu.generateRoshambo();
			//System.out.println(inputMove + ": "  + h);

			RockPlayer rp = new RockPlayer();
			String selection = rp.generateRoshambo();

			Player2 p2 = new Player2();
			String rc = p2.generateRoshambo();
			
		if (opponent.equalsIgnoreCase("j")) {
			System.out.println(name + ": "  + h);
			
			System.out.println("The Jets: " + selection);
			if (h.equals(selection)) {
				System.out.println("It's a tie!");
			} 
			else if (h.equals("paper")) {
				System.out.println("Paper covers rock, you win.");
			} 
			else if (h.equals("rock")) {
				System.out.println("rock crushes scissors, you lose.");
			}
		}

		if (opponent.equalsIgnoreCase("s")) {
			System.out.println(name + ": "  + h);
			System.out.println("The Sharks: " + rc);
			if (h.equals(rc)) {
				System.out.println("It's a tie!");// this works
			}
			else if (h.equals("rock")) { 

				if (rc.equals("paper")) {
					System.out.println("Paper covers rock, you lose.");
				} else if (rc.equals("scissors")) {
					System.out.println("Rock crushes scissors, you win!");
				}
				}

				else if (h.equals("paper")) {
					
					if (rc.equals("scissors")) {
						System.out.println("scissors cuts through paper, you lose");// this doesn't
					} else if (rc.equals("rock")) {
						System.out.println("Paper covers rock, you win");
					}
				} 
				else if (h.equals("scissors")) {
					
					if (rc.equals("rock")) {
						System.out.println("Rock crushes scissors, you lose");
					} else if (rc.equals("paper")) {
						System.out.println("scissors cuts through paper, you lose");
					}
					
					}
				
				}
			System.out.println("Play Again? (y/n)");
			choice = scan1.nextLine();
			}
	
		
		
	}
}
