package assignment5_electionStats_GutmannNierman;

public class ElectoralDisplay implements IElectoralDisplay {

	
public String displayVotes(State state) {
		
		StringBuilder display = new StringBuilder("Electoral: ");
		display.append(state.getElectoralVoteCount());
		
		
		return display.toString();
		
	}

}
