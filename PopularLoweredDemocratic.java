package assignment5_electionStats_GutmannNierman;

public class PopularLoweredDemocratic implements IPopularDemocratic {

	public int countVotes(State state) {
		
		//lowers the Democratic vote count by 5%
		return (int) Math.round(state.getDemocraticPopular() * .95);
	}
}
