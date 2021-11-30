package assignment5_electionStats_GutmannNierman;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class DemocraticFavoringObserver_2 extends Display {
	
	public DemocraticFavoringObserver_2(Observable electionData) {
		
	super(electionData);
	electionData.addObserver(this);
		
	democraticVoteCounter = new HonestDemocraticVoteCounter();
	republicanVoteCounter = new HonestRepublicanVoteCounter();
	determineElectoral = new RaisedDemocraticDetermineElectoral();
	
	}

@Override
public void printStrategyName() {

System.out.println("\n#2) Democratic Favoring Display");

}
}
