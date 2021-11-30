package assignment5_electionStats_GutmannNierman;

public class LoweredDemocraticVoteCounter implements IDemocraticVoteCounter {
	
		public int countVotes(State state) {
			
			return (int) Math.round(state.getDemocraticVoteCount() * .95);
		}
}
