package assignment5_electionStats_GutmannNierman;

public class ElectoralSimple implements IElectoral {

	//Takes whatever numbers are passed in, whether skewed or not
	public int determineElectoral(State state, int dem, int rep) {

		if (dem > rep) {
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
