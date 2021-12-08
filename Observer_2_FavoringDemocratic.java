package assignment5_electionStats_GutmannNierman;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Observer_2_FavoringDemocratic extends Display {

	public Observer_2_FavoringDemocratic(Observable electionData) {

		super(electionData);
		electionData.addObserver(this);
		
		popularDemocratic = new PopularHonestDemocratic();
		popularRepublican = new PopularHonestRepublican();
		
		//uses an interface implementation that raises the Electoral Democratic vote count
		determineElectoral = new ElectoralRaisedDemocratic();

	}

	@Override
	public void printStrategyName() {

		System.out.println("\n#2) Democratic Favoring Display");

	}
}
