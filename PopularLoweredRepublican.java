package assignment5_electionStats_GutmannNierman;

public class PopularLoweredRepublican implements IPopularRepublican {

	private int currHighestRepublicanPopular = 0;
	private int prevHighestRepublicanPopular = 0;

	public int countVotes(State state) {
		
		//lowers Republican vote count by ignoring the count of the state with the highest vote
		if (state.getRepublicanPopular() > this.currHighestRepublicanPopular) {
			
			// if the current state's Republican vote count is higher than the previous 
			// highest vote count, return the previous state's vote count, disqualifying the
			// count of the state with the highest republican vote count
			prevHighestRepublicanPopular = currHighestRepublicanPopular;
			currHighestRepublicanPopular = state.getRepublicanPopular();
			return prevHighestRepublicanPopular;
		}

		return state.getRepublicanPopular();
	}
}
