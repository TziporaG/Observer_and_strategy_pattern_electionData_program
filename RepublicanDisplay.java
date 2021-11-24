package assignment5_electionStats_GutmannNierman;

public class RepublicanDisplay implements IRepublicanDisplay{
	
public String displayVotes(State state) {
		
		StringBuilder display = new StringBuilder("Republican: ");
		display.append(state.getRepublicanVoteCount());
		
		
		return display.toString();
		
	}


}
