package assignment5_electionStats_GutmannNierman;

public class ElectoralRealNumbers implements IElectoral {

	public int determineElectoral(State state, int dem, int rep) {

		// This ensures there is no skew in the numbers being used, since they are being
		// accessed from the state class itself
		dem = state.getDemocraticPopular();
		rep = state.getRepublicanPopular();

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
