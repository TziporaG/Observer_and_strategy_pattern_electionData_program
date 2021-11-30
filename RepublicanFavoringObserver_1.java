package assignment5_electionStats_GutmannNierman;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class RepublicanFavoringObserver_1 extends Display {
	
		public RepublicanFavoringObserver_1(Observable electionData) {
					
				super(electionData);
				electionData.addObserver(this);
					
				democraticVoteCounter = new LoweredDemocraticVoteCounter();
				republicanVoteCounter = new HonestRepublicanVoteCounter();
				determineElectoral = new SimpleDetermineElectoral();

				}
		
		@Override
		public void printStrategyName() {
			
			System.out.println("\n#1) Republican Favoring Display");
			
		}

	}


