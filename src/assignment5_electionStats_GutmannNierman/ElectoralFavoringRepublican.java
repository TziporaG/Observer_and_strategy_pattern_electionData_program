package assignment5_electionStats_GutmannNierman;

public class ElectoralFavoringRepublican implements IElectoral {

	private int currSmallestDifference = Integer.MAX_VALUE;
	private int prevSmallestDifference = Integer.MAX_VALUE;

	// There is a second republican favoring strategy that considers the state where
	// the democrat has the smallest lead to be "too close to call" and splits the
	// electoral votes giving half to the democrat and half to the republican (and
	// in the event of an odd number it gives the extra vote to the republican of
	// course)
	public int determineElectoral(State state, int dem, int rep) {

		// Only skew the state if the Dem won
		if (dem > rep) {
			if (dem - rep < currSmallestDifference) {
				prevSmallestDifference = currSmallestDifference;
				currSmallestDifference = dem - rep;

				// And only skew it if the Dems won by the smallest margin so far
				if (prevSmallestDifference != Integer.MAX_VALUE) {
					return -3;
				}

				return 0;
			}

			// If the Dems won but it's not by the smallest margin
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
