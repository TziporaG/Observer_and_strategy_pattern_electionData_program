package assignment5_electionStats_GutmannNierman;

public class ElectoralRaisedDemocratic implements IElectoral {

	private int currHighestElectoral = 0;
	private int currHighestElectoralWinner = 0;
	private int prevHighestElectoralWinner = 0;

	//There is a democrat favoring strategy that assumes that the state with the 
	//most electoral votes will go to the democrat regardless of polling data
	public int determineElectoral(State state, int dem, int rep) {

		// Only skew the votes if the state has the highest number of electoral votes
		if (state.getElectoralVoteCount() > currHighestElectoral) {
			prevHighestElectoralWinner = currHighestElectoralWinner;

			// Check whether the Dems or Reps won the state with the highest number of electoral
			// votes
			currHighestElectoralWinner = dem > rep ? -1 : 1;
			currHighestElectoral = state.getElectoralVoteCount();

			// If the Reps won, give the win to the Dems, but also undo the previous skew
			if (prevHighestElectoralWinner == 1) {
				return -2;
			}

			// If the Dems won, give the win to the Dems
			else {
				return -1;
			}
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
