package RoshamboPackage;
import java.util.Random;

public class Player2 extends Player {

	@Override
	public String generateRoshambo() {
		return listRan;// getRandom();
	}
	public Player2() {

	}
	/*public Player2 (String rock, String scissors, String paper) {
		setRock(rock);
		setScissors(scissors);
		setPaper(paper);*/
	
	private String rock = "rock";
	private String scissors = "scissors";
	private String paper = "paper";


	public String getRock() {
		return rock;
	}
	public void setRock(String rock) {
		this.rock = rock;
	}
	public String getScissors() {
		return scissors;
	}
	public void setScissors(String scissors) {
		this.scissors = scissors;
	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	//get random choice
	String [] list = {"paper", "scissors", "rock"}; //{getRock(), getScissors(),  getPaper()}
	
	Random ran = new Random();
	String listRan = list[ran.nextInt(list.length)];
	
	public String getRandom(){
	if (listRan.equalsIgnoreCase(getRock())){
		return "rock";
	}
	else if (listRan.equalsIgnoreCase(getScissors())){
		return "scissors";
	}
	else {
		return "paper";
	}
	}
				
	public void printComp(){
		System.out.println("The computer chose: " + listRan);
}

}


