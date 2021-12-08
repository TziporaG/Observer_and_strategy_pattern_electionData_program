package assignment5_electionStats_GutmannNierman;

public class ElectoralFavoringDemocratic implements IElectoral {

	// There is a democrat favoring strategy that takes 2% of all republican 
	// votes in every state and makes them democrat votes instead (note that 
	// this only affects the electoral votes if there is a state within this margin)
	public int determineElectoral(State state, int dem, int rep) {

		int swappedVotes = (int) Math.round(rep * .02);

		// Give the 2% margin to the Dems, and base the electoral data off the skewed numbers
		dem += swappedVotes;
		rep -= swappedVotes;

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
