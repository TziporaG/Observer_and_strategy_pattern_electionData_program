package assignment5_electionStats_GutmannNierman;

import java.util.Observable;

public class Observer_4_RaisingDemocraticPopular extends Display {

	public Observer_4_RaisingDemocraticPopular(Observable electionData) {

		super(electionData);
		electionData.addObserver(this);

		popularDemocratic = new PopularHonestDemocratic();
		popularRepublican = new PopularLoweredRepublican();
		determineElectoral = new ElectoralRealNumbers();

	}

	@Override
	public void printStrategyName() {

		System.out.println("\n#4) Democratic Favoring Popular, Real Electoral Display");

	}

}
