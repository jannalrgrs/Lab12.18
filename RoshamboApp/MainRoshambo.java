package RoshamboApp;

import java.util.Scanner;

import RoshamboPackage.Human;
import RoshamboPackage.Player2;
import RoshamboPackage.RockPlayer;

public class MainRoshambo {

	public static void main(String[] args) {

		String inputMove = "";
		Scanner scan1 = new Scanner(System.in);

		System.out.println("Welcome to rock Paper scissors");
		System.out.println("Enter your name");
		inputMove = scan1.nextLine();

		System.out.println("Would you like to play the Sharks or the Jets? (j/ s)");
		String opponent = scan1.nextLine();

		System.out.println("Choose Rock, Paper, or Scissors (rock/paper/scissors)");

		Human hu = new Human();
		String h = hu.generateRoshambo();
		System.out.println("you choose: " + h);

		RockPlayer rp = new RockPlayer();
		String selection = rp.generateRoshambo();

		Player2 p2 = new Player2();
		String rc = p2.generateRoshambo();

		if (opponent.equalsIgnoreCase("j")) {
			System.out.println(selection);

			if (h.equals(selection)) {
				System.out.println("It's a tie!");
			} else if (h.equals("paper")) {
				System.out.println("Paper covers rock, you win");
			} else if (h.equals("rock")) {
				System.out.println("rock crushes scissors, you lose");
			}
		}

		if (opponent.equalsIgnoreCase("s")) {
			System.out.println("The Sharks choose: " + rc);
			if (h.equals(rc)) {
				System.out.println("It's a tie!");// this works
			}

			else if (h.equalsIgnoreCase("rock")) { // this doesn't

				if (rc.equalsIgnoreCase("paper")) {
					// rock is covered by paper
					System.out.println("Paper covers rock, you lose");
				} else if (rc.equalsIgnoreCase("scissors")) {
					System.out.println("Rock crushes scissors, you win!");
				}

				else if (h.equalsIgnoreCase("paper")) {
					if (rc.equalsIgnoreCase("scissors")) {
						System.out.println("scissors cuts through paper, you lose");
					} else if (rc.equalsIgnoreCase("rock")) {
						System.out.println("Paper covers rock, you win");
					}
				} else if (h.equalsIgnoreCase("scissors")) {
					if (rc.equalsIgnoreCase("rock")) {
						System.out.println("Rock crushes scissors, you lose");
					} else if (rc.equalsIgnoreCase("paper")) {
						System.out.println("scissors cuts through paper, you lose");
					}
				}
			}
		}
	}
}
