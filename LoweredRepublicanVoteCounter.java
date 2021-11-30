package assignment5_electionStats_GutmannNierman;

public class LoweredRepublicanVoteCounter implements IRepublicanVoteCounter {

	private int currHighestRepublicanVoteCount = 0;
	private int prevHighestRepublicanVoteCount = 0;
	
	public int countVotes(State state) {
		
		//if a state's Republican vote count is higher than the current highest vote count,
		//return the previous state's highest vote count, which will therefore not count the 
		//actual highest republican vote count
		if(state.getRepublicanVoteCount() >  this.currHighestRepublicanVoteCount) {
			
				prevHighestRepublicanVoteCount = currHighestRepublicanVoteCount;
				currHighestRepublicanVoteCount = state.getRepublicanVoteCount();
				return prevHighestRepublicanVoteCount;
		}
		
		return state.getRepublicanVoteCount();
	}
}
