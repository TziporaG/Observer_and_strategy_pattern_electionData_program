package assignment5_electionStats_GutmannNierman;

public class PopularLoweredRepublican implements IPopularRepublican {

	private int currHighestRepublicanPopular = 0;
	private int prevHighestRepublicanPopular = 0;

	public int countVotes(State state) {

		// if a state's Republican vote count is higher than the current highest vote
		// count,
		// return the previous state's highest vote count, which will therefore not
		// count the
		// actual highest republican vote count
		if (state.getRepublicanPopular() > this.currHighestRepublicanPopular) {

			prevHighestRepublicanPopular = currHighestRepublicanPopular;
			currHighestRepublicanPopular = state.getRepublicanPopular();
			return prevHighestRepublicanPopular;
		}

		return state.getRepublicanPopular();
	}
}
