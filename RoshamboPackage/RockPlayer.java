package RoshamboPackage;

public class RockPlayer extends Player {

	@Override
	public String generateRoshambo() {
		
		return getRock();
	}
	public String rock = "rock";
	
/*	public RockPlayer(String rock) {
		setRock(rock);*/
	
	public RockPlayer() {
		setRock("rock");
	}
	
	public String getRock() {
		return "rock";
	}
	public void setRock(String rock) {
		this.rock = rock;
	}
	public void printRock(){
		System.out.println("Player1 chose : " + getRock());
}
}
	
