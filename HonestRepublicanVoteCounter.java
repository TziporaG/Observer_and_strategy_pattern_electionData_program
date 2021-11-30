package assignment5_electionStats_GutmannNierman;

public class HonestRepublicanVoteCounter implements IRepublicanVoteCounter {
	
	public int countVotes(State state) {
		
		return state.getRepublicanVoteCount();


	}

}
