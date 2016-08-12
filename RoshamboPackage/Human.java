package RoshamboPackage;
import java.util.Scanner;

public class Human extends Player {

	@Override
	public String generateRoshambo() {
		Scanner scan1 = new Scanner(System.in);
		String inputMove = scan1.nextLine();
		return inputMove;
	}

	public String inputMove = ""; // inputMove and name will be inputMove by the
									// user
	// private String name;
	// private String rock = "Rock";
	// private String paper = "Paper";
	// private String scissors = "Scissors";

	public Human(String inputMove) {
		setinputMove(inputMove);
		// setName(name);
	}

	public Human() {
		setinputMove(inputMove);
	}
	

	// deleted set Human, conflict with the constructor
	public String getinputMove() {
		return inputMove;
	}

	public void setinputMove(String inputMove) {
		this.inputMove = inputMove;
	}

	public void printName() {
		System.out.println("You chose: " + getinputMove());
	}

	{

	}

	public boolean equalsIgnoreCase(String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
