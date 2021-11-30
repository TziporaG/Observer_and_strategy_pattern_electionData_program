package assignment5_electionStats_GutmannNierman;

public class HonestDemocraticVoteCounter implements IDemocraticVoteCounter {
	
public int countVotes(State state) {
		
		return state.getDemocraticVoteCount();


	}

}
