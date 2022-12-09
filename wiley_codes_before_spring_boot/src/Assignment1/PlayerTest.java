package Assignment1;

import java.util.ArrayList;
import java.util.List;

/*
Here we have defined an abstract class Player and 3 sub-classes Bowler, Batsmen and WicketKeeper. 
We have added additional member variables and methods/functions in individual sub-classes. 
We have also created a constructor which initializes the member variables of the each player. 
The print method overrides the print method in the super-class Player and also add additional details
 for Bowler, Batsmen and WicketKeeper. 

Create an array of 11 players and initialized them with either Batsmen, Bowler and WicketKeeper 
and print their their details. Please make sure, we have made the Player class abstract such that no 
instance of that class can be created.

 */

abstract class Player {
	String name;
	boolean isBatsmen, isBowler, isWicketKeeper;

	public Player() {
		this(null, false, false, false);
	}

	public Player(String name) {
		this(name, false, false, false);
	}

	public Player(String name, boolean isBatsmen, boolean isBowler, boolean isWicketKeeper) {
		this.name = name;
		this.isBatsmen = isBatsmen;
		this.isBowler = isBowler;
		this.isWicketKeeper = isWicketKeeper;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBatsmen() {
		return isBatsmen;
	}

	public void setBatsmen(boolean isBatsmen) {
		this.isBatsmen = isBatsmen;
	}

	public boolean isBowler() {
		return isBowler;
	}

	public void setBowler(boolean isBowler) {
		this.isBowler = isBowler;
	}

	public boolean isWicketKeeper() {
		return isWicketKeeper;
	}

	public void setWicketKeeper(boolean isWicketKeeper) {
		this.isWicketKeeper = isWicketKeeper;
	}

	public void printDetails() {
		System.out.println("----------------------------------------------------");
		System.out.println("Player name : " + this.getName());
		System.out.println("Player is a bowler : " + this.isBowler());
		System.out.println("Player is a batsmen : " + this.isBatsmen());
		System.out.println("Player is a wicket keeper : " + this.isWicketKeeper());
	}
}

class Bowler extends Player {
	double averageBowlingSpeed;
	String bowlingType;
	int totalWicketsTaken;

	public Bowler() {
	}

	public Bowler(String name) {
		super(name, false, true, false);
	}

	public Bowler(String name, double averageBowlingSpeed, String bowlingType, int totalWicketsTaken) {
		super(name);
		this.averageBowlingSpeed = averageBowlingSpeed;
		this.bowlingType = bowlingType;
		this.totalWicketsTaken = totalWicketsTaken;
	}

	public double getAverageBowlingSpeed() {
		return averageBowlingSpeed;
	}

	public void setAverageBowlingSpeed(double averageBowlingSpeed) {
		this.averageBowlingSpeed = averageBowlingSpeed;
	}

	public String getBowlingType() {
		return bowlingType;
	}

	public void setBowlingType(String bowlingType) {
		this.bowlingType = bowlingType;
	}

	public int getTotalWicketsTaken() {
		return totalWicketsTaken;
	}

	public void setTotalWicketsTaken(int totalWicketsTaken) {
		this.totalWicketsTaken = totalWicketsTaken;
	}

	@Override
	public String toString() {
		return "Bowler [name=" + name + ", averageBowlingSpeed=" + averageBowlingSpeed + ", bowlingType=" + bowlingType
				+ ", totalWicketsTaken=" + totalWicketsTaken + "]";
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Player average bowling speed : " + this.getAverageBowlingSpeed());
		System.out.println("Player bowling type : " + this.getBowlingType());
		System.out.println("Total wickets taken by player : " + this.getTotalWicketsTaken());
		System.out.println("----------------------------------------------------");
	}

}

class Batsmen extends Player {
	double averageStrikeRate;
	int totalRuns;

	public Batsmen() {
	}

	public Batsmen(String name) {
		super(name, true, false, false);
	}

	public Batsmen(String name, double averageStrikeRate, int totalRuns) {
		super(name, true, false, false);
		this.averageStrikeRate = averageStrikeRate;
		this.totalRuns = totalRuns;
	}

	public double getAverageStrikeRate() {
		return averageStrikeRate;
	}

	public void setAverageStrikeRate(double averageStrikeRate) {
		this.averageStrikeRate = averageStrikeRate;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	@Override
	public String toString() {
		return "Batsmen [name=" + name + ", averageStrikeRate=" + averageStrikeRate + ", totalRuns=" + totalRuns + "]";
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Player's average strike rate : " + this.getAverageStrikeRate());
		System.out.println("Player's total runs : " + this.getTotalRuns());
		System.out.println("----------------------------------------------------");
	}

}

class WicketKeeper extends Player {
	int numberOfStumpingsDone;

	public WicketKeeper() {
	}

	public WicketKeeper(String name) {
		super(name, false, false, true);
	}

	public WicketKeeper(String name, int numberOfStumpingsDone) {
		super(name, false, false, true);
		this.numberOfStumpingsDone = numberOfStumpingsDone;
	}

	public int getNumberOfStumpingsDone() {
		return numberOfStumpingsDone;
	}

	public void setNumberOfStumpingsDone(int numberOfStumpingsDone) {
		this.numberOfStumpingsDone = numberOfStumpingsDone;
	}

	@Override
	public String toString() {
		return "WicketKeeper [name=" + name + ", numberOfStumpingsDone=" + numberOfStumpingsDone + "]";
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Total number of stumpings done : " + this.getNumberOfStumpingsDone());
		System.out.println("----------------------------------------------------");
	}

}

public class PlayerTest {

	public static void main(String[] args) {
		// Batsmen(String name, double averageStrikeRate, int totalRuns)
		// Bowler(String name, double averageBowlingSpeed, String bowlingType, int totalWicketsTaken)
		// WicketKeeper(String name, int numberOfStumpingsDone)
		List<Player> players = new ArrayList();
		players.add(new Batsmen("king", 25.2, 1156));
		players.add(new Batsmen("jack", 21.3, 1165));
		players.add(new Batsmen("kochar", 22.6, 1356));
		players.add(new Batsmen("john", 24.8, 1652));
		players.add(new Batsmen("kochar", 24.6, 2354));
		players.add(new Bowler("rahul", 75.6, "Fast", 65));
		players.add(new Bowler("dravid", 76.8, "Fast", 66));
		players.add(new Bowler("surya", 78.3, "Apin", 69));
		players.add(new Bowler("shiva", 71.2, "Yorker", 75));
		players.add(new Bowler("abhay", 88.3, "Spin", 65));
		players.add(new WicketKeeper("dhoni", 1156));

		for (Player i : players) {
			i.printDetails();
		}

	}

}
