package assignment5_electionStats_GutmannNierman;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Observer_1_FavoringRepublican extends Display {

	public Observer_1_FavoringRepublican(Observable electionData) {

		super(electionData);
		electionData.addObserver(this);

		popularDemocratic = new PopularLoweredDemocratic();
		popularRepublican = new PopularHonestRepublican();
		determineElectoral = new ElectoralSimple();

	}

	@Override
	public void printStrategyName() {

		System.out.println("\n#1) Republican Favoring Display");

	}

}
