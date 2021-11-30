package assignment5_electionStats_GutmannNierman;

import java.util.Observable;

public class RaiseDemocraticPopularObserver_4 extends Display {
	
public RaiseDemocraticPopularObserver_4(Observable electionData) {
		
		super(electionData);
		electionData.addObserver(this);
			
		democraticVoteCounter = new HonestDemocraticVoteCounter();
		republicanVoteCounter = new LoweredRepublicanVoteCounter();
		determineElectoral = new DetermineElectoralWithRealNumbers();
		
		}

	@Override
	public void printStrategyName() {

	System.out.println("\n#4) Democratic Favoring Popular, Real Electoral Display");

	}

	

}
