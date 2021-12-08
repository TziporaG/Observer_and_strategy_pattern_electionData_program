package assignment5_electionStats_GutmannNierman;

public class ElectoralRaisedRepublican implements IElectoral {

	private int counter = 0;

	//There is a republican favoring strategy that assumes one of the states 
	//(always the same one, this should be hardcoded in) will go republican 
	//regardless of the polling data
	public int determineElectoral(State stats, int dem, int rep) {

		counter++;

		// Always give the first state to the Reps
		if (counter == 1) {
			return 1;
		}

		else if (dem > rep) {
			return -1;
		}

		else if (rep > dem) {
			return 1;
		}

		// split the electoral votes in half if there is a tie
		else {
			return 0;
		}

	}

}
