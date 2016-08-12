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
	private String name = "";
	// private String rock = "Rock";
	// private String paper = "Paper";
	// private String scissors = "Scissors";

	public Human(String inputMove, String name) {//, String name) {
		setinputMove(inputMove);
		setName(name);
	
		//setName(name);
		// setName(name);
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		System.out.println(getName() +": ");
	}

	{

	}

	public boolean equalsIgnoreCase(String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
