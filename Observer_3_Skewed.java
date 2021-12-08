package assignment5_electionStats_GutmannNierman;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Observer_3_Skewed extends Display {

	public Observer_3_Skewed(Observable electionData) {

		super(electionData);
		electionData.addObserver(this);

		popularDemocratic = new PopularHonestDemocratic();
		
		//uses an interface implementation that lowers the Republican popular vote count
		popularRepublican = new PopularLoweredRepublican();
		
		//uses an interface implementation that raises the Republican Electoral vote count
		determineElectoral = new ElectoralRaisedRepublican();

	}

	@Override
	public void printStrategyName() {

		System.out.println("\n#3) Democratic Favoring Popular, Republican Favoring Electoral Display");

	}

}
