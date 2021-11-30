package assignment5_electionStats_GutmannNierman;

import java.util.Observable;


@SuppressWarnings("deprecation")
public class HonestObserver_5 extends Display {

		public HonestObserver_5(Observable electionData) {
				
				super(electionData);
				electionData.addObserver(this);
				
				democraticVoteCounter = new HonestDemocraticVoteCounter();
				republicanVoteCounter = new HonestRepublicanVoteCounter();
				determineElectoral = new SimpleDetermineElectoral();


			}
		
		@Override
		public void printStrategyName() {
			
			System.out.println("\n#5) Honest Display");
			
		}

}
