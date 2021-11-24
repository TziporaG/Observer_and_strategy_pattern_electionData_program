package assignment5_electionStats_GutmannNierman;


public class DemocraticDisplay implements IDemocraticDisplay {
	
	public String displayVotes(State state) {
		
		StringBuilder display = new StringBuilder("Democratic: ");
		display.append(state.getDemocraticVoteCount());
		
		
		return display.toString();
		
	}

}
