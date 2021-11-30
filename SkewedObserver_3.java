package assignment5_electionStats_GutmannNierman;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class SkewedObserver_3 extends Display {
	
	public SkewedObserver_3(Observable electionData) {
		
		super(electionData);
		electionData.addObserver(this);
			
		democraticVoteCounter = new HonestDemocraticVoteCounter();
		republicanVoteCounter = new LoweredRepublicanVoteCounter();
		determineElectoral = new RaisedRepublicanDetermineElectoral();
		
		}

	@Override
	public void printStrategyName() {

	System.out.println("\n#3) Democratic Favoring Popular, Republican Favoring Electoral Display");

	}

	
	
	

}
