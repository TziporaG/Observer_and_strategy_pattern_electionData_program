package assignment5_electionStats_GutmannNierman;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Observer_5_Honest extends Display {

	public Observer_5_Honest(Observable electionData) {

		super(electionData);
		electionData.addObserver(this);

		//uses an interface implementations that are all honest
		popularDemocratic = new PopularHonestDemocratic();
		popularRepublican = new PopularHonestRepublican();
		determineElectoral = new ElectoralSimple();

	}

	@Override
	public void printStrategyName() {

		System.out.println("\n#5) Honest Display");

	}

}
